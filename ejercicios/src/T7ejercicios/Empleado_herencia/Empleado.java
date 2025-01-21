

package T7ejercicios.Empleado_herencia;

public abstract class Empleado {
	protected String nombre;
	protected String apellidos;
	protected String dni;

	public Empleado(String nombre,String apellidos ,String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//Getters y Set
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
	
		public String getDni() {
			return dni;
		}
	
		public void setDni(String dni) {
			this.dni = dni;
		}

		//ToString
	@Override
	public String toString() {
		return "Empleado con nombre=" + nombre + ", apellidos=" + apellidos + " y dni=" + dni + " ";
	}


	
	
}
