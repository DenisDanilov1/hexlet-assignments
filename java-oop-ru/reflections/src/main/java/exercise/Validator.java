package exercise;

import java.lang.reflect.Field;
// BEGIN
public class Validator {

    public static List<String> validate(Object obj) {

        List<String> notValidFields = new List<String>();
        for (Property property : obj.getProperties()) {
            if (property.isAnnotationPresent(NotNull.class) && property.getValue() == null) {
                notValidFields.add(property.getName());
            }
        }
        return notValidFields;
    }
}
// END
