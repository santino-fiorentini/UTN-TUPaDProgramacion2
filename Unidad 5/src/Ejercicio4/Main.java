package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Santino", 47442307);
        Banco banco = new Banco("Macro", "20-12345678-9");

        TarjetaDeCredito tarjeta =
                new TarjetaDeCredito(
                        "445566778899",
                        "04/30",
                        cliente,
                        banco
                );

        System.out.println(tarjeta);
    }
}