package T7ejemplos.Areas_Metosos_abstractos;

public class App {

	public static void main(String[] args) {
        Circulo c = new Circulo(5);
        System.out.println("Área del círculo: " + c.calcularArea());
        
        Rectangulo r = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + r.calcularArea());
        
    }
	
}
