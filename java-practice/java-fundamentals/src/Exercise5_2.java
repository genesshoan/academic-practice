public class Exercise5_2 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        int factorial = factorial(number);
        System.out.print("Factorial of " + number + " is " + factorial);
    }
}