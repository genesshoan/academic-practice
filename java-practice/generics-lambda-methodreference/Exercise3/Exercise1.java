package Exercise3;

import java.util.ArrayList;


public class Exercise1 {
    public static void main(String[] args) {

        // 1. Usa `ArrayList<Object>` con datos de tipos distintos, fuerza un `ClassCastException`.
        try {
            ArrayList<Object> list = new ArrayList<>();
            list.add(1);
            list.add("Hello");
            list.add(3);

            int number = (int) list.get(1);
        } catch (ClassCastException e) {
            System.out.println("El elemento no es un Integer");
        }
    }
}
