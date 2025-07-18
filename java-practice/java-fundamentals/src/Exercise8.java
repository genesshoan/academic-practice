public class Exercise8 {
    public static void main(String[] args) {
        final double PI = 3.14;

        System.out.println(PI);

        int first = (int) PI;
        System.out.println(first);
        double second = (double) first;
        System.out.println(second);

        System.out.println("double / 0 " + (second / 0)); // Infinity
        try {
            System.out.println("int / 0 " + (first / 0)); // Exception: Dividing by zero isn't posible
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
