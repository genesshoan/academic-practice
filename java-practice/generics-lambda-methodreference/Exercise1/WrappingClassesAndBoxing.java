package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrappingClassesAndBoxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Recibe un entero por teclado, guárdalo en `Integer` y muéstralo como primitivo.
        Integer number = sc.nextInt();
        System.out.println(number);

        // 2. Convierte un `char` a `Character` y viceversa con autoboxing/unboxing.
        char letter = 'b';
        Character boxingChar = letter;
        char unboxingChar = boxingChar;

        // 3. Crea un `ArrayList<Integer>`, añade 5 números y calcula la suma.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = 0;
        for (Integer i : numbers) {
            sum =  sum + i;
        }
        System.out.println(sum);

        // 4. Escribe un método que reciba `List<Double>` y devuelva el promedio.
        List<Double> numbersList = new ArrayList<>();
        numbersList.add(1.0);
        numbersList.add(2.0);
        numbersList.add(3.0);
        numbersList.add(4.0);
        numbersList.add(5.0);
        System.out.println("Average: " + WrappingClassesAndBoxing.avg(numbersList));
    }

    public static double avg(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        double sum = 0;
        for (Double d : numbers) {
            sum += d;
        }
        return sum / numbers.size();
    }
}