
// src/T7ejercicios/Empleado_herencia/EmpleadoPorHoras.java
package T7ejercicios.Empleado_herencia;

public class EmpleadoPorHoras extends Empleado {
	
	private double horasTrabajadas;
	private final double precioHora = 50;
	private double sueldo;

	
	// Constructor
	public EmpleadoPorHoras(String nombre, String apellidos, String dni, double horasTrabajadas) {
		super(nombre, apellidos, dni);
		this.horasTrabajadas = horasTrabajadas;
	}

	
	//getters y setters
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPrecioHora() {
		return precioHora;
	}
	
	public double calcularSueldo() {
		sueldo = this.horasTrabajadas * this.precioHora;
		return sueldo;
		
	}
	
	
	@Override
	public String toString() {
		String s = "("+ this.getClass().getSimpleName() + ")";
		return super.toString()+s+" ha trabajado " + horasTrabajadas + "h, con unprecio/hora "
				+ precioHora  ;
	}

}
