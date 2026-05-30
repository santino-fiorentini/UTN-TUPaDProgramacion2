package Ejercicio_04;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Notebook", 1500);
        Producto p2 = new Producto("Mouse");

        p1.aplicarDescuento(10);
        p2.aplicarDescuento(20, 75);

        Producto p3 = new Producto("Teclado", -100); // inválido

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Producto.cambiarIVA(0.15);

        System.out.println("IVA actualizado:");
        System.out.println(p1);
        System.out.println(p2);
    }
}