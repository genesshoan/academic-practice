package exercises;

import model.User;
import java.lang.reflect.Field;

public class Exercises5 {
    public static void main(String[] args) {
        // Create a new instance of User
        User user = new User("Jorge", "jorge1850@gmail.com", 100);

        // Get all declared fields of User
        Field[] fields = User.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                // Print field name and its value
                System.out.println(field.getName() + " = " + field.get(user));
            } catch (IllegalAccessException e) {
                System.out.println("Could not access field: " + field.getName());
                e.printStackTrace();
            }
        }
    }
}
