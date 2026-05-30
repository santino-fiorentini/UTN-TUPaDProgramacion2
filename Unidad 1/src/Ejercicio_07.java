import java.util.Scanner;

public class Ejercicio_07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORREGIDO: nextInt() solo lee números, no texto.

        System.out.println("Hola, " + nombre);
    }
}