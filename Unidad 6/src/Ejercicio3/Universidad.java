package Ejercicio3;

import java.util.ArrayList;

public class Universidad {

    private final String nombre;
    private final ArrayList<Profesor> profesores;
    private final ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
        } else {
            System.out.println("Profesor duplicado.");
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
        } else {
            System.out.println("Curso duplicado.");
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }

        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }

        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {

        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor asignado correctamente.");
        } else {
            System.out.println("Curso o profesor no encontrado.");
        }
    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            profesor.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {

        Curso curso = buscarCursoPorCodigo(codigo);

        if (curso != null) {
            curso.setProfesor(null);
            cursos.remove(curso);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {

        Profesor profesor = buscarProfesorPorId(id);

        if (profesor != null) {

            ArrayList<Curso> copiaCursos = new ArrayList<>(profesor.getCursos());

            for (Curso curso : copiaCursos) {
                curso.setProfesor(null);
            }

            profesores.remove(profesor);
            System.out.println("Profesor eliminado correctamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        for (Profesor profesor : profesores) {
            System.out.println(
                    profesor.getNombre() + " dicta " +
                    profesor.getCursos().size() + " curso(s)."
            );
        }
    }
}