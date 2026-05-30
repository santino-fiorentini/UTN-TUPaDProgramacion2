package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad Tecnológica Nacional");

        Profesor p1 = new Profesor("P001", "Juan Perez", "Programación");
        Profesor p2 = new Profesor("P002", "Maria Lopez", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Carlos Gomez", "Matematica");

        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        Curso c1 = new Curso("C001", "Java");
        Curso c2 = new Curso("C002", "SQL");
        Curso c3 = new Curso("C003", "Algebra");
        Curso c4 = new Curso("C004", "POO");
        Curso c5 = new Curso("C005", "Estadística");

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P003");
        universidad.asignarProfesorACurso("C004", "P001");
        universidad.asignarProfesorACurso("C005", "P003");

        System.out.println("\nLISTADO DE CURSOS:");
        universidad.listarCursos();

        System.out.println("LISTADO DE PROFESORES:");
        universidad.listarProfesores();

        System.out.println("CAMBIAR PROFESOR DE C001:");
        universidad.asignarProfesorACurso("C001", "P002");
        System.out.println();

        universidad.listarProfesores();

        System.out.println("ELIMINAR CURSO C004:");
        universidad.eliminarCurso("C004");
        System.out.println();

        universidad.listarProfesores();

        System.out.println("ELIMINAR PROFESOR P003:");
        universidad.eliminarProfesor("P003");
        System.out.println();

        System.out.println("CURSOS ACTUALIZADOS:");
        universidad.listarCursos();

        System.out.println("REPORTE FINAL:");
        universidad.mostrarReporteCursosPorProfesor();
        System.out.println();
    }
}