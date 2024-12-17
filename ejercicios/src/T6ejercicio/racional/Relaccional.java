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
	
	public void sumar(int numeradorR, int denominadorR) {
		if (denominadorR==denomirador) {
			int aux=numeradorR+numeroador;
			System.out.println("Sol= " + aux +"/" + denomirador);
		}else {
			//Ponemos base comun
			int nuevoNumeradorN1=numeroador*denominadorR;
			int nuevoDenominadorN1=denomirador*denominadorR;
			int nuevoNumeradorR= numeradorR*denomirador;
			int nuevoDenominadorR= denominadorR*denomirador;
			
			//Realizamos la suma
			int aux=nuevoNumeradorN1+nuevoNumeradorR;
			System.out.println("Sol= " + aux +"/" + nuevoDenominadorN1);
		}
	}
	
	public void restar(int numeradorR, int denominadorR) {
		if (denominadorR==denomirador) {
			int aux=numeradorR-numeroador;
			System.out.println("Sol= " + aux +"/" + denomirador);
		}else {
			//Ponemos base comun
			int nuevoNumeradorN1=numeroador*denominadorR;
			int nuevoDenominadorN1=denomirador*denominadorR;
			int nuevoNumeradorR= numeradorR*denomirador;
			int nuevoDenominadorR= denominadorR*denomirador;
			
			//Realizamos la suma
			int aux=nuevoNumeradorN1-nuevoNumeradorR;
			System.out.println("Sol= " + aux +"/" + nuevoDenominadorN1);
		}
	}
	
	
	public void producto( int numeradorR, int denominadorR) {
		int numeradorSol=numeroador*numeradorR;
		int denominadorSol=denomirador*denominadorR;
		System.out.println("Sol= " + numeradorSol +"/" + denominadorSol);
	}
	
	public void dividir(int numeradorR, int denominadorR) {
		int numeradorSol=numeroador * denominadorR;
		int denominadorSol=denomirador * numeradorR;
		System.out.println("Sol= " + numeradorSol +"/" + denominadorSol);
	}
	
	
	
	
}
