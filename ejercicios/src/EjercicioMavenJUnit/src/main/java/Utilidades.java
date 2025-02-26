import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilidades.
 */
public class Utilidades {

	public static void main(String[] args) {
		Utilidades util1 = new Utilidades();
		System.out.println("inicializando");
		int num1 = 1;
		int denom1 = 2;
		int num2 = 3;
		int denom2 = 4;
		int resultadoNumerador = 3;
		int resultadoDenominador = 8;
		Fraccion resultado = util1.multiplicar(new Fraccion(num1, denom1), new Fraccion(num2, denom2));
		System.out.println(resultado);
		Fraccion fraccion1= new Fraccion(1,2);
		Fraccion fraccion2= new Fraccion(1,2);
		
	}


    /**
     * Multiplicar.
     *
     * @param fraccion1 the fraccion 1
     * @param fraccion2 the fraccion 2
     * @return the fraccion
     */
    public Fraccion multiplicar(Fraccion fraccion1, Fraccion fraccion2) {
        Fraccion resultado= new Fraccion(fraccion1.getNumerador() * fraccion2.getNumerador(), fraccion1.getDenominador() * fraccion2.getDenominador());
        return resultado;
    }

   
}

