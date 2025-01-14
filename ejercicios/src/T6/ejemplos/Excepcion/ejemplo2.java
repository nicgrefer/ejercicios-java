package T6.ejemplos.Excepcion;

import java.util.Random;

/**
 * ejemplo de una escepción creada
 */
public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			generadorNota();
		} catch (MiEscepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generadorNota() throws MiEscepcion {
		if (new Random().nextInt(1,10)<5)
			throw new MiEscepcion("Error, nota fuera de rango");
		else
			System.out.println("Nota dentro de rango");
	}
	
}
