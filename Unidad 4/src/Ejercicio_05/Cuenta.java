package Ejercicio_05;

public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    public Cuenta(String titular, double saldoInicial) {
        this.numero = ++ultimoNumero;
        this.titular = titular;
        if (saldoInicial >= 0)
            this.saldo = saldoInicial;
        totalCuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public double consultarSaldo() {
        return saldo;
    }
    
    public double consultarSaldo(double cotizacion) {
        return saldo / cotizacion;
    }

    public double consultarSaldoEnUSD() {
        return saldo / 1360;
    }

    public void depositar(double monto) {
        if (monto > 0)
            saldo += monto;
    }

    public void extraer(double monto) {
        if (monto > 0 && saldo >= monto)
            saldo -= monto;
    }

    public static int mostrarTotalCuentas() {
        return totalCuentas;
    }

    @Override
    public String toString() {
        return "Cuenta " + numero + " - Titular: " + titular + " - Saldo: $" + String.format("%.2f", saldo) + " - USD: $" + String.format("%.2f", consultarSaldoEnUSD());
    }
}