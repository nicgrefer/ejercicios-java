 package ejerciciosT3;

import java.util.Scanner;

public class Ejrer03Triángulo {

	public static void main(String[] args) {
		
		// Triángulo. Escribe un programa que solicite al usuario una cadena de caracteres y,
		//a continuación, imprima un triángulo con las letras de la cadena. Cada fila del
		//triángulo debe tener una letra más que la anterior, hasta completar toda la cadena.
		//Por ejemplo, si el usuario introduce la cadena "JAVA", el resultado debería ser:
		//J
		//J A
		//J A V A

		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la palabra: ");
        String palabra = teclado.nextLine();//Guarda el valor

        // Construir y mostrar el triángulo
        for (int i = 0; i < palabra.length(); i++) {//bucle hasta quedarse sin letras
            for (int j = 0; j <= i; j++) {
                System.out.print(palabra.charAt(j) + " ");//printea lo que se encuentre en dicho caracter
            }
            System.out.println();
        }
	}
}
