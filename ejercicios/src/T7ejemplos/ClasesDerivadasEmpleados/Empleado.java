package T7ejemplos.ClasesDerivadasEmpleados;
/**
 * Modela las caracteristicas de todos los empleados de la aplicacion.
 */
public class Empleado {
	
	// Atributos
	
	protected String nombre;
	protected String apellidos;
	protected double salariobase;
	protected final double retencion=0.10;
	
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
			return salariobase-(this.retencion*salariobase);
		}
		
		@Override
		public String toString() {
			return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", salariobase=" + salariobase + "]";
	
		}
		// Constructor por defecto
		public Empleado() {
			System.out.println("Se ha creado un empleado");
			this.nombre = "";
			this.apellidos = "";
			this.salariobase = 1134;
		}
			
	// Constructor
		
		public Empleado(String nombre, String apellidos) {
			super();
			System.out.println("Se ha creado un empleado");
			this.nombre = nombre;
			this.apellidos = apellidos;
		}
		
}