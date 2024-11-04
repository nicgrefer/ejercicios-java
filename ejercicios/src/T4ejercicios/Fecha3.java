package T4ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class Fecha3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nº de segundos: ");
        String segundosStr = teclado.nextLine();
        int segundos = Integer.parseInt(segundosStr);//Integer.parseInt tiene la función de pasar un string a int
        											//y lo que esta entre parentesis el lo que se quiere transformar

        LocalDateTime hoy = LocalDateTime.now();//Guarda hora y dia del sistema
        LocalDateTime mezcla = hoy.plusSeconds(segundos);// hoy.plusSeconds hace que el balor de HOY se le sumen segundos metidos por el usuario

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);//ofLocalizedDateTime(FormatStyle.
        																						//Para "formatear" el estilo
        System.out.println("Fecha y hora actual: " + hoy.format(formatter));
        System.out.println("Fecha y hora después de añadir segundos: " + mezcla.format(formatter));
    }
}
