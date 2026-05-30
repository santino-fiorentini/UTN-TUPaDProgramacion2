package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoSegura {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new FileReader("src/Excepciones/archivo.txt"))
        ) {

            String linea;

            while((linea = br.readLine()) != null) {

                System.out.println(linea);
            }

        } catch (IOException e) {

            System.out.println("Archivo no encontrado");
        }
    }
}