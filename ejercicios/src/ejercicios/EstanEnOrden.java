package ejercicios;

import java.util.Scanner;

public class EstanEnOrden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Dame un número entero: ");
		int n1= teclado.nextInt();
		System.out.print("Dame otro número entero: ");
		int n2= teclado.nextInt();
		System.out.print("Dame otro mas");
		int n3= teclado.nextInt();
		
		if ((n1>n2)&&(n2>n3)) {
			
			System.out.print("Esta escrito de mayor a menor");
		}
		
		else if ((n1<n2)&&(n2<n3)) {
			
			System.out.print("Estan escritos de menor a mayor");
		}
		
		else {
			
			System.out.print("Los numeros enstan desordenados");
		}
		
		
	}	

}
