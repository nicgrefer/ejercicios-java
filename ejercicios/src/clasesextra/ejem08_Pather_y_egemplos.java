package clasesextra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejem08_Pather_y_egemplos {
	
	public static void main(String[] args) {
		String texto="Hola Mundo";
		boolean coincide=texto.matches(".*[mM]undo");
		if (coincide) 
            System.out.println("El texto termina con la palabra mundo");
        else 
            System.out.println("El texto no termina con la palabra mundo");
		
		String nombre="Victor Vergel Rodríguez;Jorge García Pérez;Ana López García";
		
		
		String [] cadenas= nombre.split("[aeiouAEIOUáéíóú]");
		for (String cadena:cadenas) {
			System.out.println(cadena);
		}
		
		String texto2= "Hola don Pepito Mundo";
		String 	texto3 =texto2.replaceAll("[aeiou]", "-" );
		System.out.println(texto3);
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce nombres separados por ,");
		teclado.useDelimiter(",");
		while (teclado.hasNext()) {
			System.out.println(teclado.next());
		}
		
		//Fecha
		
		Pattern patron =Pattern.compile("\\d{2}\d{2}\d{4}");
		String fecha1="12/11/2024";
		
			
		}
		
	}
	
	
}
