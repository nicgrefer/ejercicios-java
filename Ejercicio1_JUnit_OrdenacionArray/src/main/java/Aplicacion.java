import java.util.Arrays;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int tam=teclado.nextInt();
		int[] datos=new int[tam];
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Introduce un valor");
			datos[i] = teclado.nextInt();
		}
		
		Utilidades utilidades=new Utilidades();
		System.out.println(Arrays.toString(datos));
		datos=utilidades.ordenar(datos);
		System.out.println(Arrays.toString(datos));
		
		
		
		
	}

}
