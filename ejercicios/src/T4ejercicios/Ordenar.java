package T4ejercicios;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce par de palabras: ");
		String palabras=teclado.nextLine();
<<<<<<< HEAD
		//Comrobar que halla introducido texto
		if (palabras.length()==0) {
			System.err.print("No as introducido nada, vuelve a intentarlo");
		}else {
			
			//Quito espacios del principio y del dinal
			palabras=palabras.trim();
			if (!palabras.contains(" ")) {
				System.err.print("No introduciste 2 palabras. Vuelve a intentarlo");
			}else {
				//Detectamos donde esta la separación entre polabras
				int posicionEspacio=palabras.indexOf(' ');
				
				//cojemos independientemente cada palabrea
				String palabra1= palabras.substring(0,posicionEspacio);
				String resto= palabras.substring(posicionEspacio);
				
				//quitamos los espcios que quedan en el resto
				String palabra2=resto.stripIndent();
				
				//comprobamos el orden 
				int sol=palabra1.compareTo(palabra2);
				if(sol<0) {//caso 1, ya esta ordenado
					System.out.println(palabra1 + " " + palabra2);
				} else if (sol>0) {// caso 2, esta al reves
					System.out.println(palabra2 + " " + palabra1);
				} else {
					System.out.println("las 2 palabras son iguales");
				}
			}
			
		}
=======
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
		
>>>>>>> origin/main
	}

}
