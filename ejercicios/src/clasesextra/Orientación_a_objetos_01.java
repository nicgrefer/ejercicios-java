package clasesextra;

public class Orientación_a_objetos_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona pedro=new Persona("Perro Sanchés", 1.80,80,30);
		Persona maria=new Persona("Maria", 1.72,66,20);
		Persona victor=new Persona();
		
		Persona ivan=new Persona("Ivan",1.76);
		ivan.setEdad(23);
		
		Asignatura lenguajeMarcas=new Asignatura("Lenguaje de marcas", 4,"Victor");
		
		System.out.println(pedro);
		System.out.println(ivan);
		System.out.println(lenguajeMarcas);
	}

}
