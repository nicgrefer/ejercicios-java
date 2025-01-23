package T7ejercicios.Amarres_herencia;

public class Barco {

	private String matricula;
	private double esloraEnMetros;
	private int anoFabricacion;
	
	// Geetters y Setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getEsloraEnMetros() {
		return esloraEnMetros;
	}
	public void setEsloraEnMetros(double esloraEnMetros) {
		this.esloraEnMetros = esloraEnMetros;
	}
	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	
	// Constructor
	
	public Barco(String matricula, double esloraEnMetros, int anoFabricacion) {
		this.matricula = matricula;
		this.esloraEnMetros = esloraEnMetros;
		this.anoFabricacion = anoFabricacion;
	}
	@Override
	public String toString() {
		return "Barco con matricula " + matricula + ", eslora de " + esloraEnMetros + " metros y ano de fabricacion "
				+ anoFabricacion ;
	}
	
	
	
}
