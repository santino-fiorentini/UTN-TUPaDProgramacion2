package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Gallina a = new Gallina();
        Gallina b = new Gallina();

        a.setIdGallina(1);
        b.setIdGallina(2);

        a.setEdad(-1);

        a.setEdad(2);
        b.setEdad(1);

        a.ponerHuevo();
        a.ponerHuevo();
        b.ponerHuevo();

        a.mostrarEstado();
        b.mostrarEstado();
    }
}