
public class Aplicacion {
	public static void main(String... arg)
	{
		Trabajador t = new Trabajador("Juan", "12345678Z");
		Trabajador t2 = new Trabajador("Maria", "13493484Y");
		Trabajador t3 = new Trabajador("Pedro", "12345678Z");
		Empresa e = new Empresa("Gregorio Fernandez","838383B");
		Direccion gf= new Direccion(23, "calle Gabilondo", 0, 0);
		
		
		t.setDireccion(gf);
		System.out.println(t);
		e.setDireccion(gf);
		
		
		//Queremos asignar la misma direccion del trabajador 1 al 2 con el método
		//static void asignarDireccion(Trabajador t1, Trabajador d2)
		asignarDireccion(t, t2);
		System.out.println(t2);
		
		
		// Quiero hacer lo mismo, copiar la dirección del primero al segundo
		// Pero a través de la clase Trabajor
		t.copiarDireccion(t2);
		System.out.println(t2);
		
	}
	
	public static void asignarDireccion(Trabajador t1, Trabajador trabajadorDestino) {
		trabajadorDestino.setDireccion(t1.getDireccion());
	}
}
