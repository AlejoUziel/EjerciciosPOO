public class Usuario {
    private String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para verificar si el usuario es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        // Crear un objeto Usuario y asignar valores
        Usuario usuario = new Usuario("Carlos", 20);

        // Verificar si el usuario es mayor de edad y mostrar un mensaje adecuado
        if (usuario.esMayorDeEdad()) {
            System.out.println(usuario.nombre + " es mayor de edad.");
        } else {
            System.out.println(usuario.nombre + " no es mayor de edad.");
        }
    }
}