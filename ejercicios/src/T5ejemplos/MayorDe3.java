package T5ejemplos;

import java.util.Scanner;

public class MayorDe3 {

	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MayorDe3 app=new MayorDe3();
		//Pido 3 numeros
		int a=app.pideNumero();
		int b=app.pideNumero();
		int c=app.pideNumero();
		
		
		// Calculamos cual es el mayor de los tres
		// si los valores son validos
		
		if(a!=Integer.MIN_VALUE && b!=Integer.MIN_VALUE && c!=Integer.MIN_VALUE) {
			//Es correcto
			
			int mayor=app.elMayor(a, b, c);
			System.out.println("El mayor es " + mayor );			
			
		}else {
			//Es incorrecto
			System.err.println("Algun valor es incorrecto o no valido.");
			System.err.println("Repita el proceso");
		}
		
	}
	
	
	/**Metodo que solicita el usuario que introduzca un numero*/
	
	public int pideNumero() {
		try {
		System.out.print("Introduce un número: ");
		String entrada=sc.next();
		
		int n =Integer.parseInt(entrada); // combierte el valor introducido a un int
		return n ; //En caso correcto
		}catch (NumberFormatException ex) {
			// TODO: handle exception
			System.err.println("Error. Dato no valido");
		}
		return Integer.MIN_VALUE; //Si no es un dato correcto debuelve caso extremo
	}
	
	private int elMayor (int n1, int n2) {
		//comparamos solo 2
		if (n1>n2) return n1;
		else return n2;
		
	}
	
	
	public int elMayor(int n1, int n2, int n3) {
		
		// compara el que queda con el mayor entre el 1 y el 2
		
		int mayor=elMayor(n1, n2);
		if (mayor>n3) return mayor;
		else return n3;
		
	}
	
	

}
