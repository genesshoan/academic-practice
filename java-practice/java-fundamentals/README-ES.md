# Práctico Final de Java - Fundamentos y Estructuras Básicas

**Objetivo**: Reforzar los conceptos fundamentales de Java vistos hasta ahora, desde literales, operaciones y estructuras de control, hasta métodos, arreglos, strings y manejo básico de errores. Incluye ejercicios variados, un proyecto integrador y actividades de depuración para aplicar lo aprendido antes de empezar con Programación Orientada a Objetos (POO).

---

## 🧩 Contenido en Práctica

- Literales, tipos y variables
- Entrada y salida con `Scanner`
- Operadores aritméticos, booleanos y relacionales
- Control de flujo (`if`, `switch`, `for`, `while`, `do-while`, ternario)
- Métodos y modularización
- Arreglos y Strings
- Constantes, casting, incremento y decremento
- Comparaciones de primitivas y objetos
- Manejo básico de errores
- Estilo y convenciones
- Depuración y errores comunes

---

## 📘 Ejercicios

### 1. Tipos, Literales y Operaciones

**1.1** Escribí un programa que declare variables de todos los tipos primitivos y las imprima con un mensaje descriptivo.

**1.2** Calculá área y perímetro de un rectángulo, pidiendo base y altura al usuario.

**1.3** Mostrá el uso de `++` y `--` en un ejemplo claro, imprimiendo cada paso.

---

### 2. Entrada y salida de datos

**2.1** Usando `Scanner`, pedí al usuario su nombre, edad y si le gusta programar. Mostrá un saludo como:

> ¡Hola Juan! Tenés 19 años y te gusta programar: true

---

### 3. Condicionales

**3.1** Leé un número y mostrale al usuario si es positivo, negativo o cero.

**3.2** Leé una letra y verificá si es vocal o consonante (usando `char` y `if`/`switch`).

**3.3** Usá `switch` para convertir un número (1–7) en el nombre del día de la semana.

**3.4** Determiná si un número es par o impar con operador ternario.

---

### 4. Ciclos

**4.1** Imprimí los números del 1 al 100, pero salteando los múltiplos de 5 (`continue`).

**4.2** Leé números hasta que el usuario ingrese `0`. Al final, mostrá el promedio.

**4.3** Hacé una cuenta regresiva del 10 al 1 con `while`, y luego un mensaje "¡Despegue!".

---

### 5. Métodos

**5.1** Función `mayor(int a, int b)` que devuelva el mayor entre dos números.

**5.2** Función `int factorial(int n)`. Llamala desde el `main` y mostrala.

**5.3** Reescribí el cálculo de área como `double calcularArea(double base, double altura)`.

---

### 6. Arreglos

**6.1** Leé 10 enteros y:
- Mostrá el mayor
- Calculá el promedio
- Contá cuántos son pares

**6.2** Función que reciba un arreglo de enteros y devuelva la suma de sus elementos.

---

### 7. Strings y Caracteres

**7.1** Leé una frase del usuario y mostrá:
- Cuántos caracteres tiene (`.length()`)
- El primer y último carácter (`.charAt(0)`, `.charAt(length-1)`)
- Si contiene la palabra `"Java"` (`.contains()`)

**7.2** Compará dos nombres ingresados:
- Si son iguales con `==`
- Si son iguales con `.equals()`
- Explicá la diferencia

**7.3** Convertí una frase a mayúsculas y minúsculas (`.toUpperCase()`, `.toLowerCase()`)

**7.4** Función que cuente cuántas vocales tiene una palabra ingresada.

---

### 8. Constantes, Casting y Tipos

**8.1** Mostrá el uso de `final` declarando el valor del PI.

**8.2** Convertí un `double` a `int` (casting) y viceversa. Mostrá cómo cambia el valor.

**8.3** Probá qué pasa si dividís un `int` por 0 y si dividís un `double` por 0. ¿Se comportan igual?

---

### 9. Manejo básico de errores y debugging

**9.1** Leé dos números y dividilos. Evitá que el usuario divida por cero usando un `if`.

**9.2** Agregá manejo de errores con `try-catch` para capturar `InputMismatchException` si el usuario no ingresa un número al usar `Scanner.nextInt()`.

**9.3** El siguiente código tiene **errores de compilación**. Copialo, identificá y corregí los errores:

```java
public class ErrorDemo {
    public static void main(String[] args) {
        int numero = "10";
        System.out.println("El número es: " + numero)
        double resultado = dividir(10, 0);
        System.out.println("Resultado: " + resultado);
    }

    static double dividir(int a, int b) {
        return a / b;
    }
}
