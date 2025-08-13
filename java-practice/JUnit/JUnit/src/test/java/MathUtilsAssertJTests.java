import dev.shoangenes.MathUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.*;

class MathUtilsAssertJTests {

    static MathUtils utils;

    @BeforeAll
    static void initAll() {
        utils = new MathUtils();
    }

    @Test
    void testMultiply() {
        int result = utils.multiply(3, 4);
        // TODO: Verificar que el resultado sea igual a 12, positivo y mayor que 10
    }

    @Test
    void testSqrtNegative() {
        // TODO: Verificar que sqrt(-1) lance IllegalArgumentException con un mensaje que contenga "negativo"
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11})
    void testIsPrimeTrue(int prime) {
        // TODO: Asegurar que isPrime(prime) sea true
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10})
    void testIsPrimeFalse(int nonPrime) {
        // TODO: Asegurar que isPrime(nonPrime) sea false
    }

    static Stream<Arguments> fibonacciValues() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(5, 5),
                Arguments.of(7, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacciValues")
    void testFibonacci(int input, int expected) {
        // TODO: Comprobar que fibonacci(input) es igual a expected
    }

    @ParameterizedTest(name = "multiply({0}, {1}) = {2}")
    @CsvSource({
            "10, 1, 10",
            "2, 6, 12",
            "0, 0, 0",
            "-1, -1, 1"
    })
    void testMultiplyRepeated(int a, int b, int expected) {
        // TODO: Comprobar multiply(a, b) con el valor esperado
    }

    @DisplayName("Test raíz cuadrada con AssertJ")
    @ParameterizedTest
    @ValueSource(ints = {1, 4, 9, 16, 25})
    void testSqrt(int a) {
        // TODO: Verificar que sqrt(a) es igual a Math.sqrt(a) y positivo
    }
}
