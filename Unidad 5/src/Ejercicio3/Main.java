package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Borges", "Argentina");
        Editorial editorial = new Editorial("Planeta", "Buenos Aires");

        Libro libro =
                new Libro(
                        "Ficciones",
                        "123456",
                        autor,
                        editorial
                );

        System.out.println(libro);
    }
}