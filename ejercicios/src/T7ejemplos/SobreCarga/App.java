
package T7ejemplos.SobreCarga;

public class App {
	public static void main(String[] args) {
		
		Base base = new Base();
		base.metodo1();
		base.metodo2();
		base.metodo2(1);
		base.metodo2(1, 2);
		
		System.out.println("------------------");
		
		Derivada derivada = new Derivada();
		derivada.metodo1();
		derivada.metodo2();
		derivada.metodo3();
	}
}
