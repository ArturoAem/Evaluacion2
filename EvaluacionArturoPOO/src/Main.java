public class Main {
    public static void main(String[] args) {
        ProductoLibro libro1 = new ProductoLibro("Harry Potter", 300, "12345A", "Aventura de un mago");
        ProductoLibro libro2 = new ProductoLibro("El señor de los anillos", 250, "12345B", "Aventura de un Hobbit");
        ProductoRevista revista1 = new ProductoRevista("La nueva moda", 150, "12345C", "Lo último en moda");
        ProductoRevista revista2 = new ProductoRevista("La ciencia de los agujeros negros", 300, "12345A", "Descubrimientos del espacio");

        Categoria categoria1 = new Categoria("Fantasia");
        categoria1.addProductos(libro1);
        categoria1.addProductos(libro2);

        Categoria categoria2 = new Categoria("Moda");
        categoria2.addProductos(revista1);

        Categoria categoria3 = new Categoria("Ciencia");
        categoria3.addProductos(revista2);


        Libreria libreria1 = new Libreria("entretenimiento");
        libreria1.agregarCategoria(categoria1);
        libreria1.agregarCategoria(categoria2);
        libreria1.agregarCategoria(categoria3);

        libreria1.mostrarInventario();

        inventario<ProductoLibro> inventarioLibros = new inventario<>();
        inventarioLibros.add(libro1);
        inventarioLibros.add(libro2);

        System.out.println("Inventario libros: ");
        inventarioLibros.getInventario().stream().forEach(producto -> System.out.println(producto.getNombre()));


        inventario<ProductoRevista> inventarioRevistas = new inventario<>();

        inventarioRevistas.add(revista1);
        inventarioRevistas.add(revista2);
        System.out.println("Inventario Revistas:");
        inventarioRevistas.getInventario().stream().forEach(producto -> System.out.println(producto.getNombre()));


    }
    }