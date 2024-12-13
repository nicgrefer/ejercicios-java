package T6ejercicio.ascensor;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascensor ascensor= new Ascensor(99,50);
		System.out.println(ascensor.toString());

		System.out.println(ascensor.toString());
		ascensor.cerrarPuerta();
		ascensor.subirPiso();
		ascensor.bajarPiso();
		ascensor.abrirPuerta();
		ascensor.entraPersona();
		ascensor.entraPersona();
	}

}
