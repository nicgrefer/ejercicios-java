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

	/**
	 * Calcula el salario mensual de un programador en funcion de las horas trabajadas y el precio por hora.
	 * @Override
	 */
	public double calcularSalarioMes() {
		return super.calcularSalarioMes() +(this.horas*this.precioHora);
	}

	@Override
	public String toString() {
		return super.toString() +"Programador  [horas=" + horas + ", precioHora=" + precioHora + "]";
	}
	
	// Constructor pro defecto
	public Programador() {
		super();
		System.out.println("Se ha creado un programador");
	}
	
	
	public Programador(String nombre, String apellidos, double salariobase , double horas, double precioHora) {
		super( nombre, apellidos);
		System.out.println("Se ha creado un programador");
		this.horas = 0;
		this.precioHora = 0;
	}
	
	
}
