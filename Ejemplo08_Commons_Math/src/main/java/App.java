import org.apache.commons.math3.util.Precision;
// TODO: Auto-generated Javadoc

/**
 * The Class App.
 */
public class App {


	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor = 3.14159265359;
		double redondeado = Precision.round(valor, 3);
		System.out.println("\nNúmero original: " + valor);
		System.out.println("Redondeado a 3 decimales: " + redondeado);

		
	}

}
