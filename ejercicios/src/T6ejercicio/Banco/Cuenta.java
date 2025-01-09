package T6ejercicio.Banco;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


// TODO: Auto-generated Javadoc
/**
 * The Class Cuenta.
 * @version 1.0 a añadir: forma de aumentar y disminuir el dinero del la cuenta
 * 
 */
public class Cuenta {

	/** The num cuenta. */
	private int numCuenta;
	
	/** The saldo. */
	private double saldo;
	
	/** The fecha apertura. */
	private String fechaApertura;
	
	/** The contador. */
	private static int contador;
	
	
	
	/**
	 * Constructor vacio.
	 */
	
	public Cuenta() {
		contador++;
		this.numCuenta=contador;		
		
	}

	/**
	 * Constructor .
	 *
	 * @param saldo the saldo
	 */
	public Cuenta(double saldo ) {
		contador++;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.numCuenta = contador;
        this.saldo = saldo;
        this.fechaApertura = LocalDateTime.now().format(formatter); // Fecha formateada
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return " con numero de Cuenta " + numCuenta + " saldo de " + saldo + "$ y fecha de apertura=" + fechaApertura ;
	}


	/**
	 * Gets the num cuenta.
	 *
	 * @return the num cuenta
	 */
	public int getNumCuenta() {
		return numCuenta;
	}

	/**
	 * Sets the num cuenta.
	 *
	 * @param numCuenta the new num cuenta
	 */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	/**
	 * Gets the saldo.
	 *
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Sets the saldo.
	 *
	 * @param saldo the new saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
