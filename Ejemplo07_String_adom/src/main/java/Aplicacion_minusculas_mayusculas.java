import org.apache.commons.lang3.StringUtils;

public class Aplicacion_minusculas_mayusculas {

	public static void main(String[] args) {
		
		String testoMinusculas= "este testo debería estar en mayusculas";
		String testoMuestra="";
		testoMuestra=StringUtils.upperCase(testoMinusculas);
		System.out.println(testoMuestra);
	
	}
	
}
