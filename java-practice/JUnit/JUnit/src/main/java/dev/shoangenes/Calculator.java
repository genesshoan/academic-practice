package dev.shoangenes;

public class Calculator {

    public int maxOf(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
