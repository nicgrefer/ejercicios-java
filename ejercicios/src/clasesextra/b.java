package clasesextra;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String datos[]= {"Javier Vergel","Jony Alonso","Mar Gonzalez","Ana Blanco"};
		for (int i = 0; i < datos.length; i++) {
			
			String nombre=datos[i].substring(0, datos[i].indexOf(" "));
			System.out.println(nombre);
			
			//
			String apeyido=datos[i].substring(datos[i].indexOf(" ")+1);
			System.out.println(apeyido);
		}
	}
}