package Practica1_Contraseñas;

import java.security.SecureRandom;

public class auxiliar {

	
	//Tiro de moneda para saver si es mayuscula o minuscula o si en un número o un simbolo
		public String moneda (char caracter) {
			
			int moneda=(int)((2-0)* Math.random());
			
			if (moneda>=0 && moneda<1) //cara
				if (caracter==[a-z])
					String cambio= caracter.
					return 0;
			
			
			if (moneda>=1 && moneda<2) //cruz
				return 0;
			return null;
			
		}
		
		//Tipo de seguridad, es decir el tamaño 
		
		
		//Generador de la contraseña aleatoria
		public String dados (int tamanio) {
			
			for (int i=0; tamanio>i;i++) {
				SecureRandom aleatorio=new SecureRandom();
				
				int dado1=aleatorio.nextInt(1-6);
				int dado2=aleatorio.nextInt(1-6);
				
				String Contraseña="";
				
				if (dado1==1&&dado2==1) {
					char equivale='a';
					
					
				}
}
