package T5ejemplos;

import java.util.Scanner;

public class Operaciones {

	 public Scanner sc = new Scanner(System.in);
	 public int n1;
	 public int n2;
	
	 public static void main(String[] args) {
	        // Programa que realiza las operaciones básicas con dos datos
 
		 
	        Operaciones op = new Operaciones();
	      
	        System.out.println("Suma: " + op.suma(op.n1, op.n2));
	        System.out.println("Resta: " + op.resta(op.n1, op.n2));
	        System.out.println("Multiplicación: " + op.multiplica(op.n1, op.n2));
	        System.out.println("División: " + op.divide(op.n1, op.n2));
	 }
	 
	 
	 // Método para sumar dos enteros
	  public int suma(int a, int b) {
	         return a + b;
	  }

	  // Método para restar dos enteros
	  public int resta(int a, int b) {
	         return a - b;
	   }

	   // Método para multiplicar dos enteros
	   public int multiplica(int a, int b) {
	          return a * b;
	   }

	   // Método para dividir dos enteros
	   public int divide(int a, int b) {
	         if (b != 0) {
	             return a / b;
	         } else {
	             System.out.println("Error: División por cero");
	             return 0;
	         }
	   }

	   
	   public void pedirNumeros() {
		   
		   System.out.print("Dame un número: ");
	         n1 = sc.nextInt();
	        
	       System.out.print("Dame otro número: ");
	         n2 = sc.nextInt();
	   }
	 
	   
}