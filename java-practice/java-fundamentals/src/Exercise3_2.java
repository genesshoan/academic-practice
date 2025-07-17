import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = sc.nextLine();
        if (!input.isEmpty() && Character.isLetter(input.charAt(0))) {
            char character = Character.toLowerCase(input.charAt(0));

            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input!");
        }


        sc.close();
    }
}
