package T6.ejemplos.Excepcion;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio del ejemplo");
		metodo1();
		System.out.println("Fin del ejemplo");
	}

	public static void metodo1() {
		try {
			System.out.println("Empieza metodo 1");
			metodo11();
			System.out.println("Termina metodo 11");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error manejado en metodo 1");
			System.out.println("Se ha producido un error inesperado");
		}finally {
			System.out.println("Hola, yo que se");
		}
		

	}
	
	public static void metodo11() {
		System.out.println("Empieza el metodo 11");
		metodo111();
		System.out.println("Termina metodo 111");
		
	}
	
	public static void metodo111() {
		System.out.println("Empieza metodo 111");
		String s =null;
		System.out.println("Longitud de la cadena" + s.length());
		System.out.println("Termina metodo 111");

	}
	
	
}
