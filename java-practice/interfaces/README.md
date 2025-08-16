# Práctico: Interfaces en Java - Conceptos y Aplicaciones

**Curso:** Programación Orientada a Objetos - Java  
**Tema:** Interfaces, Clases Anónimas e Interfaces Funcionales  
**Duración estimada:** 3 horas

---

## Objetivos

Al finalizar este práctico, el estudiante será capaz de:
- Diseñar e implementar interfaces siguiendo principios de responsabilidad única
- Crear y utilizar clases anónimas de manera efectiva
- Trabajar con métodos default y static en interfaces
- Implementar interfaces funcionales usando lambda expressions y method references
- Diferenciar entre abstract classes e interfaces, y aplicarlos apropiadamente

---

## Recordatorios Importantes

### ✅ Conceptos Clave
- **Interface**: Contrato que define comportamientos (métodos) sin implementación
- **implements**: Palabra clave para que una clase implemente una interface
- **default**: Métodos con implementación en interfaces (Java 8+)
- **@FunctionalInterface**: Interfaces con exactamente un método abstracto
- **Clases anónimas**: Clases sin nombre que implementan interfaces al momento

### ⚠️ Reglas a Recordar
- Una interface NO puede ser instanciada directamente
- Una clase que implementa una interface DEBE implementar todos sus métodos abstractos
- Las variables en interfaces son implícitamente `public static final`
- Los métodos en interfaces son implícitamente `public abstract` (salvo default/static)
- Una clase puede implementar múltiples interfaces

---

## Ejercicio 1: Sistema de Reproducción de Audio 🎵
**Objetivo:** Diseñar interfaces siguiendo el principio de responsabilidad única

### Parte A: Diseño de Interfaces
Diseña las siguientes interfaces para un sistema de reproducción de audio:

```java
// TODO: Completar las interfaces
interface SoundMaker {
    // Método para producir sonido
}

interface AudioPlayer {
    // Métodos básicos para reproducir audio
}

interface VolumeControl {
    // Métodos para controlar volumen
}
```

**Instrucciones:**
1. Define métodos apropiados para cada interface
2. Mantén cada interface enfocada en una responsabilidad específica
3. Usa nombres descriptivos para los métodos

### Parte B: Implementación
Crea las siguientes clases que implementen las interfaces:

```java
class Headphones implements SoundMaker, VolumeControl {
    private int volume = 50;
    
    // TODO: Implementar métodos
}

class Smartphone implements AudioPlayer, VolumeControl {
    private boolean isPlaying = false;
    private int volume = 30;
    
    // TODO: Implementar métodos
}

class Speaker implements SoundMaker, VolumeControl {
    private int volume = 70;
    private boolean isMuted = false;
    
    // TODO: Implementar métodos
}
```

### Parte C: Prueba Polimórfica
Crea un método que demuestre polimorfismo:

```java
public static void testPolymorphism() {
    // TODO: Crear array de VolumeControl con diferentes implementaciones
    // TODO: Iterar y llamar métodos para demostrar polimorfismo
}
```

---

## Ejercicio 2: Sistema de Herramientas de Dibujo 🎨
**Objetivo:** Implementar interfaces con métodos default y resolver el problema del diamante

### Parte A: Interface Base con Método Default
```java
interface DrawingTool {
    void draw(String shape);
    
    // TODO: Agregar método default para cleanup
    default void cleanup() {
        System.out.println("Cleaning drawing tool...");
    }
    
    // TODO: Agregar método default para reset que use cleanup
    default void reset() {
        // Implementar usando cleanup()
    }
}

interface ColoredTool {
    void setColor(String color);
    String getColor();
    
    // TODO: Agregar método default reset con diferente comportamiento
    default void reset() {
        setColor("Black");
        System.out.println("Color reset to default");
    }
}
```

### Parte B: Resolución del Problema del Diamante
```java
class DigitalPen implements DrawingTool, ColoredTool {
    private String color = "Blue";
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public void draw(String shape) {
        System.out.println("Drawing " + shape + " with digital pen in " + color);
    }
    
    // TODO: Resolver conflicto de método reset
    // Pista: Usa InterfaceName.super.methodName()
}
```

