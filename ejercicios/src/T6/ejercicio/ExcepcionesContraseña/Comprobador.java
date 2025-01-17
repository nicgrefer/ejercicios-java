package T6.ejercicio.ExcepcionesContraseña;

import T6.ejemplos.Excepcion.MiEscepcion;
import T6.ejercicio.ExcepcionesContraseña.MisExcepciones.LongitudExcep;
import T6.ejercicio.ExcepcionesContraseña.MisExcepciones.MayusExcep;
import T6.ejercicio.ExcepcionesContraseña.MisExcepciones.MinusExcep;

public class Comprobador {

	private String contraseña;

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Comprobador [contraseña=" + contraseña + "]";
	}

	public Comprobador(String contraseña) {
		super();
		this.contraseña = contraseña;
	}

	public Comprobador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void comprobacionLong() {
		if (contraseña>=8) {
			System.out.println("Longitud corecta");
			tieneMayusculas();
		}else {
			throw new LongitudExcep("Error. La contraseña no contiene como minimo 8 caracteres");
		}
	}
	
	public void tieneMayusculas() {
		 for (int i = 0; i < contraseña.length(); i++) {
			 if (Character.isUpperCase(contraseña.charAt(i))) {
				 System.out.println("Tiene mayusculas");
				 tieneMinusculas();
		}else {
			throw new MayusExcep("Error. La contraseña no contiene mayusculas");
		}
		
	}
	}
	
	public void tieneMinusculas() {
		try {
			 for (int i = 0; i < contraseña.length(); i++) {
		            if (Character.isLowerCase(contraseña.charAt(i)))
		            		System.out.println("Tiene minusculas");          	
		}catch{
			throw new MinusExcep ("Error. la contraseña no tiene minusculas");
		}
		
		}
	}
}
