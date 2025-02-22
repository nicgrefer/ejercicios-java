package T4ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce que dia naciste:");
		String dia=teclado.nextLine();
		System.out.println("Introduce en que mes naciste (en números y con 2 dígitos): ");
		String mes=teclado.nextLine();
		System.out.println("Introduce en que año naciste: ");
		String año=teclado.nextLine();
		
		String unido=dia+"/" + mes+"/"+ año;
		 
		try {
       	             
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate naces=LocalDate.parse(unido, dtf);
            
            System.out.println("Entonces naciste el: "+ naces);
       } catch (DateTimeParseException ex){
       	System.err.print("Error, fecha no valida");
       }
      
		
	}

}