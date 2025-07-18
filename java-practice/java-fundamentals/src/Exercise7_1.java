import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        System.out.println("Length of string: " + string.length());
        if (!string.isEmpty()) {
            System.out.println("The first element: " + string.charAt(0));
            System.out.println("The last element: " + string.charAt(string.length() - 1));
        } else {
            System.out.println("Is empty, no elements to display");
        }
        System.out.println("Does the string contain \"Java\"?: " + string.contains("Java"));

        sc.close();
    }
}
