package Ejercicio_01;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(1, "Juan", "Developer", 100000);
        Empleado e2 = new Empleado("Ana", "Tester");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(5000);

        e1.actualizarSalario(-100); // inválido

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}