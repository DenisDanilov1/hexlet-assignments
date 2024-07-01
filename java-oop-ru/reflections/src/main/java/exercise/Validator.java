package exercise;

// BEGIN
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {

    public static List<String> validate(Object obj) {

        List<String> notValidFields = new ArrayList<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) == null) {
                        notValidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return notValidFields;
    }

 public static Map<String, List<String>> advancedValidate(Object obj) {
        Map<String, List<String>> errorMap = new HashMap<>();
        try {
            for (java.lang.reflect.Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String fieldName = field.getName();
                if (field.isAnnotationPresent(NotNull.class)) {
                    if (field.get(obj) == null) {
                        errorMap.computeIfAbsent(fieldName, k -> new ArrayList<>()).add("can not be null");
                    }
                }
                if (field.isAnnotationPresent(MinLength.class)) {
                    int minLength = field.getAnnotation(MinLength.class).value();
                    if (field.get(obj) != null && field.get(obj).toString().length() < minLength) {
                        errorMap.computeIfAbsent(fieldName, k -> new ArrayList<>()).add("length less than " + minLength);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return errorMap;
    }
}
// END
