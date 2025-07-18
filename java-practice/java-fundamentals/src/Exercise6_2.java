import java.util.Scanner;

public class Exercise6_2 {
    public static int sumArray(int[] args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("The sum of all elements is:" + sumArray(array));

        sc.close();
    }
}
