package Excepciones;

import java.util.Scanner;

public class ValidacionEdad {

    public static void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 0 || edad > 120) {

            throw new EdadInvalidaException("La edad ingresada es inválida. Debe estar entre 0 y 120 años.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");

        int edad = sc.nextInt();

        try {

            validarEdad(edad);

            System.out.println("La edad ingresada es válida.");

        } catch (EdadInvalidaException e) {

            System.out.println(e.getMessage());

        }
    }
}