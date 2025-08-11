import dev.shoangenes.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    static Calculator calc;

    @BeforeAll
    static void setupAll() {
        calc = new Calculator();
        System.out.println("=== INICIANDO TESTS ===");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("=== FIN DE TESTS ===");
    }

    @BeforeEach
    void setupEach() {
        System.out.println("-- Iniciando test --");
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("-- Test finalizado --");
    }

    // 1️⃣ Test unitario simple
    @Test
    void testSum() {
        // TODO: Verificar que sum(2,3) == 5
        assertEquals(5, calc.sum(3, 2));
    }

    // 2️⃣ Test de excepción
    @Test
    void testDivideByZero() {
        // TODO: Usar assertThrows para verificar IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> calc.divide(0, 0));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-5));
    }

    // 3️⃣ ParameterizedTest con @CsvSource
    @ParameterizedTest(name = "maxOf({0}, {1}) = {2}")
    @CsvSource({
            "5,3,5",
            "2,10,10",
            "7,7,7"
    })
    void testMaxOf(int a, int b, int expected) {
        // TODO: Comprobar que maxOf devuelve el valor esperado
        assertEquals(expected, calc.maxOf(a, b));
    }

    // 4️⃣ ParameterizedTest con @ValueSource
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    void testIsEven(int number) {
        // TODO: Verificar que isEven(number) es true
        assertTrue(calc.isEven(number));
    }

    // 5️⃣ ParameterizedTest con @MethodSource
    static Stream<Arguments> stringLengths() {
        return Stream.of(
                Arguments.of("hola", 4),
                Arguments.of("JUnit", 5),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringLengths")
    void testStringLength(String str, int expectedLength) {
        // TODO: Usar assertEquals para verificar longitud
        assertEquals(expectedLength, str.length());
    }

    // 6️⃣ Test factorial válido
    @Test
    void testFactorial() {
        // TODO: Verificar que factorial(5) == 120
        assertEquals(120, calc.factorial(5));
    }

    // 7️⃣ Test factorial excepción
    @Test
    void testFactorialNegative() {
        // TODO: Verificar que factorial(-1) lanza IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-5));
    }
}
