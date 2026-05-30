package Ejercicio_01;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) this.nombre = nombre;
        else System.out.println("Nombre inválido");
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if(apellido != null && !apellido.isEmpty()) this.apellido = apellido;
        else System.out.println("Apellido inválido");
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) {
        if(curso != null && !curso.isEmpty()) this.curso = curso;
        else System.out.println("Curso inválido");
    }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 10) this.calificacion = calificacion;
        else System.out.println("Calificación inválida");
    }

    public void subirCalificacion(double puntos){
        if(calificacion + puntos <= 10) calificacion += puntos;
        else System.out.println("Supera el máximo");
    }

    public void bajarCalificacion(double puntos){
        if(calificacion - puntos >= 0) calificacion -= puntos;
        else System.out.println("No puede ser menor a 0");
    }

    public void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " - " + curso + " - Nota: " + calificacion);
    }
}