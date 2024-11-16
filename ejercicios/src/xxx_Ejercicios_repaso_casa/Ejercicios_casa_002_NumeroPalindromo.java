package xxx_Ejercicios_repaso_casa;

import java.util.Scanner;

public class Ejercicios_casa_002_NumeroPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		Ejercicios_casa_002_NumeroPalindromo app=new Ejercicios_casa_002_NumeroPalindromo();
		try {

			System.out.print("Introduce un numero para saber si es Palindromo: ");
			int n= sc.nextInt();
			boolean loes=app.esPalindromo(n);
			System.out.print(loes? "Es Palindromo":"No es Palindromo");
				
		}catch (Exception e) {
			// TODO: handle exception
			System.err.print("No es un número");
		}
		
		
	}

	public String alReves (int num) {
		
		String numero = Integer.toString(num);
		String delReves="";
		for (int i=numero.length()-1;i>=0;i--) {
			
			 delReves=delReves+numero.charAt(i);
			
		}
		return delReves;
		
	}
	
	public boolean esPalindromo (int num) {
		String original =Integer.toString(num);
		
		if (alReves(num).equals(original)) {
			return true;
			
		}else return false;
		
	}
	
}