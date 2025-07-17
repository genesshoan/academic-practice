public class Exercise5_1 {
    public static int greater(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("The greater number is " + greater(a, b));
    }
}