package Ejercicio2;

public class Demo {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo("Círculo", 5);
        figuras[1] = new Rectangulo("Rectángulo", 4, 6);

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getNombre());
            System.out.println("Área: " + String.format("%.2f", figura.calcularArea()));
            System.out.println();
        }
    }
}