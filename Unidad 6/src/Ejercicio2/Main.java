package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiano");
        Autor a2 = new Autor("A002", "Julio Cortazar", "Argentino");
        Autor a3 = new Autor("A003", "Jorge Luis Borges", "Argentino");

        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "El amor en los tiempos del colera", 1985, a1);
        biblioteca.agregarLibro("L003", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("L004", "Bestiario", 1951, a2);
        biblioteca.agregarLibro("L005", "Ficciones", 1944, a3);

        System.out.println("LISTADO DE LIBROS:");
        biblioteca.listarLibros();

        System.out.println("BUSCAR LIBRO POR ISBN:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("L003");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("FILTRAR LIBROS POR AÑO:");
        biblioteca.filtrarLibrosPorAnio(1967);

        System.out.println("ELIMINAR LIBRO L002:");
        biblioteca.eliminarLibro("L002");
        System.out.println();

        System.out.println("LISTA ACTUALIZADA:");
        biblioteca.listarLibros();

        System.out.println("CANTIDAD TOTAL DE LIBROS:");
        System.out.println(biblioteca.obtenerCantidadLibros());
        System.out.println();

        System.out.println("AUTORES DISPONIBLES:");
        biblioteca.mostrarAutoresDisponibles();
        System.out.println();
    }
}