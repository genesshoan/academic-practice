# 📚 Práctico – Java Avanzado

## 1. Wrapping Classes y Boxing

### Resumen
- **Boxing**: primitivo → wrapper.
- **Unboxing**: wrapper → primitivo.
- Autoboxing/unboxing desde Java 5.

**Tabla**
| Primitivo | Wrapper     |
|-----------|-------------|
| byte      | Byte        |
| short     | Short       |
| int       | Integer     |
| long      | Long        |
| float     | Float       |
| double    | Double      |
| char      | Character   |
| boolean   | Boolean     |

---

### Ejercicios
1. Recibe un entero por teclado, guárdalo en `Integer` y muéstralo como primitivo.
2. Convierte un `char` a `Character` y viceversa con autoboxing/unboxing.
3. Crea un `ArrayList<Integer>`, añade 5 números y calcula la suma.
4. Escribe un método que reciba `List<Double>` y devuelva el promedio.

---

## 2. Introducción a la Programación Genérica

### Resumen
Permite escribir código parametrizado por tipo, evitando *casts* y errores de tipo.

**Ejemplo**
```java
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

---

### Ejercicios
1. Implementa una clase genérica `Pair<K, V>` con getters y setters.
2. Método genérico que imprima un arreglo de cualquier tipo.
3. Implementa `Stack<T>` con `push`, `pop`, `isEmpty`.
4. Método genérico `swap(T[] array, int i, int j)` que intercambie elementos.

---

## 3. Generics y Object

### Resumen
Antes de Generics se usaba `Object` (con *casts*).  
Con Generics se especifica tipo en tiempo de compilación.

---

### Ejercicios
1. Usa `ArrayList<Object>` con datos de tipos distintos, fuerza un `ClassCastException`.
2. Reescribe el ejercicio anterior con Generics para evitar errores.
3. Crea `DataHolder` usando `Object`, luego modifícalo a genérico.

---

## 4. Expresiones Lambda

### Resumen
Sintaxis compacta para **interfaces funcionales**.  
```java
(param) -> expresión
(param) -> { bloque }
```

---

### Ejercicios
1. `Predicate<String>` → devuelve `true` si empieza con `"A"`.
2. `UnaryOperator<String>` → quita espacios y pone en mayúsculas.
3. `Comparator<Integer>` → orden descendente.
4. `Function<String, Integer>` → longitud de cadena.
5. `BiFunction<String, String, String>` → concatena con espacio.
6. `IntBinaryOperator` → mayor de dos enteros.
7. `ToDoubleFunction<String>` → convierte cadena a `double`.

---

## 5. Referencias a Métodos

### Tipos
1. Estático → `ClassName::staticMethod`
2. Instancia específica → `instance::method`
3. Instancia arbitraria → `ClassName::method`
4. Constructor → `ClassName::new`

---

### Ejercicios
1. Usa `Integer::compare` para ordenar enteros.
2. Usa `String::toUpperCase` con `map`.
3. `Supplier<ArrayList<String>>` con `ArrayList::new`.
4. Reemplaza `(s) -> s.trim()` por `String::trim`.
5. Usa referencia a constructor para crear objetos desde una lista de nombres.

---

## 6. Interfaces Funcionales de `java.util.function`

### Principales
| Interfaz              | Parámetros | Retorno | Ejemplo |
|-----------------------|-----------|---------|---------|
| `Function<T,R>`       | 1         | R       | `String::length` |
| `BiFunction<T,U,R>`   | 2         | R       | `Integer::sum` |
| `UnaryOperator<T>`    | 1 (T)     | T       | `String::toUpperCase` |
| `BinaryOperator<T>`   | 2 (T,T)   | T       | `Integer::max` |
| `IntBinaryOperator`   | 2 (int)   | int     | `(a,b) -> a*b` |
| `Predicate<T>`        | 1         | boolean | `x -> x > 0` |
| `Supplier<T>`         | 0         | T       | `Date::new` |
| `Consumer<T>`         | 1         | void    | `System.out::println` |

---

### Ejercicios
1. `Function<String, Integer>` → cantidad de vocales.
2. `BiFunction<Integer, Integer, Double>` → promedio de dos enteros.
3. `UnaryOperator<List<String>>` → elimina cadenas vacías.
4. `BinaryOperator<Integer>` → mínimo de dos enteros.
5. `IntBinaryOperator` → calcula MCD.
6. `Predicate<String>` → verifica si es palíndromo.
7. `Supplier<LocalDate>` → fecha actual.
8. `Consumer<Integer>` → imprime el cuadrado.

---
