package Ejercicio_04;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() { return idGallina; }
    public void setIdGallina(int id) { this.idGallina = id; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if(edad >= 0) this.edad = edad;
        else System.out.println("Edad inválida");
    }

    public int getHuevosPuestos() { return huevosPuestos; }
    public void setHuevosPuestos(int huevos) {
        if(huevos >= 0) this.huevosPuestos = huevos;
        else System.out.println("Huevos inválidos");
    }

    public void ponerHuevo(){ huevosPuestos++; }
    public void envejecer(){ edad++; }

    public void mostrarEstado(){
        System.out.println("ID: " + idGallina + " - Edad: " + edad + " - Huevos: " + huevosPuestos);
    }
}