package exercises;

import model.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercises6 {
    public static void printClassInfo(Object obj){
        Class<?> c = obj.getClass();
        System.out.println("Class: " + c.getName());

        System.out.println("Methods");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("Fields: ");
        Field[] fields = c.getDeclaredFields(); // Get declared fields
        for (Field field : fields) {
            field.setAccessible(true); // Make field accesible
            try {
                System.out.println(field.getName() + ": " + field.get(obj));
            } catch (IllegalAccessException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        User user = new User("Pepe", "pepe@pepedev.com", 20);
        printClassInfo(user);
    }
}
