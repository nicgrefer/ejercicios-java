package T4ejercicios;

import java.util.Scanner;

public class Alternar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String porPrincipio="";
		String porFinal="";
		
		System.out.println("Introduce cadena: ");
		String original=teclado.nextLine();
		
		for(int i=0; i<original.length(); i++) {
			char caracter=original.charAt(i);
			if (i%2==0) {//Si es par
				porPrincipio+=caracter;
			}else {//cuando es impar
				porFinal=caracter+porFinal;
			}
			
		}
		String resultado=porPrincipio+porFinal;
		System.out.print("Resultado: " + resultado);
	}

}
