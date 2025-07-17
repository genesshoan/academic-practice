import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day (integer 1 -7): ");
        String input =  sc.nextLine();

        try {
            int number = Integer.parseInt(input);

            switch (number) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
