package T3ejemplos;

import java.util.Scanner;

public class CifradoCésar {

	public static void main(String[] args) {
		

		//Cifrado César. Escribe un programa que pida al usuario una cadenade texto y una clave numérica
		//El programa aplicará un cifrado César a la cadena según la clave proporcionada, mostrando el
		// texto cifrado.El cifrado César lo que hace es desplazarlos caracteres el valor indicado por
		//  la clave. Para ello ten en cuenta el código ASCII extendido.
		
		 Scanner teclado = new Scanner(System.in);
	        String mensajeCodificado = "";//aux para guardar el mensaje codificado

	        System.out.print("Escriba el mensaje: ");
	        String mensaje = teclado.nextLine();

	        System.out.print("Codificación (introduce número): ");
	        int codificador = teclado.nextInt();

	        // Aplicar el cifrado
	        for (int i = 0; i < mensaje.length(); i++) {//Calcula la longitud del mensaje y creamos bucle  para transcribir caracter a caaracter
	            char n = mensaje.charAt(i);//ba cojiendo caracter por caracter
	            n = (char) (n + codificador);//introduce el codificador
	            if (n > 126) {//Si al codificarlo sale de la lista
	                n = (char) (n - 127); // Mantener en el rango ASCII extendido
	            }
	            mensajeCodificado += n;//guarda el mensaje codificado
	        }

	        System.out.println("Texto cifrado: " + mensajeCodificado);
	        teclado.close();
		}	
	
	}


