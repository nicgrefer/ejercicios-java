package T5ejercicios;

import java.util.Scanner;

public class Palindromo {

	// Crea un programa que comprueba si un palabra es palindromo
	// ej: seres, oro, somos ,oso ....
	//
	
	public static void main(String[] args) {
		
		Palindromo app=new Palindromo();
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce una palabra :");
		String palabra=sc.next();
		
		if (app.esPalindromo(palabra)) {
			System.out.print("La palabra introducida es un palindromo");
		}else System.out.print("La palabra introducida no es un palindromo");

	}

	//bolteo
	public String voltear(String palabra) {
		String nueva="";
		for (int i=palabra.length()-1;i>=0;i--) {
			nueva=nueva+palabra.charAt(i);
		}
		
		return nueva;
		
	}
	
	//Metodo que devuleva un buleano indicando si es palindramo
	public boolean esPalindromo(String palabraOriginal) {

		String palabraVolteada=voltear(palabraOriginal);
		
		if (palabraOriginal.equals(palabraVolteada)) {
			return true;
		}else {
			return false;
		}

	}
}
