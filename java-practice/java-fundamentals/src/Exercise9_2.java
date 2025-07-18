import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
