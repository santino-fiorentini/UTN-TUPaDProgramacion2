public class Main {

    public static void main(String[] args) {

        // Creación de cursos
        Curso c1 = new Curso("Java", 40, 200);
        Curso c2 = new Curso("Python", 25);
        Curso c3 = new Curso("HTML", 30, 150);

        // Actualización de precios
        c1.actualizarPrecio(5.0);
        c2.actualizarPrecio(25);

        // Mostrar cursos
        System.out.println("CURSOS:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Mostrar total de cursos
        System.out.println("\nTotal de cursos: " + Curso.mostrarTotalCursos());

        // Pruebas con datos inválidos
        System.out.println("\nPRUEBAS CON DATOS INVÁLIDOS:");

        Curso c4 = new Curso("", -10, -100);
        System.out.println("Curso creado con datos inválidos (corregido automáticamente):");
        System.out.println(c4);

        // Intentos de modificación inválidos
        c1.setPrecio(-50);
        c2.setDuracionHoras(0);
        c3.actualizarPrecio(-10);

        // Resultado final
        System.out.println("\nCURSOS:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}