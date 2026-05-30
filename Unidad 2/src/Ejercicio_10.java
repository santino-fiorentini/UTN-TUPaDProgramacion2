import java.util.Scanner;

public class Ejercicio_10 {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el stock actual: ");
        int stock = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();

        if (vendida > stock) {
            System.out.println("Error: no se puede vender más de lo disponible.");
            return;
        }

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("El nuevo stock es: " + nuevoStock);
    }
}