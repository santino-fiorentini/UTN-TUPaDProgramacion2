package Ejercicio3;

public class Demo {

    public static void main(String[] args) {

        Empleado[] empleados = {
            new EmpleadoPlanta("Santino", 350000),
            new EmpleadoTemporal("Lucas", 80, 2500)
        };

        for (Empleado empleado : empleados) {

            System.out.println("Empleado: " + empleado.getNombre());

            if (empleado instanceof EmpleadoPlanta ep) {

                System.out.println("Tipo: Empleado de planta");
                System.out.println("Sueldo fijo: $" + ep.calcularSueldo());

            } else if (empleado instanceof EmpleadoTemporal et) {

                System.out.println("Tipo: Empleado temporal");
                System.out.println("Sueldo total: $" + et.calcularSueldo());
            }

            System.out.println();
        }
    }
}