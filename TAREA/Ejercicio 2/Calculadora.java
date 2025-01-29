// Creación de una clase Calculadora con métodos estáticos para realizar operaciones matemáticas básicas
public class Calculadora {

    // Método estático para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método estático para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método estático para dividir dos números
    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Invocar los métodos y mostrar los resultados en la consola
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División: " + dividir(a, b));
    }
}