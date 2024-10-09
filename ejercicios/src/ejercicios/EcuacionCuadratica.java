package ejercicios;

import java.util.Scanner;

public class EcuacionCuadratica {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		System.out.print("cuanto equibale el valor de la A: ");

		double A= teclado.nextDouble();

		System.out.print("cuanto equibale el valor de la B: ");

		double B= teclado.nextDouble();

		System.out.print("cuanto equibale el valor de la C: ");

		double C= teclado.nextDouble();



		if (A==0) {

			

			System.err.print("Error, repita de nuevo (A no puede ser 0) ");

			

		}else {

			
			double dentroRaiz=(Math.pow(B, 2) - (4*A*C));
			
			if (dentroRaiz<0){
				System.err.print("La raiz es negativa");
			}else {

			double solPositiva= ((-B +(Math.sqrt(dentroRaiz) ))/(2*A));

			double solNegativa= ((-B -(Math.sqrt(dentroRaiz) ))/(2*A));

			

			System.out.print("La solución es " + solPositiva + " y " + solNegativa );

			}
		}

	}
		
}
