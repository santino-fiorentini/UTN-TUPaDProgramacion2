package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BAT5000", 5000);
        Usuario usuario = new Usuario("Santino", 47442307);

        Celular celular = new Celular(
                        123456789,
                        "Samsung",
                        "S24",
                        bateria,
                        usuario
                );

        System.out.println(celular);
    }
}