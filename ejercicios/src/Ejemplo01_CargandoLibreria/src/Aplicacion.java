
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo!");
		
		Persona p1= new Persona("Pepe",20);
		
		p1.setNombre("Pepin");
		System.out.println(p1.getNombre());
		System.out.println(p1);
	
		PersonaLombok p2= new PersonaLombok("Pepe",20);
		p2.setNombre("Maria");
		System.out.println(p2.getNombre());
		System.out.println(p2);
	
	}

}
