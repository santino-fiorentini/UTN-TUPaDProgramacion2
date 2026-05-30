package Ejercicio_02;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) this.nombre = nombre;
        else System.out.println("Nombre inválido");
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) {
        if(especie != null && !especie.isEmpty()) this.especie = especie;
        else System.out.println("Especie inválida");
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if(edad >= 0) this.edad = edad;
        else System.out.println("Edad inválida");
    }

    public void cumplirAnios(){
        edad++;
        System.out.println("Cumplió años. Edad: " + edad);
    }

    public void mostrarInfo(){
        System.out.println(nombre + " - " + especie + " - Edad: " + edad);
    }
}