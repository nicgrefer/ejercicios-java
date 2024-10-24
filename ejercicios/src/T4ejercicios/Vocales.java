package T4ejercicios;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cadena donde buscar vocales:");
		String s1=teclado.nextLine();
		int contadorVocales=0;
		for(int i=0; i<s1.length(); i++) {
			char caracter=s1.charAt(i);
			if (caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'|| caracter=='u'||
					caracter=='A'||caracter=='E'||caracter=='I'||caracter=='O'|| caracter=='U') {
				contadorVocales++;
			}
		}
		System.out.print("Aparece " + contadorVocales + " vocales" );
	}

}
