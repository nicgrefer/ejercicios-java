package T7ejemplos.ClasesDerivadasEmpleados;
/**
 * Modela las caracteristicas de todos los empleados de la aplicacion.
 */
public class Empleado {
	
	// Atributos
	
	protected String nombre;
	protected String apellidos;
	protected double salariobase;
	
	
	//Metodos
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	 public String datosPersonales() {
	        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Salario Base: " + salariobase;
	    }
	 
		public double calcularSalarioMes() {
			return salariobase;
		}
	 
		
		
}