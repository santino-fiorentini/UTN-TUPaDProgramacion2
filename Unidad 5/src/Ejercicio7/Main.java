package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", 123456789);
        Conductor conductor = new Conductor("Santino", 47442307);

        Vehiculo auto = new Vehiculo(
                        "AB123CD",
                        "Corolla",
                        motor,
                        conductor
                );

        System.out.println(auto);
    }
}