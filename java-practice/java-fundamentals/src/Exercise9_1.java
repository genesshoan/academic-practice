import java.util.Scanner;

public class Exercise9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two values to divide them (ex: 1  2): ");
        String input = sc.nextLine();
        try {
            String[] parts = input.split("\\s+");
            int first = Integer.parseInt(parts[0]);
            int second = Integer.parseInt(parts[1]);

            if (second != 0) {
                System.out.println(first / second);
            } else {
                System.out.println("Error! Divide by zero!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
}
