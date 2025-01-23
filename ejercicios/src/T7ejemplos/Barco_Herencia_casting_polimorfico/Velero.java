package T7ejemplos.Barco_Herencia_casting_polimorfico;

// TODO: Auto-generated Javadoc
/**
 * The Class Velero.
 * herencia de la clase Barco
 */
public class Velero extends Barco {

	/**
	 * Instantiates a new velero.
	 */
	public Velero() {
		System.out.println("Constructor de la clase Velero");
	}
	
	/**
	 * Alarma.
	 */
	@Override
	public void alarma() {
		System.out.println("SOS desde el Velero");
	}
	
	public void arriar() {
		System.out.println("arriando velas");
	}
	
}
