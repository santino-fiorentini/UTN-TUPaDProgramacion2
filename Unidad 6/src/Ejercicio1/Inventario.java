package Ejercicio1;

import java.util.ArrayList;

public class Inventario {

    private final ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (p != null && buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        } else {
            System.out.println("Producto duplicado.");
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }

        return null;
    }

    public void eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);

        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);

        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean encontrado = false;

        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                producto.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos en esa categoria.");
        }
    }

    public int obtenerTotalStock() {
        int total = 0;

        for (Producto producto : productos) {
            total += producto.getCantidad();
        }

        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto mayor = productos.get(0);

        for (Producto producto : productos) {
            if (producto.getCantidad() > mayor.getCantidad()) {
                mayor = producto;
            }
        }

        return mayor;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        boolean encontrado = false;

        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                producto.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precio.");
        }
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + " -> " + categoria.getDescripcion());
        }
    }
}