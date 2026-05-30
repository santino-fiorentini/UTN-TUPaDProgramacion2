package Ejercicio_05;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCombustible() { return combustible; }
    public void setCombustible(int combustible) {
        if(combustible >= 0 && combustible <= CAPACIDAD_MAXIMA)
            this.combustible = combustible;
        else System.out.println("Combustible inválido");
    }

    public void despegar(){
        if(combustible >= 5) combustible -= 5;
        else System.out.println("No hay combustible para despegar");
    }

    public void avanzar(int distancia){
        int consumo = distancia * 2;
        if(combustible >= consumo) combustible -= consumo;
        else System.out.println("Combustible insuficiente");
    }

    public void recargarCombustible(int cantidad){
        if(combustible + cantidad <= CAPACIDAD_MAXIMA)
            combustible += cantidad;
        else System.out.println("Supera capacidad máxima");
    }

    public void mostrarEstado(){
        System.out.println(nombre + " - Combustible: " + combustible);
    }
}