package Interfaces;

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente("Santino");

        Pedido pedido =
                new Pedido(cliente);

        pedido.agregarProducto(
                new Producto("Mouse", 15000));

        pedido.agregarProducto(
                new Producto("Teclado", 30000));

        double total = pedido.calcularTotal();

        System.out.println(
                "Total pedido: $" + total);

        TarjetaCredito tc =
                new TarjetaCredito();

        double descuento =
                tc.aplicarDescuento(total);

        tc.procesarPago(descuento);

        pedido.cambiarEstado("Enviado");
    }
}
