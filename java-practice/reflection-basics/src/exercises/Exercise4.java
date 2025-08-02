package exercises;

import model.User;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            // Get no non-parameter constructor and create a new instance without using the new operator
            User user = User.class.getDeclaredConstructor().newInstance();

            // Print the created object using toString method
            System.out.println("User created by reflection" + user);

            user.greet();
        } catch (Exception e) {
            // Handle all posible reflection exceptions
            e.printStackTrace();
        }
    }

}
