package T4ejemplos;

public class EjemploString {

	public static void main(String[] args) {

		//------------------------------------------------------------------------------------------------------------------//
		//comparación de cadenas "y ordenarlas" (compareTo) (ardena por orden alfabeticos de la primera letra)
		System.err.println("Comparativas con compareTo");
		
		String s1="abejoro";
		String s2="abeja";
		//las relacciones se relacciona seleccionando un elemento y luego poner un "." para el método
		
		// compara s1(this) con s1 (other)
		int sol1=s1.compareTo(s1);//solución 0 por ser igual
		System.out.println(sol1);
		
		// compara s1(this) con s2 (other)
		int sol2=s1.compareTo(s2);//solución positibo siendo esta la distancia entre ellas en ASCII
		System.out.println(sol2);
		
		System.out.println();
//------------------------------------------------------------------------------------------------------------------//
		
		// Comparativa (equals)
		System.err.println("Comparativas con equals");
		
		System.out.println(s1.equals(s2));
	
		System.out.println("hola".equals("hola"));
		
		System.out.println();
//------------------------------------------------------------------------------------------------------------------
		
		//Longitud del objeto
		System.err.println("Mirar cual es la longitud de un String");
		
		System.out.println(s1.length());
		
		System.out.println();
//------------------------------------------------------------------------------------------------------------------
		
		
		//Busquedas de cadenas (contains)
		System.err.println("Busquedas de cadenas con modelo contains");
		
		String s3="Desarrollo de aplicaciones multiplataforma";
		
		System.out.print(s3.contains("aplicaciones"));//printea True o False
		

		System.out.println();
//------------------------------------------------------------------------------------------------------------------		
		
		//Busquedas de cadenas (Index)
		System.err.println("Ahora con el formato .index..");
		
		System.out.println(s3.indexOf("aplicaciones"));//Te dice en que caracrer empieza lo que se busca
		
		
		System.out.println(s3.indexOf("a"));
		
		
		System.out.println();
//------------------------------------------------------------------------------------------------------------------			
		
		
		
		
		
	}

}
