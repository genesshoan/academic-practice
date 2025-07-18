import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = 10;
        int[] array = new int[numberOfElements];
        double sum = 0;
        int countEven = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The average is " + sum / array.length);
        System.out.println("The number of even is " + countEven);

        sc.close();
    }
}
