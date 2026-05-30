package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        NaveEspacial n = new NaveEspacial();

        n.setNombre("SF7");
        n.setCombustible(50);

        n.despegar();
        n.avanzar(30);

        n.recargarCombustible(60);
        n.recargarCombustible(30);

        n.despegar();
        n.avanzar(25);

        n.mostrarEstado();
    }
}