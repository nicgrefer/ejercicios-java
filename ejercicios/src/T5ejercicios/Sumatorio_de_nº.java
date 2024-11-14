package T5ejercicios;

import java.util.Scanner;

public class Sumatorio_de_nº {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Dame un número para calcular su sumatorio: ");
		int i=sc.nextInt();
		
		Sumatorio_de_nº app= new Sumatorio_de_nº();
		
		int sumatorioRecursivo=(app.factorial(i));
		int sumatorioNormal =(app.normal(i));
		
		System.out.println("el sumatorio de "+ i+" de forma recursiva sería " + sumatorioRecursivo);
		System.out.println("el sumatorio de "+ i+" de forma normal sería " + sumatorioNormal);
	}

	public int factorial (int n) {
		if (n==1)return 1;
		return n+factorial(n-1);
	}
	
	public int normal (int n) {
		int suma=0;
		for (int i=1; i<=n;i++) {
			suma=suma+i;
		}return suma;
		
	}
	
}
