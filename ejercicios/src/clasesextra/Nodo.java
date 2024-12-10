package clasesextra;

import java.util.ArrayList;

public class Nodo {

	private String nombre;
	private String tipo;
	private ArrayList<Nodo> hijos=new ArrayList<Nodo>();
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setHijos(ArrayList<Nodo> hijos) {
		this.hijos = hijos;
	}
	@Override
	public String toString() {
		return "Nodo [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	public Nodo(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public ArrayList<Nodo> getHijos() {
		return hijos;
	}

	
	
	
}
