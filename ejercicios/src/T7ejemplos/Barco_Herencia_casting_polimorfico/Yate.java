package T7ejemplos.Barco_Herencia_casting_polimorfico;

// TODO: Auto-generated Javadoc
/**
 * The Class Yate.
 * herencia de la clase Barco
 */
public class Yate extends Barco {

	/**
	 * Instantiates a new yate.
	 */
	public Yate() {
		System.out.println("Constructor de la clase Yate");
	}
		
	/**
	 * Alarma.
	 */
	@Override
	public void alarma() {
		System.out.println("SoS desde el Yate");
	}
	
	public void lanzarBengala() {
		System.out.println("Bengala lanzada");
	}
	
	
}
