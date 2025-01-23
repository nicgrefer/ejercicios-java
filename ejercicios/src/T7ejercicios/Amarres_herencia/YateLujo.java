package T7ejercicios.Amarres_herencia;

public class YateLujo extends Barco {

	private double potenciaEnCV;
	private int camarotes;

	
	// Getters y Setters
	
	public double getPotenciaEnCV() {
		return potenciaEnCV;
	}
	public void setPotenciaEnCV(double potenciaEnCV) {
		this.potenciaEnCV = potenciaEnCV;
	}
	public int getCamarotes() {
		return camarotes;
	}
	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}
	
	
	// Constructor
	
	public YateLujo(String matricula, double esloraEnMetros, int anoFabricacion, double potenciaEnCV, int camarotes) {
		super(matricula, esloraEnMetros, anoFabricacion);
		this.potenciaEnCV = potenciaEnCV;
		this.camarotes = camarotes;
	}
	@Override
	public String toString() {
		return super.toString() + " es un Yate de lujo con una potencia de" + potenciaEnCV + "cv y tiene " + camarotes + " camarotes";
	}
	
	
	
}