---

## Ejercicio 3: Clases Anónimas para Event Handling 🖱️
**Objetivo:** Crear y utilizar clases anónimas

### Parte A: Interface para Eventos
```java
interface EventHandler {
    void handle(String eventType, String data);
}

interface ClickHandler {
    void onClick(int x, int y);
    void onDoubleClick(int x, int y);
}
```

### Parte B: Implementación con Clases Anónimas
```java
public class EventSystem {
    public static void setupEventHandlers() {
        // TODO: Crear EventHandler anónimo para eventos de teclado
        EventHandler keyboardHandler = new EventHandler() {
            // Implementar para manejar eventos de teclado
        };
        
        // TODO: Crear ClickHandler anónimo para clics de mouse
        ClickHandler mouseHandler = // ... implementar
        
        // TODO: Crear otro EventHandler que capture una variable local final
        final String logPrefix = "[LOG] ";
        EventHandler loggingHandler = // ... implementar usando logPrefix
        
        // Simular eventos
        keyboardHandler.handle("KEY_PRESS", "A");
        mouseHandler.onClick(100, 200);
        loggingHandler.handle("USER_ACTION", "File saved");
    }
}
```

---

## Ejercicio 4: Interfaces Funcionales y Lambdas 🚀
**Objetivo:** Trabajar con interfaces funcionales, lambdas y method references

### Parte A: Definir Interfaces Funcionales
```java
@FunctionalInterface
interface MathOperation {
    double calculate(double a, double b);
}

@FunctionalInterface  
interface StringProcessor {
    String process(String input);
    
    // TODO: Agregar método default para logging
    default String processWithLog(String input) {
        String result = process(input);
        System.out.println("Processed: " + input + " -> " + result);
        return result;
    }
}

@FunctionalInterface
interface NumberValidator {
    boolean isValid(int number);
}
```

### Parte B: Implementaciones con Lambda
```java
public class FunctionalProgramming {
    public static void demonstrateLambdas() {
        // TODO: Crear MathOperation para suma usando lambda
        MathOperation addition = // ...
        
        // TODO: Crear MathOperation para multiplicación usando lambda
        MathOperation multiplication = // ...
        
        // TODO: Crear StringProcessor que convierta a mayúsculas usando lambda
        StringProcessor upperCase = // ...
        
        // TODO: Crear NumberValidator para números pares usando lambda
        NumberValidator evenValidator = // ...
        
        // TODO: Crear NumberValidator para números en rango usando lambda
        NumberValidator rangeValidator = // ... (1-100)
        
        // Probar las implementaciones
        System.out.println("5 + 3 = " + addition.calculate(5, 3));
        System.out.println("5 * 3 = " + multiplication.calculate(5, 3));
        System.out.println("hello -> " + upperCase.process("hello"));
        System.out.println("Is 4 even? " + evenValidator.isValid(4));
        System.out.println("Is 50 in range? " + rangeValidator.isValid(50));
    }
}
```

### Parte C: Method References
```java
class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}

class MathUtils {
    public static double power(double base, double exp) {
        return Math.pow(base, exp);
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class MethodReferences {
    public static void demonstrateMethodReferences() {
        // TODO: Crear StringProcessor usando method reference a StringUtils.reverse
        StringProcessor reverser = // ...
        
        // TODO: Crear StringProcessor usando method reference a StringUtils.capitalize  
        StringProcessor capitalizer = // ...
        
        // TODO: Crear MathOperation usando method reference a MathUtils.power
        MathOperation power = // ...
        
        // TODO: Crear NumberValidator usando method reference a MathUtils.isPrime
        NumberValidator primeValidator = // ...
        
        // Probar method references
        System.out.println("reverse('hello') = " + reverser.process("hello"));
        System.out.println("capitalize('WORLD') = " + capitalizer.process("WORLD"));
        System.out.println("power(2, 3) = " + power.calculate(2, 3));
        System.out.println("Is 17 prime? " + primeValidator.isValid(17));
    }
}
```

