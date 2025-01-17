package T6ejercicio.Banco;

// TODO: Auto-generated Javadoc
/**
 * The Class CajeroAutomatico.
 */
public class CajeroAutomatico {

	/** The cliente ID. */
	private Clientes clienteID;
	
	/** The num cuenta. */
	private Cuenta numCuenta;
	
	/** The c. */
	private static Cuenta c=new Cuenta();
	
	
	/**
	 * Gets the cliente ID.
	 *
	 * @return the cliente ID
	 */
	public Clientes getClienteID() {
		return clienteID;
	}
	
	/**
	 * Sets the cliente ID.
	 *
	 * @param clienteID the new cliente ID
	 */
	public void setClienteID(Clientes clienteID) {
		this.clienteID = clienteID;
	}
	
	/**
	 * Gets the num cuenta.
	 *
	 * @return the num cuenta
	 */
	public Cuenta getNumCuenta() {
		return numCuenta;
	}
	
	/**
	 * Sets the num cuenta.
	 *
	 * @param numCuenta the new num cuenta
	 */
	public void setNumCuenta(Cuenta numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	/**
	 * Instantiates a new cajero automatico.
	 *
	 * @param clienteID the cliente ID
	 */
	public CajeroAutomatico(Clientes clienteID) {
		super();
		this.clienteID = clienteID;
	}
	
	/**
	 * Deposito dinero.
	 *
	 * @param i the i
	 * @throws Exception the exception
	 */
	public void depositoDinero(double i) throws Exception {

		c.ingresar(i);
	}
	
	/**
	 * Retirar dinero.
	 *
	 * @param i the i
	 * @throws Exception the exception
	 */
	public void retirarDinero(double i) throws Exception {

		c.reintegrar(i);
	}
	
	/**
	 * Consultar saldo.
	 */
	public void consultarSaldo() {

		System.out.println(c.toString());
	}
	
}
