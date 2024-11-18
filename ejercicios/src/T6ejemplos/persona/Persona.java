package T6ejemplos.persona;

import java.security.SecureRandom;
import java.util.Random;

public class Persona {

	public static void main(String[] args) {
		
		int tamanio=8;
		
		SecureRandom sr =new SecureRandom();
		String contraseniaFinal="";//guardamos contraseña
		String caracteresValidos="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%/&()=";
				
		for (int i =0;i<tamanio;i++) {
			int posicionDelCararter=sr.nextInt(caracteresValidos.length());//se crea un aleatorio que correspondera a un caracter del string "caracteresValidos"
			contraseniaFinal=contraseniaFinal+caracteresValidos.charAt(posicionDelCararter);
		
		}
		System.out.print(contraseniaFinal);
	}

}
