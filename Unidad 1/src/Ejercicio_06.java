import java.util.Scanner;

public class Ejercicio_06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();

        // División entera
        int resultadoInt = num1 / num2;
        System.out.println("División con int: " + resultadoInt);

        // División con double
        double resultadoDouble = (double) num1 / num2;
        System.out.println("División con double: " + resultadoDouble);
    }
}