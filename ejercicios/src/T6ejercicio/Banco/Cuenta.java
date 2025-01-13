package T6ejercicio.Banco;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


// TODO: Auto-generated Javadoc
/**
 * The Class Cuenta.
 * @implNote Funciones que tiene:
 * crear una cuemta con un ID determinada para diferenciarlas,
 * reirar o añadir dinero y crear intereses (2% sobre el saldo) 
 * @version 2.0 
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
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		this.fechaApertura = LocalDateTime.now().format(formatter); // Fecha formateada
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
	
	
/**
 * Introducir dinero a una cuenta ya esistente siempre que no ponga un numero negativo
 * @param ingreso
 * @throws Exception 
 */
	public void ingresar( double ingreso) throws Exception {
		if (ingreso>=0) {
			this.saldo=saldo+ingreso;
			System.out.println("Saldo actual " + saldo + "$");
		}
		else
			throw new Exception("No puedes ingresar dinero negativo ");
	}
	
	/**
	 * Funcion para retirar dinero siempre que tenga dineor y no retire mas de lo permitido.
	 * No se puede introducir numeros negativos o iguales a cero
	 * @param retirada
	 * @throws Exception 
	 */
	public void reintegrar( double retirada) throws Exception {
		if (retirada>0) {
				if (saldo!=0) {
					if (saldo>=retirada) {
						this.saldo=saldo-retirada;
						System.out.println("Saldo actual " + saldo + "$");
					}else{ 
						throw new Exception("No hay suficiente dinero en la cuenta");
					}
			
			}else{
				System.out.println("No puedes retirar dinero si la cuenta esta a cero");
			}
		
		}else{
			throw new Exception("No puedes retirar valores negativos o iguales a cero");
		}
	}
	
	/**
	 * Se aplica un interes del 2% cuando se pare el més
	 */
	public  void interes() {

		double calculo = 2*saldo/100;
		this.saldo=saldo+calculo;
		 System.out.println("Interes del 2% -> a fin de mes el saldo sera de "+ saldo + "$");
	}
	
			
}
