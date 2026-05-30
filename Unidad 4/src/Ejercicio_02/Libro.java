package Ejercicio_02;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        setAutor(autor);
    }

    public Libro(String titulo, String autor, String editorial) {
        this(titulo, autor);
        cambiarEditorial(editorial);
    }

    public void actualizarTitulo(String nuevo) {
        if (nuevo != null && !nuevo.isEmpty())
            this.titulo = nuevo;
    }

    public void actualizarTitulo(String prefijo, String nuevo) {
        if (nuevo != null && !nuevo.isEmpty())
            this.titulo = prefijo + " " + nuevo;
    }

    public static void cambiarEditorial(String nueva) {
        if (nueva != null && !nueva.isEmpty())
            editorial = nueva;
    }

    public final void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty())
            this.titulo = titulo;
    }

    public final void setAutor(String autor) {
        if (autor != null && !autor.isEmpty())
            this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + editorial + ")";
    }
}