
public class Trabajador {
	private String nombre;
	private String dni;
	private Direccion direccion;
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Trabajador(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + "]";
	}

	public void copiarDireccion(Trabajador trabajadorDestino)
	{
		//trabajadorDestino.setDireccion(this.direccion);
		trabajadorDestino.direccion=this.direccion;
	}

}
