package Ejercicio3;

public class Curso {

    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {

        if (this.profesor == nuevoProfesor) {
            return;
        }

        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = nuevoProfesor;

        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Curso: " + nombre);

        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: Sin asignar");
        }

        System.out.println();
    }
    
    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}