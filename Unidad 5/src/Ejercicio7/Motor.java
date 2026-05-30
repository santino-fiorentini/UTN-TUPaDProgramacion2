package Ejercicio7;

public class Motor {
    private String tipo;
    private int numeroSerie;

    public Motor(String tipo, int numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNumeroSerie() { 
        return numeroSerie; 
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor: " + tipo + " - " + numeroSerie;
    }
}