package xxx_Ejercicios_repaso_casa;

import java.util.Scanner;

public class Ejercicios_casa_001_SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Ejercicios_casa_001_SumaNumeros app=new Ejercicios_casa_001_SumaNumeros();
		
		try {
			System.out.print("Introduce un número: ");
			double num1=sc.nextDouble();
			System.out.print("Introduce otro número: ");
			double num2=sc.nextDouble();
			
			System.out.print("La suma entre los dos numeros es " + app.sumatorio(num1, num2));
		}catch (Exception e) {
			// TODO: handle exception
			System.err.print("Introduzca el decimal con coma no con un punto");
		}
	}

	public double sumatorio(double n1, double n2) {
		double resultado=n1+n2;
		return resultado;
	}
	
}
