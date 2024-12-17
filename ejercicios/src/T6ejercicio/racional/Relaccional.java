package T6ejercicio.racional;

public class Relaccional {

	private int numeroador;
	private int denomirador;
	
	//Getters y setters
	public int getNumeroador() {
		return numeroador;
	}
	public void setNumeroador(int numeroador) {
		this.numeroador = numeroador;
	}
	public int getDenomirado() {
		return denomirador;
	}
	public void setDenomirado(int denomirado) {
		this.denomirador = denomirado;
	}
	//Constructor
	public Relaccional(int numeroador, int denomirado) {
		super();
		this.numeroador = numeroador;
		this.denomirador = denomirado;
	}
	//String 
	@Override
	public String toString() {
		return "Relaccional =" + numeroador + "/" + denomirador ;
	}
	
	//Funciones
	
	public void sumar(int denominadorR, int numeradorR) {
		if (denominadorR==denomirador) {
			int aux=numeradorR+numeroador;
			System.out.println("Sol= " + aux +"/" + denominadorR);
		}else {
			//Ponemos base comun
			int numeroadorNuevo=numeroador*denominadorR;
			denomirador=denomirador*denominadorR;
			numeradorR=denominadorR*denomirador;
			denominadorR=denominadorR*denomirador;
			//Realizamos la suma
			int aux=numeradorR+numeroador;
			System.out.println("Sol= " + aux +"/" + denominadorR);
		}
	}
	
	public void restar(int denominadorR, int numeradorR) {
		if (denominadorR==denomirador) {
			int aux=numeradorR-numeroador;
			System.out.println("Sol= " + aux +"/" + denominadorR);
		}else {
			//Ponemos base comun
			int denominadoraux=denomirador; //guardamos el dato del denominador n1
			numeroador=numeroador*denominadorR;
			denomirador=denomirador*denominadorR;
			numeradorR=denominadorR*denominadoraux;
			denominadorR=denominadorR*denominadoraux;
			//Realizamos la suma
			int aux=numeradorR-numeroador;
			System.out.println("Sol= " + aux +"/" + denominadorR);
		}	
	}
	
	
	public void producto( int numeradorR, int denominadorR) {
		int numeradorSol=numeradorR*numeroador;
		int denominadorSol=denominadorR*denomirador;
		System.out.println("Sol= " + numeradorSol +"/" + denominadorSol);
	}
	
	public void dividir(int denominadorR, int numeradorR) {
		int numeradorSol=denominadorR*numeroador;
		int denominadorSol=numeradorR*denomirador;
		System.out.println("Sol= " + numeradorSol +"/" + denominadorSol);
	}
	
	
	
	
}
