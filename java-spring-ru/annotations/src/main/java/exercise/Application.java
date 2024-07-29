package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(exercise.annotation.Inspect.class)) {
                System.out.println("Method " + method.getName() + " returns a value of type " + method.getReturnType().getName());
		System.out.println("Method " + method.getPostalCode() + " returns a value of type " + method.getReturnType().getPostalCode());
            }
        }
        // END
    }
}