package main;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public class Persona {

	/**
	 * Clase que define una persona con nombre y edad
	 * <img src="https://gregoriofer.com/wp-content/uploads/2018/06/logoGF-colorNuevo.png" alt="Gregorio Fer" width="100" height="100">
	 * @version 1.0
	 * @since 07/06/2021
	 * @autor coni <a href="https://www.linkedin.com/>Nombre</a>
	 */	
	
	private String nombre;
	
	/** The edad. */
	private int edad;
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	
}
