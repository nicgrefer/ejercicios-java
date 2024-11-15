package Practica1_Contraseñas;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeneraContraseña {

	public Scanner sc=new Scanner (System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GeneraContraseña app=new GeneraContraseña();
		
		//Peticion de datos
		app.datosPersonales();
				
	}

	//Pido los daros personales
	public void datosPersonales(){
		System.out.println("Introduce el nombre: ");
		String nombre =sc.next();
		
		System.out.println("Introduce su 1º apellido: ");
		String apellido1 =sc.next();
		
		System.out.println("Introduce su 2º apellido: ");
		String apellido2 =sc.next();
		
		System.out.println("Introduce el DNI: ");
		String DNI =sc.next();
		
		System.out.println("Introduce su fecha de nacimiento: ");
		String fiechaNacimiento =sc.next();
		
	}
	
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
	public int tamanio() {
		SecureRandom aleatorio=new SecureRandom();
		int tamano=aleatorio.nextInt(4,8);
		return tamano;
	}
	
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
		
		
		
		
	}
	
}
