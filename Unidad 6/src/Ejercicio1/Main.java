package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Leche", 1200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares", 2800, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1500, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 3200, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 900, 80, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("LISTADO DE PRODUCTOS:");
        inventario.listarProductos();

        System.out.println("BUSCAR PRODUCTO POR ID:");
        Producto encontrado = inventario.buscarProductoPorId("P003");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("FILTRAR POR CATEGORIA: ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("ELIMINAR PRODUCTO P002:");
        inventario.eliminarProducto("P002");
        System.out.println();

        System.out.println("LISTA ACTUALIZADA:");
        inventario.listarProductos();

        System.out.println("ACTUALIZAR STOCK P001:");
        inventario.actualizarStock("P001", 100);
        System.out.println();

        Producto actualizado = inventario.buscarProductoPorId("P001");
        if (actualizado != null) {
            actualizado.mostrarInfo();
        }

        System.out.println("TOTAL DE STOCK:");
        System.out.println(inventario.obtenerTotalStock());
        System.out.println();

        System.out.println("PRODUCTO CON MAYOR STOCK:");
        Producto mayor = inventario.obtenerProductoConMayorStock();

        if (mayor != null) {
            mayor.mostrarInfo();
        }

        System.out.println("PRODUCTOS ENTRE $1000 Y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("CATEGORIAS DISPONIBLES:");
        inventario.mostrarCategoriasDisponibles();
        System.out.println();
    }
}