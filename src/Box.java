// Clase Box que puede almacenar cualquier tipo de dato
public class Box<T> {  // <T> significa "tipo", pero lo vamos a cambiar por algo real cuando usemos la caja
    private T value;  // Aquí guardamos lo que pongamos en la caja

    // Constructor de la caja, nos permite poner algo dentro cuando la creamos
    public Box(T value) {
        this.value = value;
    }

    // Método para obtener lo que hay en la caja
    public T getValue() {
        return value;
    }

    // Método para poner algo nuevo dentro de la caja
    public void setValue(T value) {
        this.value = value;
    }

    // Método para mostrar lo que hay en la caja
    public void printValue() {
        System.out.println("El valor en la caja es: " + value);
    }
}
