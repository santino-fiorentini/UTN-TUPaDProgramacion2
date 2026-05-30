package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular(
                        "Santino",
                        47442307
                );

        CuentaBancaria cuenta = new CuentaBancaria(
                        "000123456789",
                        500000,
                        123,
                        "27/04/2026",
                        titular
                );

        System.out.println(cuenta);
    }
}