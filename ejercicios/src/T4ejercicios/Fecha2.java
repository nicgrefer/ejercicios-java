package T4ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una fecha formato dd/MM/yyyy: ");
        String fecha = teclado.nextLine();//Guardamos fecha
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Establecemos el formato de introducción de fecha

        try {
            LocalDate fechabuena = LocalDate.parse(fecha, dtf);// Combierte el String a Date
            LocalDate ahora = LocalDate.now();
            
            //-->El resultado siempre lo voy a dar fecha mas antigua a mas reciente
            if(fechabuena.isAfter(ahora)) {
            	long dias= fechabuena.toEpochDay()-ahora.toEpochDay();
            	System.out.print("La diferencia de dias entre "+ ahora +" y "+ fechabuena +" es de " +dias+ " días");
            }else {
            	long dias= ahora.toEpochDay()-fechabuena.toEpochDay();
            	System.out.print("La diferencia de dias entre "+ fechabuena+" y "+ ahora  +" es de " +dias+ " días");
            	
            }
            
        } catch (DateTimeParseException e) {//Si introduce fecha incorrecta ERR
            System.err.println("Formato incorrecto");
        }
    }
}