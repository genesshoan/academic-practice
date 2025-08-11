package Exercise3;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // No hay necesidad de casteo explícito, porque list es de Integer
        int number = list.get(1);
        System.out.println(number);
    }
}