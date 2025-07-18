# Java Final Practice – Fundamentals and Basic Structures

**Objective**: Reinforce the core Java concepts learned so far, from literals, operations, and control structures to methods, arrays, strings, and basic error handling. Includes varied exercises, an integrative project, and debugging tasks to apply what you've learned before starting Object-Oriented Programming (OOP).

[You can read in spanish here.](https://github.com/genesshoan/academic-practice/blob/main/java-practice/java-fundamentals/README-ES.md)

---

## 🧩 Hands-on Content

- Literals, types, and variables
- Input and output using `Scanner`
- Arithmetic, boolean, and relational operators
- Flow control (`if`, `switch`, `for`, `while`, `do-while`, ternary)
- Methods and modularization
- Arrays and Strings
- Constants, casting, increment and decrement
- Comparison of primitives and objects
- Basic error handling
- Style and conventions
- Debugging and common mistakes

---

## 📘 Exercises

### 1. Types, Literals, and Operations

**1.1** Write a program that declares variables of all primitive types and prints them with descriptive messages.

**1.2** Calculate the area and perimeter of a rectangle by asking the user for base and height.

**1.3** Show the use of `++` and `--` in a clear example, printing each step.

---

### 2. Input and Output

**2.1** Using `Scanner`, ask the user for their name, age, and whether they like programming. Show a greeting like:

> Hello Juan! You are 19 years old and like programming: true

---

### 3. Conditionals

**3.1** Read a number and tell the user if it is positive, negative, or zero.

**3.2** Read a letter and check if it is a vowel or consonant (using `char` and `if`/`switch`).

**3.3** Use `switch` to convert a number (1–7) to the name of the day of the week.

**3.4** Determine if a number is even or odd using the ternary operator.

---

### 4. Loops

**4.1** Print the numbers from 1 to 100, but skip multiples of 5 (`continue`).

**4.2** Read numbers until the user enters `0`. At the end, display the average.

**4.3** Create a countdown from 10 to 1 using `while`, then show the message "Liftoff!"

---

### 5. Methods

**5.1** Function `mayor(int a, int b)` that returns the greater of two numbers.

**5.2** Function `int factorial(int n)`. Call it from `main` and print the result.

**5.3** Rewrite the area calculation as `double calcularArea(double base, double altura)`.

---

### 6. Arrays

**6.1** Read 10 integers and:
- Show the highest number
- Calculate the average
- Count how many are even

**6.2** Function that receives an array of integers and returns the sum of its elements.

---

### 7. Strings and Characters

**7.1** Read a sentence from the user and display:
- Number of characters (`.length()`)
- First and last character (`.charAt(0)`, `.charAt(length-1)`)
- Whether it contains the word `"Java"` (`.contains()`)

**7.2** Compare two input names:
- If they are equal using `==`
- If they are equal using `.equals()`
- Explain the difference

**7.3** Convert a sentence to uppercase and lowercase (`.toUpperCase()`, `.toLowerCase()`)

**7.4** Function that counts how many vowels a given word contains.

---

### 8. Constants, Casting, and Types

**8.1** Show how to use `final` by declaring the value of PI.

**8.2** Convert a `double` to `int` (casting) and vice versa. Show how the value changes.

**8.3** Test what happens when you divide an `int` by 0 and a `double` by 0. Do they behave the same?

---

### 9. Basic Error Handling and Debugging

**9.1** Read two numbers and divide them. Prevent division by zero using an `if`.

**9.2** Add error handling with `try-catch` to catch `InputMismatchException` if the user enters non-numeric input when using `Scanner.nextInt()`.

**9.3** The following code has **compilation errors**. Copy it, identify and correct the mistakes:

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
