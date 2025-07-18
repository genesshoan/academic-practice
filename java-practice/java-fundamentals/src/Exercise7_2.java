import java.util.Scanner;

public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String textOne = sc.nextLine();
        System.out.print("Enter a text: ");
        String textTwo = sc.nextLine();

        System.out.println("Compare with ==: " + (textOne ==  textTwo));
        System.out.println("Compare with .equals: " + textOne.equals(textTwo));
        System.out.println("Compare with .equalsIgnoreCase: " + textOne.equalsIgnoreCase(textTwo));

        /*
        * Explanation:
        *  - == compares the memory addresses.
        *  - .equals compares the content of both strings.
        *  - .equalsIgnoreCase compares the content of both strings, but
        *    isn't case-sensitive.
        * */

        sc.close();
    }
}
