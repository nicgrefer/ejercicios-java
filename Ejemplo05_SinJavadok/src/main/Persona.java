package main;

public class Persona {

	/**
	 * Clase que define una persona con nombre y edad
	 *  * <img src="https://gregoriofer.com/wp-content/uploads/2018/06/logoGF-colorNuevo.png" alt="Gregorio Fer" width="100" height="100">
	 * @version 1.0
	 * @since 07/06/2021
	 * @autor <a href="https://www.linkedin.com/>Nombre</a>
	 */
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	
}
