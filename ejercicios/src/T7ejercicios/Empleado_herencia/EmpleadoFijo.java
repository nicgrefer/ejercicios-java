

package T7ejercicios.Empleado_herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoFijo extends Empleado {

	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	private double complemento;
	private double sueldoBase;
	
	/**
	 * Constructor hereedado de Empleado
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaIngreso
	 * @param sueldoBase
	 * @param complemento
	 */
	public EmpleadoFijo(String nombre, String apellidos, String dni, LocalDate fechaIngreso, double sueldoBase,
			double complemento) {
		super(nombre, apellidos, dni);
		this.fechaIngreso = fechaIngreso;
		setFechaIngreso();
        this.sueldoBase = sueldoBase;
		this.complemento = complemento;
	}

	// geter y seter
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	private void setFechaIngreso() {
		this.fechaIngreso = LocalDate.now();
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		String s = "("+ this.getClass().getSimpleName() + ")";
		return super.toString()+s+" tiene fecha de ingreso=" + fechaIngreso + ", con complemento de="
				+ complemento + " y sueldo base=" + sueldoBase ;
	}
	
	/**
	 * Metodo para calcular el sueldo de un empleado fijo
	 * 
	 * @return
	 */

	public double calcularSueldo() {
	    double salario = this.sueldoBase + 
	        (this.complemento * ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now()));
	    return salario;
	}

	
		
	
}