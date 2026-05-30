package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto(
                        "Video Explicativo",
                        15
                );

        EditorVideo editor = new EditorVideo();

        editor.exportar(
                "MP4",
                proyecto
        );
    }
}