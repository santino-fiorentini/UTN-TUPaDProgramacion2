package Ejercicio_04;

public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        setPrecioBase(precioBase);
    }

    public Producto(String nombre) {
        this(nombre, 100);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0)
            precioBase -= precioBase * porcentaje / 100;
    }

    public void aplicarDescuento(double porcentaje, double minimo) {
        if (porcentaje > 0) {
            double nuevo = precioBase - precioBase * porcentaje / 100;
            if (nuevo >= minimo)
                precioBase = nuevo;
        }
    }

    public double calcularPrecioFinal() {
        return precioBase * (1 + IVA);
    }

    public static void cambiarIVA(double nuevo) {
        if (nuevo >= 0)
            IVA = nuevo;
    }

    public final void setPrecioBase(double precioBase) {
        if (precioBase >= 0)
            this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return nombre + " - Precio base: $" + precioBase + " - Precio final: $" + String.format("%.2f", calcularPrecioFinal());
    }
}