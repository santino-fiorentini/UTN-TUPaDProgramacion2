package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) {

        try {

            File archivo = new File("src/Excepciones/archivo.txt");

            Scanner sc = new Scanner(archivo);

            while(sc.hasNextLine()) {
                
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado");
        }
    }
}