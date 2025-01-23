package T7ejercicios.Amarres_herencia;

public class Veleros extends Barco {
	
	private int nMastiles;


	
	// Getters y Setters
	
	public int getnMastiles() {
		return nMastiles;
	}

	public void setnMastiles(int nMastiles) {
		this.nMastiles = nMastiles;
	}

	
	// Constructor
	public Veleros(String matricula, double esloraEnMetros, int anoFabricacion, int nMastiles) {
		super(matricula, esloraEnMetros, anoFabricacion);
		this.nMastiles = nMastiles;
	}

	

}
