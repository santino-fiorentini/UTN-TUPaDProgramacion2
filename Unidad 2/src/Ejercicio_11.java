import java.util.Scanner;

public class Ejercicio_11 {

    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuento;

        System.out.println("El descuento especial aplicado es: " + descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}