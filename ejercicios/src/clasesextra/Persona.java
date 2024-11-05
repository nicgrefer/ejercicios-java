package clasesextra;

public class Persona {
	String nombre;
	double altura;
	double peso;
	int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public  Persona() {
		
	}

	public Persona(String nombre, double altura, double peso, int edad) { //Constructor crea un objeto
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
	}
	
	public Persona(String nombre, double altura) { 
		super();
		this.nombre = nombre;
		this.altura = altura;

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


