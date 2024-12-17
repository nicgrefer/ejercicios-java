package T6ejercicio.racional;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Relaccional n1=new Relaccional(3,5);
		System.out.println(n1.toString());
		n1.dividir(2,3);
		n1.toDecimal();
		n1.equals(3,5);
		n1.compareTo(4, 3);
	}

}
