package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();

        e.setNombre("");
        e.setCalificacion(11);

        e.setNombre("Santino");
        e.setApellido("Fiorentini");
        e.setCurso("Programación");
        e.setCalificacion(8);

        e.mostrarInfo();

        e.subirCalificacion(3);
        e.bajarCalificacion(2);

        e.mostrarInfo();
    }
}