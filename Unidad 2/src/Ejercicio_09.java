import java.util.Scanner;

public class Ejercicio_09 {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;

        } else if(zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;

        } else {
            System.out.println("Error: zona inválida.");
            return -1;
        }
    }

    public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese la zona (Nacional/Internacional): ");
        String zona = sc.next();

        double envio = calcularCostoEnvio(peso, zona);

        if (envio != -1) {
            double total = calcularTotalCompra(precio, envio);

            System.out.println("El costo de envío es: " + envio);
            System.out.println("El total a pagar es: " + total);
        }
    }
}