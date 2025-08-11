package Exercise4;

import java.util.Comparator;
import java.util.function.*;

public class Lambdas {
    // 1. `Predicate<String>` → devuelve `true` si empieza con `"A"`.
    Predicate<String> startsWithA = s -> s != null && !s.isEmpty() && s.charAt(0) == 'A';

    // 2. `UnaryOperator<String>` → quita espacios y pone en mayúsculas.
    UnaryOperator<String> trimAndToUpperCase = s -> s.replaceAll(" ", "").toUpperCase();

    // 3. `Comparator<Integer>` → orden descendente.
    Comparator<Integer> isDesendent = Integer::compare;

    // 4. `Function<String, Integer>` → longitud de cadena.
    Function<String, Integer> length = String::length;

    // 5. `BiFunction<String, String, String>` → concatena con espacio.
    BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;

    // 6. `IntBinaryOperator` → mayor de dos enteros.
    IntBinaryOperator max = Math::max;

    // 7. `ToDoubleFunction<String>` → convierte cadena a `double`.
    ToDoubleFunction<String> toDouble = Double::parseDouble;
}
