import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? : ");
        String name = sc.nextLine();

        System.out.print("How old are you? : ");
        int age = sc.nextInt();

        System.out.print("Do you like programming: ");
        boolean like = sc.nextBoolean();

        System.out.println("Hello " + name + "! You are " + age + " years old and you like programming: " + like);

        sc.close();
    }
}
