package T4ejercicios;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce par de palabras: ");
		String palabras=teclado.nextLine();
		//Detectamos donde esta la separación entre polabras
		int posicionEspacio=palabras.indexOf(' ');
		
		//cojemos independientemente cada palabrea
		String palabra1= palabras.substring(0,posicionEspacio);
		String palabra2= palabras.substring(posicionEspacio);
		
		//quitamos los espcios de la 2ª palabra
		palabra2=palabra2.stripIndent();
				
		//comprobamos el orden 
		int sol=palabra1.compareTo(palabra2);
		if(sol<0) {//caso 1, ya esta ordenado
			System.out.println(palabra1 + " " + palabra2);
		}else {// caso 2, esta al reves
			System.out.println(palabra2 + " " + palabra1);
		}
		
	}

}
