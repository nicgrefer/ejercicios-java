package T5ejemplos;

import java.util.Scanner;

public class Operaciones {

	 public static void main(String[] args) {
	        // Programa que realiza las operaciones básicas con dos datos

	        Scanner sc = new Scanner(System.in);
	        Operaciones op = new Operaciones();
	        
	        System.out.print("Dame un número: ");
	        int n1 = sc.nextInt();
	        
	        System.out.print("Dame otro número: ");
	        int n2 = sc.nextInt();
	        
	        System.out.println("Suma: " + op.suma(n1, n2));
	        System.out.println("Resta: " + op.resta(n1, n2));
	        System.out.println("Multiplicación: " + op.multiplica(n1, n2));
	        System.out.println("División: " + op.divide(n1, n2));
		sc.close();
	 }
	 
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

	
}
