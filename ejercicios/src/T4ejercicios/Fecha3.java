package T4ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Fecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduce el nº de segundos: ");
		String segundos=teclado.nextLine();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date fecha = formato.parse(fechaStr);
			System.out.println("Fecha convertida: " + fecha);
		} catch (ParseException e) {
			System.out.println("Error al convertir la fecha: " + e.getMessage());
		}
		
		LocalDateTime hoy =LocalDateTime.now();
		 
		
		LocalDate mezcla= hoy +(segundos);
		
		
	}

}
