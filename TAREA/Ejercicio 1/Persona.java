public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + ", tengo " + edad + " años y soy " + genero + ".");
    }

    public static void main(String[] args) {
        // Crear dos objetos de tipo Persona
        Persona persona1 = new Persona("Alejandro", 30, "masculino");
        Persona persona2 = new Persona("Maria", 25, "femenino");

        // Llamar al método presentarse para cada uno
        persona1.presentarse();
        persona2.presentarse();
    }
}