package T4ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la fecha en formato largo (e.g., 5 de agosto de 2022): ");
        String fechaLarga = scanner.nextLine();

        // Definir el formateador para el formato largo
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");

        // Definir el formateador para el formato corto
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Parsear la fecha larga a un objeto LocalDate
            LocalDate fecha = LocalDate.parse(fechaLarga, formatoLargo);

            // Formatear la fecha al formato corto
            String fechaCorta = fecha.format(formatoCorto);

            // Mostrar la fecha en formato corto
            System.out.println("La fecha en formato corto es: " + fechaCorta);
        } catch (DateTimeParseException e) {//Si introduce fecha incorrecta ERR
            System.out.println("Formato de fecha no válido. Asegúrate de usar el formato '5 de agosto de 2022'.");
        }
    }
}