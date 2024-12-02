# Proyecto de Ejemplo de Clases Genéricas en Java

## ¿Qué son las clases genéricas?

Las **clases genéricas** en Java son clases que pueden trabajar con diferentes tipos de datos, sin importar si son números, palabras o cualquier otro tipo. En lugar de escribir clases diferentes para cada tipo de dato, podemos escribir una sola clase que funcione para todo.

### ¿Cómo funciona el ejemplo?

En este ejemplo, hemos creado una clase llamada `Box`. La clase `Box` es como una caja donde podemos poner cualquier cosa que queramos. No importa si es un número (como 10), una palabra (como "Hola"), o un número decimal (como 3.14), la caja puede guardarlo todo.

#### ¿Qué hace la clase `Box`?

1. **Guarda lo que pongamos en ella**. En vez de tener una caja para números, otra para palabras, y otra para decimales, usamos una sola clase que puede guardar todo tipo de cosas.
2. **Podemos ver lo que hay dentro**. Usamos el método `printValue()` para ver lo que guardamos en la caja.

### ¿Por qué es útil?

Las clases genéricas son útiles porque nos permiten escribir código más limpio y reutilizable. En lugar de escribir varias clases para diferentes tipos de datos, usamos una sola clase que puede manejar todos esos tipos.

### ¿Cómo lo usamos?

Creamos una instancia de `Box` y le decimos qué tipo de cosa queremos guardar dentro (un número, una palabra, etc.). Luego, podemos acceder a lo que hay dentro de la caja.

Por ejemplo:
- Creamos una caja para un número con `Box<Integer>`.
- Creamos una caja para una palabra con `Box<String>`.
- Creamos una caja para un número decimal con `Box<Double>`.
