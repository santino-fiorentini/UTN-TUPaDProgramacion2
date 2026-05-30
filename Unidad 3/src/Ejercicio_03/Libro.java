package Ejercicio_03;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isEmpty()) this.titulo = titulo;
        else System.out.println("Título inválido");
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) {
        if(autor != null && !autor.isEmpty()) this.autor = autor;
        else System.out.println("Autor inválido");
    }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anio) {
        int actual = Year.now().getValue();
        if(anio > 0 && anio <= actual) this.anioPublicacion = anio;
        else System.out.println("Año inválido");
    }

    public void mostrarInfo(){
        System.out.println(titulo + " - " + autor + " - " + anioPublicacion);
    }
}