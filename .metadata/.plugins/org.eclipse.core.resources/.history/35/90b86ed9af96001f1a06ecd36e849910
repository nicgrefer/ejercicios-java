package T4ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Fecha3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nº de segundos: ");
        String segundosStr = teclado.nextLine();
        int segundos = Integer.parseInt(segundosStr);

        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime mezcla = hoy.plusSeconds(segundos);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Fecha y hora actual: " + hoy.format(formatter));
        System.out.println("Fecha y hora después de añadir segundos: " + mezcla.format(formatter));
    }
}
