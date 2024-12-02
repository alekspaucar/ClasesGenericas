public class App {
    public static void main(String[] args) throws Exception {
            // Crear una caja para guardar un número entero
            Box<Integer> integerBox = new Box<>(10);  // Aquí guardamos el número 10
            integerBox.printValue();  // Muestra el valor que hay en la caja: "El valor en la caja es: 10"
    
            // Crear una caja para guardar una palabra (String)
            Box<String> stringBox = new Box<>("Hola, mundo!");  // Aquí guardamos la palabra "Hola, mundo!"
            stringBox.printValue();  // Muestra el valor que hay en la caja: "El valor en la caja es: Hola, mundo!"
    
            // Crear una caja para guardar un número decimal
            Box<Double> doubleBox = new Box<>(3.14);  // Aquí guardamos el número 3.14
            doubleBox.printValue();  // Muestra el valor que hay en la caja: "El valor en la caja es: 3.14"
        }
    }