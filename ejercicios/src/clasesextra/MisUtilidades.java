package clasesextra;

public class MisUtilidades {

	
	

	public boolean esLetra(char letra) {
		if ((letra >= 64 && letra <= 90) || (letra >= 97 && letra <= 122)) {
			return true;
		} else {
			return false;
		}
		
	}
}
