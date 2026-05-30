package Ejercicio_03;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Santino", 7);
        Alumno a2 = new Alumno("Agustina");

        a2.actualizarPromedio(new double[]{5, 6, 7});

        System.out.println(a1);
        System.out.println(a2);

        Alumno.cambiarNotaAprobacion(7);

        System.out.println("Nuevo criterio de aprobación (7):");
        System.out.println(a1);
        System.out.println(a2);
    }
}