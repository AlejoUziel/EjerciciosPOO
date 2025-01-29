import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor para inicializar los atributos
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        // Crear una lista de libros
        ArrayList<Libro> libros = new ArrayList<>();

        // Agregar al menos tres libros a la lista
        libros.add(new Libro("Las perras de teofilito", "Teofilo Trejo", 417));
        libros.add(new Libro("Cipotes", "Ramon Amaya", 863));
        libros.add(new Libro("El vampiro", "Froylan Turcios", 150));

        // Mostrar los detalles de cada libro recorriendo la lista con un bucle
        for (Libro libro : libros) {
            libro.mostrarDetalles();
        }
    }
}