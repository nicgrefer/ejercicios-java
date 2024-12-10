package T6ejercicio.ascensor;

public class Ascensor {

	private int piso;
	private final int pisos=10;
	private boolean puertaAbierta;
	private boolean alarmaActivada;
	private double capacidad=200.0;
	private boolean ocupacionActual;
	
	public  void Acensor(int pisos, double capacidad) {
		
		
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	public boolean isAlarmaActivada() {
		return alarmaActivada;
	}

	public void setAlarmaActivada(boolean alarmaActivada) {
		this.alarmaActivada = alarmaActivada;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isOcupacionActual() {
		return ocupacionActual;
	}

	public void setOcupacionActual(boolean ocupacionActual) {
		this.ocupacionActual = ocupacionActual;
	}

	public int getPisos() {
		return pisos;
	}
	
	private void entrarPersona() {
		ocupacionActual++;
	}
	private void salirPersona() {
		ocupacionActual--;
	}
	
}
