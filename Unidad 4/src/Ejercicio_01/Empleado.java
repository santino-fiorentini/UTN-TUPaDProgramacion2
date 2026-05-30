package Ejercicio_01;

public class Empleado {
    
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 50000);
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * porcentaje / 100;
        }   
    }

    public void actualizarSalario(int monto) {
        if (monto > 0) {
            salario += monto;
        }
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public final void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty())
            this.nombre = nombre;
    }

    public final void setPuesto(String puesto) {
        if (puesto != null && !puesto.isEmpty())
            this.puesto = puesto;
    }

    public final void setSalario(double salario) {
        if (salario >= 0)
            this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre +
               ", Puesto: " + puesto + ", Salario: $" + salario;
    }
}