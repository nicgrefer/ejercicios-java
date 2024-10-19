package T3ejemplos;

import java.util.Scanner;

public class ABConcatenación_de_cadenas {

	public static void main(String[] args) {

		//Concatenación de cadenas. Escribe un programa que pida al usuario cadenas de texto repetidamente
		//y las concatene. A la pregunta, ¿cuantas cadenas tiene que meter? Las que quiera, hasta que no meta
		//nada. Momento en el que se mostrarán todas las cadenas introducidas concatenadas.
		
		 Scanner teclado = new Scanner(System.in);
	     String cadena = "";//Donde se guardará el mensaje por completo
	        
	        while (true) {
	            System.out.print("Introduzca cadena: ");
	            String input = teclado.nextLine();
	            if (input.equals("")) {//función de comprobasr si quiere salir del bucle
	                break;
	            }
	            cadena += input + " ";//acumula lo dicho con la nueva palabra
	        }
	        
	        System.out.println("La cadena es: " + cadena);//printea "la solución"
	}

}

