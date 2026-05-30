package Ejercicio3;

import java.util.ArrayList;

public class Profesor {

    private final String id;
    private final String nombre;
    private final String especialidad;
    private final ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void eliminarCurso(Curso c) {
        cursos.remove(c);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No dicta cursos.");
            return;
        }

        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo() + " - " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
    
    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}