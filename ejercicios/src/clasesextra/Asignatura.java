package clasesextra;

public class Asignatura {

	String nombre;
	int horas;
	String nombreProfesor;
	
	
	//
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	
	//
	
	
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", horas=" + horas + ", nombreProfesor=" + nombreProfesor + "]";
	}
	
	//
	
	public Asignatura(String nombre, int horas, String nombreProfesor) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.nombreProfesor = nombreProfesor;
	}
	
	
	public Asignatura()
	{
		
	}
	}
