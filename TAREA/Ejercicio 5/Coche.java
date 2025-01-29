// Ejercicio 5: Herencia Básica

// Clase base llamada Vehiculo
class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

// Clase hija llamada Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    private int numeroPuertas;

    // Constructor para inicializar los atributos
    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Método para mostrar la información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche coche = new Coche("Toyota", "Corolla", 4);

        // Utilizar el método mostrarInformacion para mostrar la información del coche
        coche.mostrarInformacion();
    }
}