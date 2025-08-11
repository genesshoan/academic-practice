import dev.shoangenes.MathUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

class MathUtilsTests {

    static MathUtils utils;

    @BeforeAll
    static void initAll() {
        utils = new MathUtils();
    }

    @Test
    void testMultiply() {
        // TODO: Testea que multiply(3,4) sea 12
        assertEquals(12, utils.multiply(3, 4));
        assertEquals(0, utils.multiply(3, 0));
    }

    @Test
    void testSqrtNegative() {
        // TODO: Verificar que sqrt(-1) lanza IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> utils.sqrt(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11})
    void testIsPrimeTrue(int prime) {
        // TODO: Asegurar que isPrime(prime) sea true
        assertTrue(utils.isPrime(prime));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10})
    void testIsPrimeFalse(int nonPrime) {
        // TODO: Asegurar que isPrime(nonPrime) sea false
        assertFalse(utils.isPrime(nonPrime));
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
        // TODO: Comprobar fibonacci(input) == expected
        assertEquals(expected, utils.fibonacci(input));
    }

    @ParameterizedTest(name = "multiply({0}, {1}) = {2}")
    @CsvSource({
            "10, 1, 10",
            "2, 6, 12",
            "0, 0, 0",
            "-1, -1, 1"
    })
    void testMultiplyRepeated(int a, int b, int expected) {
        // TODO: Test repetido que multiply(2, 5) ==
        assertEquals(expected, utils.multiply(a, b));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10})
    void testSqrt(int a) {
        // TODO: Verificar sqrt(16) == 4
        assertEquals(Math.sqrt(a), utils.sqrt(a));
    }
}
