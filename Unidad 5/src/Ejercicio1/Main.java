package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Santino", 47442307);

        Pasaporte pasaporte =
                new Pasaporte(
                        "ARG123456",
                        "27/04/2026",
                        "foto.png",
                        "PNG",
                        titular
                );

        System.out.println(pasaporte);
    }
}