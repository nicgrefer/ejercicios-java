

package T7ejercicios.Empleado_herencia;

import java.time.LocalDate;



public class Temporal extends Empleado {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private final double sueldoBase = 1134;
	
	
	public Temporal(String nombre, String apellidos, String dni, LocalDate localDate, LocalDate localDate2) {
		super(nombre, apellidos, dni);
		this.fechaInicio = localDate;
		this.fechaFin = localDate2;
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
	
	@Override
	public double calcularSueldo() {
	   return this.sueldoBase;
	}


	@Override
	public String toString() {
		String s = "("+ this.getClass().getSimpleName() + ")";
		return super.toString()+s+" es temporal con fecha Inicio=" + fechaInicio + ", fecha Fin=" + fechaFin + "y sueldo Base=" + sueldoBase ;
	}
	
	
	
	
}
