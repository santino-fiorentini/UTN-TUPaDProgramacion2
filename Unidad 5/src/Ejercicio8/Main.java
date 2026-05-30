package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                        "Santino",
                        "santino@gmail.com"
                );

        Documento doc = new Documento(
                        "Contrato",
                        "Contenido",
                        "HASH123",
                        "27/04/2026",
                        usuario
                );

        System.out.println(doc);
    }
}