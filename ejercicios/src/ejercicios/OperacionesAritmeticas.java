package ejercicios;
import java.util.Random;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Random aleatorio=new Random();
		int aleatorio1=aleatorio.nextInt(0,11);
		int aleatorio2=aleatorio.nextInt(0,11);
		
		System.out.println("los numeros jenerados son: "+ aleatorio1 + " y " + aleatorio2);
		
		System.out.println(aleatorio1 + " + "+ aleatorio2 + " = " + (aleatorio1+aleatorio2));
		System.out.println(aleatorio1 + " - "+ aleatorio2 + " = " + (aleatorio1-aleatorio2));
		System.out.println(aleatorio1 + " x "+ aleatorio2 + " = " + (aleatorio1*aleatorio2));
		System.out.println(aleatorio1 + " / "+ aleatorio2 + " = " + (aleatorio1/(double)aleatorio2));
		System.out.println("el resto de " + aleatorio1 + " / "+ aleatorio2 + " = " + (aleatorio1%aleatorio2));
		
		
	}

}
