package T4ejercicios;

import java.util.Scanner;

public class Busqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cadena donde buscar:");
		String s1=teclado.nextLine();
		System.out.println("Cadena a buscar: ");
		String s2=teclado.nextLine();
		String aux1=""; // guarda la salida
		int aux2=0;// guarda cuantas veces salio
		
	        int posicion = -1; // Start searching from the beginning of the string

	        do {
	            posicion = s1.indexOf(s2, posicion + 1);
	            if (posicion!=-1){
	            	aux1=aux1+", "+posicion;
	            	aux2++;
	            	
	            	
	            }
	        }while (posicion != -1);
	        System.out.println("Posiciones en las que aparece:  " + aux1);
	        System.out.println("Nº de ocurrencias: " + aux2 );
		
	}

}