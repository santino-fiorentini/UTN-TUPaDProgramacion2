package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                        "Santino",
                        "santino@gmail.com"
                );

        GeneradorQR generador = new GeneradorQR();

        generador.generar(
                "https://google.com",
                usuario
        );
    }
}