package Excepciones;

import java.util.Scanner;

public class ConversionNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");

        try {

            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido correctamente: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("El valor ingresado no es un número entero válido.");
        }

    }
}