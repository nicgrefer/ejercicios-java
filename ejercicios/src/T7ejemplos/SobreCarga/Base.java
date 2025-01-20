package T7ejemplos.SobreCarga;

/**
 * Ejemplo de sobre carga
 */

public class Base {

	public void metodo1() {
		System.out.println("Base metodo1");
	}
	
	public void metodo2() {
		System.out.println("Base metodo2");
	}
	// Sobrecarga del metodo2
	public void metodo2(int x) {
		System.out.println("Base metodo2 con un argumento x");
	}
	
	// Sobrecarga del metodo2
	public void metodo2(int x, int y) {
		System.out.println("Base metodo2 con dos argumentos x e y");
	}
	
	//No permitido porque el metodo de retorno no se aplican a la sobrecarga
//	public Boolean metodo2(int a) {
//		return true;
//	}
	
}
