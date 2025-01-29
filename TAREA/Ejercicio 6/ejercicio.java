import java.util.ArrayList;
import java.util.List;

// Clase abstracta Animal
abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String tipo;

    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Métodos abstractos
    public abstract void hacerSonido();
    public abstract void moverse();
}

// Clase concreta Leon que extiende de Animal
class Leon extends Animal {
    public Leon(String nombre, int edad) {
        super(nombre, edad, "Terrestre");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre.");
    }
}

// Clase concreta Delfin que extiende de Animal
class Delfin extends Animal {
    public Delfin(String nombre, int edad) {
        super(nombre, edad, "Acuático");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace clics y silbidos.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " nada.");
    }
}

// Clase concreta Cocodrilo que extiende de Animal
class Cocodrilo extends Animal {
    public Cocodrilo(String nombre, int edad) {
        super(nombre, edad, "Ambos");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " gruñe.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " camina y nada.");
    }
}

// Clase principal
public class ejercicio {
    public static void main(String[] args) {
        // Crear una lista de animales
        List<Animal> animales = new ArrayList<>();

        // Agregar diferentes tipos de animales a la lista
        animales.add(new Leon("Simba", 5));
        animales.add(new Delfin("Flipper", 8));
        animales.add(new Cocodrilo("Coco", 12));

        // Recorrer la lista e invocar los métodos hacerSonido() y moverse() mediante polimorfismo
        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.moverse();
        }
    }
}