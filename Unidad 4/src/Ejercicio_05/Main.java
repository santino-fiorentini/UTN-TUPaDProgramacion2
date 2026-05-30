package Ejercicio_05;

public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Santino", 2000);
        Cuenta c2 = new Cuenta("Agustina");

        c1.depositar(500);
        c2.depositar(1000);
        c1.extraer(3000); // inválido

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Total cuentas: " + Cuenta.mostrarTotalCuentas());
    }
}