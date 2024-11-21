package xxx_Ejercicios_repaso_casa;

import java.util.Scanner;

public class Recursividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		Recursividad1 app= new Recursividad1();
		
		System.out.print("Introduce un número para allar su factorial: ");
		int numero =sc.nextInt();
		int numeroFactorial = app.factorial(numero);
		System.out.print("El factorial es " + numeroFactorial);
		
	}

	public int factorial (int numero){
	
		if (numero==0) {
			return 1;
		}
	
		return numero*factorial(numero - 1);
		
	}
	
}
