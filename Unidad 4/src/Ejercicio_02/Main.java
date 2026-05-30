package Ejercicio_02;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("Java", "Autor1");
        Libro l2 = new Libro("POO", "Autor2", "Planeta");

        l1.actualizarTitulo("Java 2");
        l2.actualizarTitulo("POO", "Avanzada");

        l1.actualizarTitulo(""); // inválido

        System.out.println(l1);
        System.out.println(l2);

        Libro.cambiarEditorial("Santillana");

        System.out.println(l1);
        System.out.println(l2);
    }
}