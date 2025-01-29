import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase Producto
class Producto {
    private String nombre;
    private double precioUnitario;
    private String categoria;

    public Producto(String nombre, double precioUnitario, String categoria) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    // Metodo que retorna el precio con un posible descuento dependiendo de la categorias
    public double getPrecioConDescuento() {
        double descuento = 0.0;
        switch (categoria.toLowerCase()) {
            case "electronica":
                descuento = 0.10; // 10% de descuento
                break;
            case "ropa":
                descuento = 0.15; // 15% de descuento
                break;
            case "alimentos":
                descuento = 0.05; // 5% de descuento
                break;
            default:
                descuento = 0.0; // Sin descuento
                break;
        }
        return precioUnitario * (1 - descuento);
    }
}

// Clase Factura
class Factura {
    private String numeroFactura;
    private List<Producto> listaProductos;
    private Date fecha;

    public Factura(String numeroFactura, Date fecha) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.listaProductos = new ArrayList<>();
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    // Método para calcular el total de la factura considerando los descuentos
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : listaProductos) {
            total += p.getPrecioConDescuento();
        }
        return total;
    }

    // Método para imprimir el desglose de la factura
    public void imprimirFactura() {
        System.out.println("Factura No: " + numeroFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : listaProductos) {
            System.out.println("- " + p.getNombre() + " (" + p.getCategoria() + "): $" + p.getPrecioUnitario() + " -> $" + p.getPrecioConDescuento());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

// Clase principal
public class ejercicio {
    public static void main(String[] args) {
        // Crear varios productos
        Producto p1 = new Producto("Laptop", 1000.0, "Electronica");
        Producto p2 = new Producto("Camiseta", 20.0, "Ropa");
        Producto p3 = new Producto("Pan", 2.0, "Alimentos");

        // Crear una factura
        Factura factura = new Factura("001", new Date());

        // Agregar productos a la factura
        factura.agregarProducto(p1);
        factura.agregarProducto(p2);
        factura.agregarProducto(p3);

        // Imprimir el desglose de la factura
        factura.imprimirFactura();
    }
}