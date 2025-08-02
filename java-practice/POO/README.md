# 🧪 Práctico Final de Programación Orientada a Objetos en Java

Este práctico tiene como objetivo reforzar los temas principales de la POO que ya viste. Cada ejercicio se enfoca en un concepto puntual. No se requiere hacer un sistema completo, pero sí escribir código funcional y representativo de cada tema.

---

## 1. Excepciones Personalizadas y Manejo

**Objetivo:** crear una excepción propia y manejarla correctamente.

**Instrucciones:**

- Crea una clase `Ejercicio1.InvalidAgeException` que extienda de `Exception`.
- Crea una clase `Person` con un atributo `int age`.
- El método `setAge(int age)` debe lanzar `Ejercicio1.InvalidAgeException` si el valor es menor que 0 o mayor que 130.
- En una clase `Main`, probá el método con `try-catch`.

---

## 2. Clase Abstracta + Herencia + `super`

**Objetivo:** practicar herencia, uso de clases abstractas y el uso de `super`.

**Instrucciones:**

- Crea una clase abstracta `Employee` con:
    - Atributo `protected String name`
    - Constructor que reciba el nombre
    - Método abstracto `double getSalary()`
- Crea dos subclases:
    - `FullTimeEmployee` con atributo `monthlySalary`
    - `PartTimeEmployee` con atributos `hoursWorked` y `hourlyRate`
- Implementá `getSalary()` en cada subclase.
- Usá `super(name)` en el constructor de las subclases.

---

## 3. Polimorfismo y `@Override`

**Objetivo:** usar polimorfismo real y métodos sobrescritos.

**Instrucciones:**

- Implementá un método:
  ```java
  public static void printEmployeeInfo(Employee e)
  ```
  que imprima el nombre y el salario.
- En el `main`, pasá instancias de `FullTimeEmployee` y `PartTimeEmployee` como `Employee`.

---

## 4. Miembros `static`

**Objetivo:** uso de atributos estáticos.

**Instrucciones:**

- En `Employee`, agregá un campo:
  ```java
  private static int counter = 0;
  ```
- Increméntalo en el constructor.
- Agregá un método estático `getEmployeeCount()` que lo retorne.
- Mostralo desde el `main`.

---

## 5. Múltiples Constructores (`this(...)`)

**Objetivo:** usar sobrecarga de constructores y reutilización de código.

**Instrucciones:**

- En `PartTimeEmployee`, agregá dos constructores:
    - Uno que reciba `hoursWorked` y `hourlyRate`
    - Otro que además reciba `name`
- Usá `this(...)` para llamar de uno al otro.

---

## 6. Getters, Setters y Validaciones

**Objetivo:** encapsulación y validación de datos.

**Instrucciones:**

- En `FullTimeEmployee`, agregá:
  ```java
  public void setMonthlySalary(double salary)
  ```
  que lance una `IllegalArgumentException` si el salario es negativo.

---

## 7. `Object` Class y Anotaciones

**Objetivo:** sobrescritura de métodos heredados.

**Instrucciones:**

- En `Employee`, sobrescribí:
    - `toString()`
    - `equals(Object o)`
- Usá `@Override` en cada método sobrescrito.
- Compará dos empleados en el `main` usando `equals`.

---

## 8. Modificador `protected`

**Objetivo:** uso de `protected` para compartir datos entre clases relacionadas.

**Instrucciones:**

- Asegurate de que `name` en `Employee` sea `protected`.
- Usalo directamente en las subclases sin `getter`.

---

## Recomendaciones finales

- Probá todo en una clase `Main` con `public static void main(String[] args)`.
- Intentá no usar IDE que autocomplete mucho (para practicar mejor).
- Usá comentarios para anotar dudas o cosas que quieras repasar.

---
