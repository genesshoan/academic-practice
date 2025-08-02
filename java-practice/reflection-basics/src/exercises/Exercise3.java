package exercises;

import java.lang.reflect.Method;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            // Use a generic Class<?> instead of raw Class
            Class<?> arrayListClass = Class.forName("java.util.ArrayList");
            // Get all public methods (including inherited)
            Method[] methods = arrayListClass.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class found");
            e.printStackTrace();
        }
    }
}
