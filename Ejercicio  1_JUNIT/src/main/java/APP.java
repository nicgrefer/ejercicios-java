
import java.util.Arrays;
import java.util.Scanner;

public class APP {

	public int[] ordenarArray(int[] datos) {
		Utilidades utilidades = new Utilidades();
		return utilidades.ordenar(datos);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el tamaño del array: ");
		int size = scanner.nextInt();
		int[] datos = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Introduce el número para la posición " + (i + 1) + ": ");
			datos[i] = scanner.nextInt();
		}

		APP app = new APP();
		int[] datosOrdenados = app.ordenarArray(datos);
		System.out.println("Array ordenado: " + Arrays.toString(datosOrdenados));
	}
}
