package Interfaces;

import java.util.ArrayList;

public class Pedido implements Pagable {

    private final ArrayList<Producto> productos;
    private final Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado) {

        estado = nuevoEstado;

        cliente.notificar(
            "El pedido cambió a estado: " + estado);
    }
    
    @Override
    public double calcularTotal() {

        double total = 0;

        for (Producto p : productos) {
            total += p.calcularTotal();
        }

        return total;
    }
}