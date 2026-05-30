package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Santino", "3464556677");
        Mesa mesa = new Mesa(5, 4);

        Reserva reserva =
                new Reserva(
                        "27/04/2026",
                        "21:30",
                        cliente,
                        mesa
                );

        System.out.println(reserva);
    }
}