package T6ejercicios.persona;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	private int edadEnAños;
	private double alturaEnCentimetros;
	private double pesoEnKg;
	private boolean casado;
	
	//
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	//
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	//
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	//
	public int getEdadEnAños() {
		return edadEnAños;
	}
	public void setEdadEnAños(int edadEnAños) {
		this.edadEnAños = edadEnAños;
	}
	//
	public double getAlturaEnCentimetros() {
		return alturaEnCentimetros;
	}
	public void setAlturaEnCentimetros(double alturaEnCentimetros) {
		this.alturaEnCentimetros = alturaEnCentimetros;
	}
	//
	public double getPesoEnKg() {
		return pesoEnKg;
	}
	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}
	//
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	//
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
