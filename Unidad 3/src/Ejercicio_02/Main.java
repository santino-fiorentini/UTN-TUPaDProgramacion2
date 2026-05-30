package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Mascota m = new Mascota();

        m.setEdad(-1);

        m.setNombre("Chester");
        m.setEspecie("Perro");
        m.setEdad(3);

        m.mostrarInfo();

        m.cumplirAnios();
        m.cumplirAnios();

        m.mostrarInfo();
    }
}