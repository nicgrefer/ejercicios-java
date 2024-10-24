package T4ejercicios;

import java.util.Scanner;

public class Invertir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.print("Cadena original:");
		String original=teclado.nextLine();
		String invertida="";
		
		for(int i=0; i<original.length(); i++) {
			char caracter=original.charAt(i);
			if (Character.isUpperCase(caracter)) {//Si es mayuscula
				//transformar a minúscula
				invertida+=String.valueOf(caracter).toLowerCase();
				
				
			}else if (Character.isLowerCase(caracter)) {//Si es minuscula
				// transformar a mayuscula
				invertida+=String.valueOf(caracter).toUpperCase();
				
			}else if (Character.isSpace(caracter)) {// En cualquier otro caso 
				invertida+=" ";
			}
		}
		System.out.print("Cadena invertida: " + invertida);
		
	}

}