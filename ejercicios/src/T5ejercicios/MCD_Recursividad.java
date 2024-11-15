package T5ejercicios;

import java.util.Scanner;

public class MCD_Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 MCD_Recursividad app=new MCD_Recursividad();
	        System.out.println("Dame un número");
	        int num1 = sc.nextInt();
	        System.out.println("Dame otro número");
	        int num2 = sc.nextInt();
		
	        System.out.print("el MCD es: " + app.calculoMCD(num1, num2));
	}

	public int calculoMCD (int mayor, int menor) {
		
		int resto=mayor%menor;
		if (resto==0) return menor;
		return calculoMCD(menor,resto);
		
	}
	
}
