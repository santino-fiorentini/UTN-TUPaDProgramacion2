import java.util.Scanner;

public class Ejercicio_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = Math.max(a, Math.max(b, c));

        System.out.println("El mayor es: " + mayor);
    }
}