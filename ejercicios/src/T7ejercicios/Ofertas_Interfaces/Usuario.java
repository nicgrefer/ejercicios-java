package T7ejercicios.Ofertas_Interfaces;

	abstract class Usuario implements Operaciones {
	private String nombre;
	private String email;

	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}



	// Getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
