package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                        "Santino",
                        "OSDE"
                );

        Profesional profesional = new Profesional(
                        "Dr. Valentini",
                        "Odontologìa"
                );

        CitaMedica cita = new CitaMedica(
                        "28/04/2026",
                        "10:30",
                        paciente,
                        profesional
                );

        System.out.println(cita);
    }
}