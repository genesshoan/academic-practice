# Reflection Basics – Practical in Java

Este práctico te permitirá aplicar los conceptos iniciales de reflexión en Java. Vas a trabajar con introspección de clases, chequeo de tipos en tiempo de ejecución, y creación dinámica de objetos. Ideal para afianzar lo aprendido en los tópicos:

- Reflection basics  
- Retrieving Class instances  
- Runtime type checking  

---

## 📚 Estructura del práctico

### ✅ Ejercicio 1 – `getClass()` y comparación exacta

**Objetivo:** Verificar el tipo real de un objeto en tiempo de ejecución y compararlo con otros.

**Tareas:**

1. Crear las clases `Animal`, `Dog` y `Cat`.
2. Crear objetos de tipo `Animal` usando instancias de `Dog` y `Cat`.
3. Imprimir el resultado de `getClass().getName()`.
4. Comparar objetos usando `getClass()`.

---

### ✅ Ejercicio 2 – `instanceof`

**Objetivo:** Evaluar herencia con `instanceof`.

**Tareas:**

1. Usar los objetos de `Ejercicio 1`.
2. Aplicar `instanceof` para verificar si cada objeto es instancia de:
   - `Animal`
   - `Dog`
   - `Cat`
3. Imprimir resultados.

---

### ✅ Ejercicio 3 – Usar `Class.forName()` y listar métodos

**Objetivo:** Obtener metainformación de una clase a partir de su nombre.

**Tareas:**

1. Obtener la clase `java.util.ArrayList` usando `Class.forName()`.
2. Imprimir el nombre de todos los métodos públicos de la clase con `getMethods()`.

> ⚠️ Este ejercicio requiere manejo de `ClassNotFoundException`.

---

### ✅ Ejercicio 4 – Crear instancia sin usar `new`

**Objetivo:** Crear un objeto a partir de su clase mediante reflexión.

**Tareas:**

1. Crear la clase `User` con constructor sin parámetros.
2. Usar `User.class.getDeclaredConstructor().newInstance()` para crear un objeto.
3. Imprimir el objeto.

> ⚠️ Manejá posibles excepciones:
> - `InstantiationException`
> - `IllegalAccessException`
> - `InvocationTargetException`
> - `NoSuchMethodException`

---

### ✅ Ejercicio 5 – Leer atributos con `getDeclaredFields()`

**Objetivo:** Acceder a campos privados mediante reflexión.

**Tareas:**

1. Agregar campos `name` y `email` privados a `User`.
2. Desde otra clase, usar `getDeclaredFields()` para:
   - Listar los nombres de los campos.
   - Leer sus valores (usando `setAccessible(true)` si es necesario).

---

### ✅ Ejercicio 6 – Método utilitario para introspección

**Objetivo:** Crear una utilidad que analice objetos en tiempo de ejecución.

**Tareas:**

1. Crear función `printClassInfo(Object obj)`.
2. Mostrar:
   - Nombre completo de la clase.
   - Si es instancia de alguna superclase conocida (`Animal`, por ejemplo).
   - Anotaciones presentes (si hay).
