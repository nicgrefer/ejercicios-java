package xxx_Ejercicios_repaso_casa;

import java.util.Scanner;

public class Ejercicios_casa_003_CalculoDeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Ejercicios_casa_003_CalculoDeFactorial app=new Ejercicios_casa_003_CalculoDeFactorial();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Dame un número apra calcular su factorial: ");
		 int num= sc.nextInt();
		 
		 System.out.print(app.Iterativo(num));
		
	}

	public int Iterativo (int num) {
		int factorial1=1;
		for (int i=1; num>=i; i++) {
			factorial1=factorial1*i ;
		}
		return factorial1;
	}
	
}