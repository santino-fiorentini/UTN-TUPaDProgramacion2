public class Curso {

    // Atributos
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos = 0;

    // Constructor completo
    public Curso(String nombre, int duracionHoras, double precio) {

        // Validaciones
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Sin nombre";
        }

        if (duracionHoras <= 0) {
            duracionHoras = 1;
        }

        if (precio < 0) {
            precio = 0;
        }

        totalCursos++;
        this.id = totalCursos;

        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
    }

    // Constructor reducido
    public Curso(String nombre, int duracionHoras) {
        this(nombre, duracionHoras, 100);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    // Métodos sobrecargados
    public void actualizarPrecio(double porcentaje) {
        if (porcentaje >= 0) {
            this.precio += this.precio * porcentaje / 100;
        }
    }

    public void actualizarPrecio(int monto) {
        if (monto >= 0) {
            this.precio += monto;
        }
    }

    // Método estático
    public static int mostrarTotalCursos() {
        return totalCursos;
    }

    // toString
    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Duración: " + duracionHoras + "hs" + " | Precio: $" + precio;
    }
}