package T4ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// Pasar de un string a un date
		  Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduce una fecha formato dd/MM/yyyy: ");
	        String fecha = teclado.nextLine();//Guardamos fecha
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate fechabuena = LocalDate.parse(fecha, dtf);
	        System.out.println(fechabuena);
	}

}