---

## Ejercicio 5: Sistema Completo - Gestor de Tareas 📋
**Objetivo:** Integrar todos los conceptos en un sistema completo

### Parte A: Diseño de Interfaces
```java
interface Task {
    String getDescription();
    boolean isCompleted();
    void complete();
}

interface Prioritizable {
    int getPriority(); // 1-5, donde 5 es más prioritario
    void setPriority(int priority);
}

interface Schedulable {
    LocalDateTime getScheduledTime();
    void setScheduledTime(LocalDateTime time);
    
    default boolean isOverdue() {
        return getScheduledTime().isBefore(LocalDateTime.now()) && !((Task)this).isCompleted();
    }
}

@FunctionalInterface
interface TaskFilter {
    boolean test(Task task);
}

@FunctionalInterface  
interface TaskAction {
    void execute(Task task);
}
```

### Parte B: Implementaciones
```java
class SimpleTask implements Task {
    private String description;
    private boolean completed;
    
    public SimpleTask(String description) {
        this.description = description;
        this.completed = false;
    }
    
    // TODO: Implementar métodos de Task
}

class PriorityTask implements Task, Prioritizable {
    private String description;
    private boolean completed;
    private int priority;
    
    // TODO: Implementar todos los métodos
}

class ScheduledTask implements Task, Schedulable, Prioritizable {
    // TODO: Implementar clase completa con todos los métodos
    // Resolver conflicto si existe método default duplicado
}
```

### Parte C: Gestor con Programación Funcional
```java
class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    // TODO: Implementar método que use TaskFilter
    public List<Task> filterTasks(TaskFilter filter) {
        // Implementar usando streams y filter
    }
    
    // TODO: Implementar método que use TaskAction  
    public void processAllTasks(TaskAction action) {
        // Aplicar action a todas las tareas
    }
    
    // TODO: Métodos usando lambdas predefinidas
    public List<Task> getCompletedTasks() {
        // Usar filterTasks con lambda
    }
    
    public List<Task> getHighPriorityTasks() {
        // Filtrar tareas con prioridad >= 4
    }
    
    public List<Task> getOverdueTasks() {
        // Filtrar tareas vencidas (si son Schedulable)
    }
}
```

### Parte D: Programa Principal
```java
public class TaskManagerDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        
        // TODO: Crear diferentes tipos de tareas
        // SimpleTask, PriorityTask, ScheduledTask
        
        // TODO: Agregar tareas al manager
        
        // TODO: Demostrar filtros con lambdas
        // Ej: tareas completadas, alta prioridad, vencidas
        
        // TODO: Demostrar acciones con lambdas
        // Ej: marcar como completadas, cambiar prioridad
        
        // TODO: Usar method references donde sea posible
        
        // TODO: Crear clase anónima para TaskFilter personalizado
    }
}
```

---

## Ejercicio 6: Preguntas de Análisis 🤔

**Responde las siguientes preguntas con ejemplos de código:**

### 1. Diferencias Interface vs Abstract Class
```java
// TODO: Crear ejemplo que muestre cuándo usar interface vs abstract class
// Considera: herencia múltiple, estado, constructores, implementación
```

### 2. Ventajas de Interfaces Funcionales
```java
// TODO: Comparar implementación tradicional vs lambda para la misma funcionalidad
// Mostrar código más limpio y expresivo
```

### 3. Problema del Diamante
```java
// TODO: Crear ejemplo del problema del diamante y su solución
// Explicar por qué ocurre y cómo Java lo resuelve
```

---

## Recursos Adicionales

- **Java Documentation:** [Oracle Java Interfaces](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
- **Functional Interfaces:** [java.util.function package](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
- **Lambda Tutorial:** [Oracle Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)

---

**¡Buena suerte con el práctico! Recuerda que la práctica es clave para dominar estos conceptos fundamentales de Java.**
