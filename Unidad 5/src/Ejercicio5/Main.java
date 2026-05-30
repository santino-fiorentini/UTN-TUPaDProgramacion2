package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Propietario propietario = new Propietario("Santino", 47442307);

        Computadora pc = new Computadora(
                        "Lenovo",
                        123456789,
                        "K321P",
                        "Intel",
                        propietario
                );

        System.out.println(pc);
    }
}