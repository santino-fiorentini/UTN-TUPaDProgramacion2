package Interfaces;

public class PayPal
        implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95;
    }
}
