package T3ejemplos;

import java.util.Scanner;

public class EjercicioAnidados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int base = 0;
	        int altura = 0;
	        // Bucle de validación
	        Scanner teclado = new Scanner(System.in);
	        do {
	            System.out.print("Base: ");
	            base = teclado.nextInt();
	            System.out.print("Altura: ");
	            altura = teclado.nextInt();
	            if ((base < 2 || base > 20) || (altura < 2 || altura > 20)) {
	                System.err.println("Error, valores incorrectos");
	            }
		
	        }while((base < 2 || base > 20) || (altura < 2 || altura > 20)){
	        	
	        	for (int i=0; i<base;i++) {
	        		
	        		
	        	}
	        	
	        	
	        }

	}
}