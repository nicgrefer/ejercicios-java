package T6ejercicio.ascensor;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascensor ascensor= new Ascensor(99,1);
		System.out.println(ascensor.toString());
		ascensor.abrirPuerta();
		System.out.println(ascensor.toString());
	}

}
