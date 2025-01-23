package T7ejercicios.Amarres_herencia;

import java.time.LocalDate;

public class Alquiler {

	private String nombreCliente;
	private String dniCliente;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int posicionAmarre;
	private Barco barco;

	
	// Getters y Setters
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getPosicionAmarre() {
		return posicionAmarre;
	}
	public void setPosicionAmarre(int posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}
	public Barco getMatricula() {
		return barco;
	}
	public void setMatricula(Barco matricula) {
		this.barco = matricula;
	}

	// Constructor
	
	public Alquiler(String nombreCliente, String dniCliente, LocalDate fechaInicio, LocalDate fechaFin,
			int posicionAmarre, Barco barco) {
		super();
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}
	

	@Override
	public String toString() {
		return "Alquiler [nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", posicionAmarre=" + posicionAmarre + ". Datos: "
				+ barco + "] tiene un precio de " + calcularAlquiler() + " euros el alquiler";
	}
	
	public double calcularAlquiler() {
		int valro = 2;
		long dias = fechaFin.toEpochDay() - fechaInicio.toEpochDay();//Calculamos los dias que ha estado alquilado el barco
		double precio = dias*(10*barco.getEsloraEnMetros()*valro);//Calculamos el precio del alquiler
		return precio;
	}
	
}
