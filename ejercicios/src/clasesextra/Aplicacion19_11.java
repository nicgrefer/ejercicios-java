package clasesextra;



public class Aplicacion19_11 {
	public static void main(String[] args) {
		char letra = 'A';
		System.out.println(letra);
		
		String cadena="hola888";
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i) + " isLetter:" + Character.isLetter(cadena.charAt(i)));
			
		}
		
		
		
		
		MisUtilidades utilidades = new MisUtilidades();
		boolean resultado=utilidades.esLetra('3');
		System.out.println(resultado);
		
		String cadenaCaracteres="kdkdld3838290";
		for (int i = 0; i < cadenaCaracteres.length(); i++) {
			System.out.println(cadenaCaracteres.charAt(i) + " isLetter:" + utilidades.esLetra(cadenaCaracteres.charAt(i)));

		
	}
	}
}
