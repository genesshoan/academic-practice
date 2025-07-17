import java.util.Scanner;

public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        try {
            int number  = Integer.parseInt(input);
            String output = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + output);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
