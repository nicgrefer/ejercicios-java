package T6ejemplos.persona;

public class Persona {

	
		
		private String dni;
		private String nombre;
		private String apellido;
		private int edad;
		private boolean fumador;
		private double altura; //en metros
		
		//Constructor por defecto (El que no recibe parametros)
		public Persona() {
			this.dni="";
			this.altura=0.0;
			this.apellido="";
			this.fumador=false;
			this.edad=0;


		}
		
		public Persona(String dni,String nombre, String apellido ) {
			
		}
		
		
		//Metodos --> comportamientos
		//Getter
		
		public String getDni(){
			return dni;
		}
		public String getNombre(){
			return nombre;
		}
		public int getEdad(){
			return edad;
		}
		public boolean getFumador(){
			return fumador;
		}
		public double getAltura(){
			return altura;
		}
		public String getApellido() {
			return apellido;
		}
		//Seter
		
		public void setDni(String dni){
			this.dni=dni;
		}
		public void setNombre (String nombre) {
			this.nombre=nombre;
		}
		public void setApellido (String apellido) {
			this.apellido=apellido;
		}
		public void setEdad (int edad) {
			this.edad=edad;
		}
		public void setFumador (Boolean fumador) {
			this.fumador=fumador;
		}
		public void setAltura (Double altura) {
			this.altura=altura;
		}
	

		public String mostrar() {
			String mensaje="";
			mensaje="DNI: " + getDni();
			mensaje+="Nombe: "+ getNombre();
			mensaje+="apellido: "+ getApellido();
			mensaje+="edad: "+ getEdad();
			mensaje+="fumador: "+ getFumador();
			return mensaje;
		}
		
}
