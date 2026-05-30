package Ejercicio2;

public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(int imei, String marca, String modelo,
                   Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    public int getImei() { 
        return imei; 
    }
    
    public void setImei(int imei) { 
        this.imei = imei; 
    }

    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }

    public String getModelo() { 
        return modelo; 
    }
    
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }

    public Bateria getBateria() { 
        return bateria; 
    }
    
    public void setBateria(Bateria bateria) { 
        this.bateria = bateria; 
    }

    public Usuario getUsuario() { 
        return usuario; 
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return "Celular: " + marca + " " + modelo + "\n" + bateria + "\n" + usuario;
    }
}