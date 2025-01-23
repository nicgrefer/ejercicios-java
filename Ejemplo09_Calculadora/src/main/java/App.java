import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		App app = new App();
		int opcion =0 ;
		app.menu();
		opcion = sc.nextInt();
		System.out.println("Introduzca el primer dato");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo dato");
		int b = sc.nextInt();
		
		while (opcion != 5) {			
			switch(opcion) {
			case 1:
				suma s = new suma();
				s.sumar(a, b);
				break;
			case 2:
				resta r = new resta();
				r.restar(a, b);
				break;
			case 3:
				multiplica m = new multiplica();
				m.multiplicar(a, b);
				break;
			case 4:
				divide d = new divide();
				d.dividir(a, b);
				break;
			
			}
			app.menu();
			opcion = sc.nextInt();
			System.out.println("Introduzca el primer dato");
			a = sc.nextInt();
			System.out.println("Introduzca el segundo dato");
			b = sc.nextInt();
		}
		 
		System.out.println("Saliste");
		
		
		
	}

	public void menu() {
		System.out.println("Sumar-- 1");
		System.out.println("Restar-- 2");
		System.out.println("Multiplicar-- 3");
		System.out.println("Dividir-- 4");
		System.out.println("Salir-- 5");
		
	}
	
}
