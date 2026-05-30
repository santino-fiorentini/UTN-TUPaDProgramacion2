package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista(
                        "Coldplay",
                        "Rock"
                );

        Cancion cancion = new Cancion(
                        "Yellow",
                        artista
                );

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}