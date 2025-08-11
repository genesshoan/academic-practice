# Práctico de Java – Fechas, Enum y Archivos

**Objetivo:** Reforzar conceptos clave como fechas y horas, enumeraciones, estructuras de control modernas (`switch expression`) y manejo de archivos con clases `File` y `Files`.

---

## 📅 Parte 1: LocalDate, LocalTime y LocalDateTime

### Ejercicio 1
Crear una clase `FechaActual` que imprima:

- La fecha actual (`LocalDate`)
- La hora actual (`LocalTime`)
- Fecha y hora actual (`LocalDateTime`)

> 💡 Usa los métodos `now()` y `of()` de cada clase.

---

### Ejercicio 2
Pedir al usuario su fecha de nacimiento (en formato `YYYY-MM-DD`) y calcular:

- Cuántos días han pasado desde entonces.
- Cuántos años tiene (redondeando hacia abajo).

> 💡 Usar `Period` y `ChronoUnit.DAYS.between`.

---

### Ejercicio 3
Mostrar qué día de la semana será dentro de 100 días.

---

## 🎛️ Parte 2: Enum con constantes, campos y métodos

### Ejercicio 4
Crear un `enum` llamado `Level` con los valores: `LOW`, `MEDIUM`, `HIGH`.

- Cada nivel tiene un número de prioridad (1, 2, 3).
- Agregar un método `isCritical()` que devuelva `true` si el nivel es `HIGH`.

---

### Ejercicio 5
Crear un `enum` llamado `Mes` que represente los 12 meses del año.

- Cada mes debe tener:
    - Un número de mes (enero = 1, diciembre = 12).
    - Su cantidad de días (febrero = 28, no bisiesto).
- Crear un método `esLargo()` que devuelva `true` si tiene 31 días.

---

## 🧮 Parte 3: Switch Expression

### Ejercicio 6
Implementar una función `obtenerMensajeNivel(Level nivel)` que devuelva un mensaje diferente según el nivel usando `switch expression`.

> 💡 Usar la sintaxis `return switch(nivel) { ... }`.
``` Java
    public String obtenerMensajeNivel(Level nivel) {
        return switch(nivel) {
        case LOW -> System.out.println("CARGA el celular :(");
        case MEDIUM -> System.out.println("No es necesario conectar cargador");
        case HIGH -> System.out.println("El porcentaje de batería es alto");
        }
    }
```
---

## 📂 Parte 4: Manejo de Archivos

### Ejercicio 7
Crear una clase `GestorArchivos` que:

1. Reciba una ruta y verifique si el archivo existe.
2. Si no existe, lo cree.
3. Muestre el tamaño en bytes.
4. Muestre la última modificación.

> 💡 Usar la clase `File`.

---

### Ejercicio 8
Leer el contenido completo de un archivo de texto llamado `notas.txt` y mostrarlo por consola.

> 💡 Usar `Files.readString(Path)` o `Files.readAllLines`.

---

### Ejercicio 9
Escribir una función que reciba un texto y lo guarde en un archivo `salida.txt`, sobrescribiendo si existe.
