package T7ejercicios.Amarres_herencia;

public class MotoDeportiva extends Barco {

	private double potrenciaEnCV;

	
	// Getters y Setters
	
	public double getPotrenciaEnCV() {
		return potrenciaEnCV;
	}

	public void setPotrenciaEnCV(double potrenciaEnCV) {
		this.potrenciaEnCV = potrenciaEnCV;
	}
	
	
	// Constructor
	
	public MotoDeportiva(String matricula, double esloraEnMetros, int anoFabricacion, double potrenciaEnCV) {
		super(matricula, esloraEnMetros, anoFabricacion);
		this.potrenciaEnCV = potrenciaEnCV;
	}
	
}
