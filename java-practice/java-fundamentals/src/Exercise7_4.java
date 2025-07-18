import java.util.Scanner;

public class Exercise7_4 {
    public static int howManyVowels (String word) {
        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("How many vowels? : "  + howManyVowels(s));

        sc.close();
    }
}
