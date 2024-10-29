package T4ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
        LocalDate hoy = LocalDate.now();
        System.out.println("Introduce una fecha distinta a la de hoy (dd/MM/yyyy):");
        String fechaS = teclado.nextLine();

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaS, dtf);
            Period diferencia = Period.between(fecha, hoy);

            if (!fecha.equals(hoy)) {
            	System.out.print("Hay una diferencia de ");
                System.out.print(diferencia.getYears() + " años, ");
                System.out.print(diferencia.getMonths() + " meses y ");
                System.out.println(diferencia.getDays() + " días.");
            }else {
                System.err.println("Error, fecha no válida");
            }
             
        } catch (DateTimeParseException ex) {
            System.err.println("Error, fecha no válida");
       }
      
		
	}

}
