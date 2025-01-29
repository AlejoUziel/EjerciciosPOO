# Proyecto de Ejercicios en Java

## Descripción
Este repositorio contiene una serie de ejercicios en Java desarrollados como parte de mi aprendizaje en Ingeniería en Sistemas. Cada ejercicio está diseñado para fortalecer conceptos clave en programación.

## Datos del Desarrollador
- **Nombre:** Alejandro
- **Ubicación:** Roatán, Honduras
- **Estudios:** Ingeniería en Sistemas

## Requisitos
Para ejecutar estos ejercicios, asegúrate de tener lo siguiente instalado en tu sistema:
- Java JDK 11 o superior
- Visual Studio Code con la extensión de Java instalada

## Instalación y Uso
1. **Clonar este repositorio o descargar los archivos:**
   ```bash
   git clone https://github.com/AlejoUziel/EjerciciosPOO
   ```
2. **Abrir el proyecto en Visual Studio Code:**
   - Abre VS Code y selecciona "Abrir carpeta".
   - Selecciona la carpeta del proyecto.
3. **Ejecutar los archivos Java:**
   - Abre el archivo `.java` que deseas ejecutar.
   - Haz clic en el botón "Ejecutar" o usa el atajo `Ctrl + F5`.

## Ejercicios
### **Ejercicio 1: Creación de una Clase**
1. Crea una clase llamada `Persona` con los atributos `nombre`, `edad` y `genero`.
2. Implementa un constructor para inicializar los atributos.
3. Agrega un método llamado `presentarse()` que imprima un mensaje como: "Hola, mi nombre es [nombre], tengo [edad] años y soy [genero]".
4. En el método principal (`main`), crea dos objetos de tipo `Persona` y llama al método `presentarse()` para cada uno.

### **Ejercicio 2: Uso de Métodos Estáticos**
1. Crea una clase llamada `Calculadora` con métodos estáticos para:
   - Sumar dos números.
   - Restar dos números.
   - Multiplicar dos números.
   - Dividir dos números.
2. En el método principal (`main`), invoca estos métodos y muestra los resultados en la consola.

### **Ejercicio 3: Validación de Edad**
1. Crea una clase llamada `Usuario` con los atributos `nombre` y `edad`.
2. Agrega un método llamado `esMayorDeEdad()` que devuelva `true` si el usuario tiene 18 años o más, y `false` en caso contrario.
3. En el método principal (`main`), crea un objeto `Usuario`, asigna valores y verifica si el usuario es mayor de edad mostrando un mensaje adecuado.

### **Ejercicio 4: Gestión de Libros**
1. Crea una clase llamada `Libro` con los atributos `titulo`, `autor` y `numeroPaginas`.
2. Agrega un método llamado `mostrarDetalles()` que imprima la información del libro.
3. En el método principal (`main`), crea una lista (`ArrayList`) de libros, agrega al menos tres libros y muestra los detalles de cada uno recorriendo la lista con un bucle.

### **Ejercicio 5: Herencia Básica**
1. Crea una clase base llamada `Vehiculo` con los atributos `marca` y `modelo` y un método llamado `mostrarInformacion()`.
2. Crea una clase hija llamada `Coche` que herede de `Vehiculo` y tenga un atributo adicional `numeroPuertas`.
3. En el método principal (`main`), crea un objeto de la clase `Coche` y utiliza el método `mostrarInformacion()` para mostrar la información del coche.

### **Ejercicio 6: Sistema de Gestión de Animales**
1. Crear una clase abstracta `Animal` con:
   - Atributos como `nombre`, `edad` y `tipo` (terrestre, acuático o ambos).
   - Métodos abstractos como `hacerSonido()` y `moverse()`.
2. Crear al menos tres clases concretas que extiendan la clase `Animal`:
   - Ejemplo: `Leon`, `Delfin`, `Cocodrilo`.
   - Cada una debe implementar los métodos abstractos de manera específica.
3. En la clase principal:
   - Crear una lista de animales (`ArrayList<Animal>`).
   - Agregar diferentes tipos de animales a la lista.
   - Recorrer la lista e invocar los métodos `hacerSonido()` y `moverse()` mediante polimorfismo.

### **Ejercicio 7: Sistema de Gestión de Facturas**
1. Crear una clase `Producto` con:
   - Atributos: `nombre`, `precioUnitario` y `categoria`.
   - Un método que retorne el precio con un posible descuento dependiendo de la categoría.
2. Crear una clase `Factura` con:
   - Atributos: `numeroFactura`, `listaProductos` (una lista de objetos de tipo `Producto`) y `fecha`.
   - Métodos:
     - `agregarProducto(Producto p)` para agregar un producto a la lista.
     - `calcularTotal()` para calcular el total de la factura considerando los descuentos.
3. En la clase principal:
   - Crear varios productos y agregarlos a una factura.
   - Imprimir el desglose de la factura (productos, precios, descuentos, total final).


¡Gracias por revisar este proyecto! 🚀
