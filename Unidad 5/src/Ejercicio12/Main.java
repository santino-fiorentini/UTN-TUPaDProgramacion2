package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente(
                        "Santino",
                        "20-47442307-3"
                );

        Impuesto impuesto = new Impuesto(
                        45000,
                        contribuyente
                );

        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }
}