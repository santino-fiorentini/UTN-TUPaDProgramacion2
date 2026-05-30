package Ejercicio4;

public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getDni() { 
        return dni; 
    }
    public void setDni(int dni) { 
        this.dni = dni; 
    }

    public TarjetaDeCredito getTarjeta() { 
        return tarjeta; 
    }
    
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " - " + dni;
    }
}