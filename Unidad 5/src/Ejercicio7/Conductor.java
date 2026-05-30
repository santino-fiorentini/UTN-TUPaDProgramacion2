package Ejercicio7;

public class Conductor {
    private String nombre;
    private int licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, int licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getLicencia() { 
        return licencia; 
    }
    public void setLicencia(int licencia) { 
        this.licencia = licencia; 
    }

    public Vehiculo getVehiculo() { 
        return vehiculo; 
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor: " + nombre + " - " + licencia;
    }
}