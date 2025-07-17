import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number == 0) {
                System.out.println("Zero");
            } else if (number > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
