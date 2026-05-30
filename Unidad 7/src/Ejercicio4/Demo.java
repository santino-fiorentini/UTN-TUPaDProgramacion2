package Ejercicio4;

public class Demo {

    public static void main(String[] args) {

        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Perro");
        animales[1] = new Gato("Gato");
        animales[2] = new Vaca("Vaca");

        for (Animal animal : animales) {

            animal.describirAnimal();
            animal.hacerSonido();

            System.out.println();
        }
    }
}