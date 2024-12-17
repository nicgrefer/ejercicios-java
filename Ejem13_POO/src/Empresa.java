
public class Empresa {
	private String nombre;
	private String cif;
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
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public Empresa(String nombre, String cif) {
		super();
		this.nombre = nombre;
		this.cif = cif;
	}
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion + "]";
	}

	

}
