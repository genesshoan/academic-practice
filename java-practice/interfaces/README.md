# 📄 Práctico: Interfaces en Java

## 🎯 Objetivo
- Comprender la sintaxis y uso de interfaces.
- Implementar interfaces en clases concretas.
- Usar herencia múltiple de interfaces.
- Aplicar interfaces en escenarios reales.

---

## **Ejercicio 1 — Interfaz básica**
**Consigna:**  
1. Define una interfaz `Saludable` con un método abstracto `calcularCalorias()`.
2. Crea una clase `Fruta` que implemente `Saludable`.
3. La clase debe tener atributos como `nombre` y `gramos`.
4. Implementa `calcularCalorias()` asumiendo que **1 gramo = 0.52 calorías**.
5. En un `main`, crea una lista de frutas y muestra sus calorías.

---

## **Ejercicio 2 — Múltiples interfaces**
**Consigna:**  
1. Define dos interfaces:  
   - `Volador` con el método `volar()`.
   - `Nadador` con el método `nadar()`.
2. Crea una clase `Pato` que implemente ambas interfaces.
3. El método `volar()` debe imprimir `"El pato está volando"`.
4. El método `nadar()` debe imprimir `"El pato está nadando"`.
5. Crea un `main` que pruebe ambos métodos.

---

## **Ejercicio 3 — Interfaz con constantes y métodos estáticos**
**Consigna:**  
1. Crea una interfaz `ConversorMoneda` con:  
   - Una constante `TASA_DOLAR = 41.5` (1 USD a pesos uruguayos).  
   - Un método estático `pesosADolares(double pesos)` que convierta y retorne el valor.  
   - Un método abstracto `convertir(double cantidad)`.
2. Crea una clase `DolarAUY` que implemente `ConversorMoneda` y convierta dólares a pesos.
3. Desde el `main`, llama al método estático de la interfaz y también a la implementación de la clase.

---

## **Ejercicio 4 — Polimorfismo con interfaces**
**Consigna:**  
1. Crea una interfaz `Imprimible` con el método `imprimir()`.
2. Crea dos clases:  
   - `Factura` con atributos `numero` y `monto`.  
   - `Informe` con atributos `titulo` y `autor`.  
3. Ambas clases deben implementar `Imprimible` de forma que muestren su información formateada.
4. En un `main`, crea un arreglo de `Imprimible` y almacena varios objetos de ambos tipos.  
5. Recorre el arreglo y llama a `imprimir()` en cada elemento.

---

## **Ejercicio 5 — Interfaces en diseño real**
**Consigna:**  
Vas a diseñar un sistema para procesar pagos.  
1. Define una interfaz `ProcesadorPago` con el método `procesarPago(double monto)`.  
2. Implementa dos clases:  
   - `PagoTarjeta` que imprime `"Procesando pago con tarjeta por X pesos"`.  
   - `PagoPayPal` que imprime `"Procesando pago con PayPal por X pesos"`.  
3. En un `main`, crea una lista de `ProcesadorPago` y procesa varios pagos con diferentes métodos.

---

## **Ejercicio 6 — Herencia entre interfaces**
**Consigna:**  
1. Define una interfaz `Trabajador` con el método `trabajar()`.  
2. Define otra interfaz `Jefe` que herede de `Trabajador` y agregue el método `tomarDecisiones()`.  
3. Implementa una clase `Gerente` que implemente `Jefe`.  
4. En el `main`, demuestra que `Gerente` puede usarse como `Trabajador` o como `Jefe`.
