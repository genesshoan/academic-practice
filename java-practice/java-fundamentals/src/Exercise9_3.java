public class Exercise9_3 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("El número es: " + numero);

        try {
            double resultado = dividir(numero, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error message " + e.getMessage());
        }
    }

    static int dividir(int a, int b) {
        return a / b;
    }
}