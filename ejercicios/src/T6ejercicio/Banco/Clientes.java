package T6ejercicio.Banco;

// TODO: Auto-generated Javadoc
/**
 * The Class Clientes.
 * Almacena todos los datos de los clientes y
 * proporciona un id a cada usuario
 * Como minimo DNI, Nombre y apellido. A mayores direccion y telefono 
 * @version 1.3 vinculado Clientes con cuentas
 */
public class Clientes {

	/** The codigo cliente. */
	private int codigoCliente;
	
	/** The dni cliente. */
	private String dniCliente;
	
	/** The nombre. */
	private String nombre;
	
	/** The apellido. */
	private String apellido;
	
	/** The direccion. */
	private String direccion;
	
	/** The telefono. */
	private int telefono;
	
	/** The contador. */
	private static int  contador;
	
	/** The cuenta.
	 * Esta variavle es "Cuenta" porque depende de la class Cuenta de esta
	 * forma se pueden relaccionar entre sí
	 *  */
	private Cuenta cuenta;
	

	/**
	 * Instantiates a new clientes.
	 * Constructor vacio
	 *
	 * @param dniCliente the dni cliente
	 * @param nombre the nombre
	 * @param apellido the apellido
	 */
	public Clientes(String dniCliente, String nombre, String apellido) {
		// TODO Auto-generated constructor stub
		contador++;
		this.codigoCliente=contador;
		this.dniCliente = dniCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	/**
	 * Instantiates a new clientes.
	 *
	 * @param dniCliente the dni cliente
	 * @param nombre the nombre
	 * @param apellido the apellido
	 * @param direccion the direccion
	 * @param telefono the telefono
	 */
	public Clientes(String dniCliente, String nombre, String apellido, String direccion, int telefono) {
		super();
		contador++;
		this.codigoCliente=contador;
		this.dniCliente = dniCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;

	}



	/**
	 * To string.
	 *
	 *Añadimos luego la "Comprobación" para ver si ese usuario tiene cuenta o no
	 *al estar el elemento "cuenta" vinculada a la class "Cuenta"
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Clientes con codig " + codigoCliente + ", Dni " + dniCliente + ", nombre " + nombre
                + ", apellido " + apellido + ", direccion " + direccion + " y telefono " + telefono
                + " tiene cuenta " + (cuenta != null ? cuenta : "Sin cuenta asignada") ;
	}

	/**
	 * Para poder asignar una cuenta con un usuario
	 * @param cuenta
	 */
    public void asignarCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
	/**
	 * Gets the codigo cliente.
	 *
	 * @return the codigo cliente
	 */
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	/**
	 * Sets the codigo cliente.
	 *
	 * @param codigoCliente the new codigo cliente
	 */
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	/**
	 * Gets the dni cliente.
	 *
	 * @return the dni cliente
	 */
	public String getDniCliente() {
		return dniCliente;
	}
	
	/**
	 * Sets the dni cliente.
	 *
	 * @param dniCliente the new dni cliente
	 */
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	
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
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 * 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

	/**
	 * Gets the cuenta.
	 *
	 * @return the cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}

	/**
	 * Sets the cuenta.
	 *
	 * @param cuenta the new cuenta
	 */
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
