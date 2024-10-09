package ejercicios;

import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("dame el primer bit");
		int bit2=teclado.nextInt();
		System.out.print("dame el segundo bit");
		int bit1=teclado.nextInt();
		System.out.print("dame el tercer bit");
		int bit0=teclado.nextInt();
		
		//Comprobacion de bit
		
		if( (bit2!=0 && bit2 !=1)||(bit1!=0 && bit1 !=1)||(bit0!=0 && bit0 !=1)){
			
			System.err.print("Error. Bits no validos");
		}else {
			
		//Son correctos 
		//Procedemos a pasar de binario a decimal
			
			double dec= bit2*Math.pow(2, 2) +
					 bit1*Math.pow(2, 1) +
					 bit0*Math.pow(2, 0);
			
			System.out.print("El valor del binario introducuido es " + dec);
			
		}
		
		
	}

}
