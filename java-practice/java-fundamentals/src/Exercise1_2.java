import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rectangle's width: ");
        int rectangleWidth = input.nextInt();
        System.out.print("Enter rectangle's height: ");
        int rectangleHeight = input.nextInt();

        int rectanglePerimeter = (rectangleHeight + rectangleWidth) * 2;
        int rectangleArea = rectangleWidth * rectangleHeight;

        System.out.println("Rectangle's area is: " + rectangleArea);
        System.out.println("Rectangle's perimeter is: " + rectanglePerimeter);

        input.close();
    }
}
