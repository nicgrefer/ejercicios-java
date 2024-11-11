package T5ejercicios;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Primo app= new Primo();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce un número para saber si es primo: ");
		int n1=sc.nextInt();
		boolean primo=app.esPrimo(n1);
		
		String mensaje=primo==true? "El numero introducido es primo":"El numero introducido no es primo";
		System.out.print(mensaje);
	}

	public boolean esPrimo(int numero) {
		if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
	}
	
}
