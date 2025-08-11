package Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import Exercise5.Persona;

public class MethodReference {

    public Supplier<ArrayList<String>> supplier = ArrayList::new;
    public static UnaryOperator<String> trimFunction = String::trim;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 2, 3, 20, 4, 4, 5);
        list.sort(Integer::compare);
        System.out.println(list);


        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        List<String> upperStrings = strings.stream().map(String::toUpperCase).toList();

        String string = "   string   ";
        String string1 = trimFunction.apply(string);

        List<String> personNames = Arrays.asList("Jorge", "Miguel", "Pepe");
        List<Persona> people = personNames.stream().map(Persona::new).toList();
    }
}
