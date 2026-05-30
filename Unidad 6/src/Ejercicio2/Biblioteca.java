package Ejercicio2;

import java.util.ArrayList;

public class Biblioteca {

    private final String nombre;
    private final ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(libro);
        } else {
            System.out.println("ISBN duplicado.");
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }

        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);

        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrado = false;

        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros de ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        ArrayList<String> autoresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();

            if (!autoresMostrados.contains(nombreAutor)) {
                System.out.println(nombreAutor + " - " + libro.getAutor().getNacionalidad());
                autoresMostrados.add(nombreAutor);
            }
        }
    }
}