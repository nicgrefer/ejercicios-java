package T7ejemplos.ClasesDerivadasEmpleados;


/**
 * Modela las caracteristicas especificas de los empleados tipo "programador".
 */
public class Programador extends Empleado {

	// Atributos
	private double horas;
	private double precioHora;

	
	// Metodos
	
	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public double calcularSalarioMes() {
		return this.salariobase+(this.horas*this.precioHora);
	}
	
}
