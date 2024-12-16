package T6ejercicio.ascensor;

import java.util.Scanner;

public class Ascensor {

	private int pisoEsta;
	private final int pisosTiene;
	private boolean puertaAbierta;
	private boolean alarmaActivada;
	private double capacidad;
	private int ocupacionActual;
	
	public Ascensor(int pisosTiene,double capacidad) {
            this.pisosTiene=pisosTiene;
            this.capacidad=capacidad;
	}
	//Setters y getters
	public int getPisoEsta() {
		return pisoEsta;
	}
	public void setPisoEsta(int pisoEsta) {
		this.pisoEsta = pisoEsta;
	}
	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}
	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}
	public boolean isAlarmaActivada() {
		return alarmaActivada;
	}
	public void setAlarmaActivada(boolean alarmaActivada) {
		this.alarmaActivada = alarmaActivada;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public int getOcupacionActual() {
		return ocupacionActual;
	}
	public void setOcupacionActual(int ocupacionActual) {
		this.ocupacionActual = ocupacionActual;
	}
	public int getPisosTiene() {
		return pisosTiene;
	}
	@Override
	public String toString() {
		return "Ascensor esta en el piso " + pisoEsta + ", que consta de " + pisosTiene + " pisos, con la ¿puerta abierta? " + puertaAbierta
				+ " ¿alarmaActivada? " + alarmaActivada + ", con capacidad de " + capacidad + "kg y una ocupacion de "
				+ ocupacionActual ;
	}
	
	public void abrirPuerta() {
		puertaAbierta=true;
		System.out.println("Puera abierta");
	}
	
	public void cerrarPuerta() {
		puertaAbierta=false;
		System.out.println("Pueta cerrada");
	}
	
	public void subirPiso() {
		if (puertaAbierta==false) {
			pisoEsta++;
			if (pisoEsta==pisosTiene) {
				System.out.println("Ya esta arriba del todo");
				pisoEsta=pisosTiene;
			}else {	
			System.out.println("Estas en el piso "+ pisoEsta + " de "+ pisosTiene);
			}
		}else {
			System.out.println("La puerta sigue abierta y no puede subir. Porfavor cierre la puerte.");
		}
	}
	
	public void bajarPiso() {
		if (puertaAbierta==false) {
			pisoEsta--;
			if (pisoEsta<0) {
				System.out.println("Ya esta en el ultimo piso");
				pisoEsta=0;
			}else {
				System.out.println("Estas en el piso "+ pisoEsta + " de "+ pisosTiene);
			}
		}else {
			System.out.println("La puerta sigue abierta y no puede salir");
		}
		
	}
	
	public void entraPersona() {
		if(puertaAbierta==true) {
			ocupacionActual+=45;
			if(ocupacionActual<capacidad) {
				
				System.out.println("El peso actual es de " + ocupacionActual);
			}else {
				System.out.println("El ascensor llego a su limite de peso ("+ capacidad+")");
				alarmaEncendida();
			}
		}else {
			System.out.println("La puerta esta cerrada y no puedes entrar");
		}
		
	}
	public void alarmaEncendida() {
		Scanner sc=new Scanner(System.in);
		System.err.println("ALARMA, ALARMA..... peso maximo excedido");
		System.err.println("Porfavor salga alguien del ascensor");
		System.out.println("Desea salir? pulsa s o n");
		String peticion=sc.next();
		if (peticion.equals("s")) {
			ocupacionActual-=45;
			System.out.println("Alarma desactivada, peso actual es de "+ ocupacionActual + "/"+ capacidad);
			sc.close();
			}else {
			alarmaEncendida();
		}
		
	}
	
	public void salePersona() {
		if(puertaAbierta==true) {
			ocupacionActual-=45;
			if(ocupacionActual>0) {
				
				System.out.println("El peso actual es de " + ocupacionActual);
			}else {
				System.out.println("No hay nadie en el ascensor.");
				ocupacionActual+=45;
				
			}
		}else {
			System.out.println("La puerta esta cerrada y no puedes entrar.");
		}
		
	
	}
	
}
