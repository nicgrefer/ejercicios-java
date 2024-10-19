package ejerciciosT3;

import java.util.Scanner;

public class Ejer02CifradoCésar {

	public static void main(String[] args) {
		

		//Cifrado César. Escribe un programa que pida al usuario una cadenade texto y una clave numérica
		//El programa aplicará un cifrado César a la cadena según la clave proporcionada, mostrando el
		// texto cifrado.El cifrado César lo que hace es desplazarlos caracteres el valor indicado por
		//  la clave. Para ello ten en cuenta el código ASCII extendido.
		
		  Scanner teclado = new Scanner(System.in);
	        String mensajeCodificado = "";

	        System.out.print("Escriba el mensaje: ");
	        String mensaje = teclado.nextLine();

	        System.out.print("Codificación (introduce número): ");
	        int codificador = teclado.nextInt();

	        // Aplicar el cifrado
	        for (int i = 0; i < mensaje.length(); i++) {
	            char n = mensaje.charAt(i);
	            n = (char) (n + codificador);
	            if (n > 255) {
	                n = (char) (n - 256); // Mantener en el rango ASCII extendido
	            }
	            mensajeCodificado += n;
	        }

	        System.out.println("Texto cifrado: " + mensajeCodificado);
		}	
	
	}


