package Ejercicio5;

public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, int numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre =
                new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public String getMarca() { 
        return marca; 
    }
    public void setMarca(String marca) { 
        this.marca = marca; 
    }

    public int getNumeroSerie() { 
        return numeroSerie; 
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() { 
        return placaMadre; 
    }

    public Propietario getPropietario() { 
        return propietario; 
    }

    @Override
    public String toString() {
        return "Computadora: " + marca + "\n" + placaMadre + "\n" + propietario;
    }
}