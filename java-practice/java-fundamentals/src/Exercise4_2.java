import java.util.Scanner;
public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int count = 0;

        do {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if (n > 0) {
                    sum += n;
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        } while (n != 0);

        if  (count == 0) {
            System.out.println("No numbers entered!");
        } else {
            System.out.println("The average is " + sum / count);
        }

        sc.close();
    }
}
