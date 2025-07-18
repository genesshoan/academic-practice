import java.util.Scanner;

public class Exercise5_3 {
    public static double calcularArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        double height = sc.nextDouble();

        System.out.print("Rectangle area is: " + calcularArea(width, height));
        sc.close();
    }
}
