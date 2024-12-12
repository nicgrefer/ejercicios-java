package T6ejercicio.ascensor;

public class Ascensor {

	private int pisoEsta;
	private final int pisosTiene;
	private boolean puertaAbierta;
	private boolean alarmaActivada;
	private double capacidad;
	private int ocupacionActual;
	
	public Ascensor(int pisosTiene,double capacidad) {
            this.pisosTiene=pisosTiene;
            this.capacidad=capacidad;
	}
	//Seters y geters
	public int getPisoEsta() {
		return pisoEsta;
	}
	public void setPisoEsta(int pisoEsta) {
		this.pisoEsta = pisoEsta;
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
	public int getOcupacionActual() {
		return ocupacionActual;
	}
	public void setOcupacionActual(int ocupacionActual) {
		this.ocupacionActual = ocupacionActual;
	}
	public int getPisosTiene() {
		return pisosTiene;
	}
	@Override
	public String toString() {
		return "Ascensor [pisoEsta=" + pisoEsta + ", pisosTiene=" + pisosTiene + ", puertaAbierta=" + puertaAbierta
				+ ", alarmaActivada=" + alarmaActivada + ", capacidad=" + capacidad + ", ocupacionActual="
				+ ocupacionActual + "]";
	}
	
	public void abrirPuerta() {
		puertaAbierta=true;
		System.out.println("Puera abierta");
	}
	
	
	
}
