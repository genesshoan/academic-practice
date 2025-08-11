package dev.shoangenes;

public class MathUtils {

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative index");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Negative input");
        return Math.sqrt(x);
    }
}
