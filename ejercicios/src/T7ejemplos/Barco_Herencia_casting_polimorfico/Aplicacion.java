package T7ejemplos.Barco_Herencia_casting_polimorfico;

public class Aplicacion {

	public static void naufragio(Barco barco) {
		barco.alarma();// Metodo polimorfico --> Depends del objeto que se pase llamara a un metodo u otro
		if (barco instanceof Velero) {
			//casting
			((Velero)barco).arriar();
		}
		if (barco instanceof Yate) {
			//casting
			((Yate)barco).lanzarBengala();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Referencia de tipo BARCO 
		 */
		Barco barco = null;
		/**
		 * Instancias de las clases hijas
		 */
		Velero velero = new Velero();
		Yate yate = new Yate();
		
		//vinculacion de la referencia de tipo BARCO con las clases hijas
		barco = velero;
		barco = yate;
		
	//    naufragio(barco);
		System.out.println("----------------");
		naufragio(velero);
		System.out.println("----------------");
		naufragio(yate);
		
	}

}
