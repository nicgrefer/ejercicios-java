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
	
	public  void toDecimal() {
		double numerador= (double) numeroador;
		double denominador= (double) denomirador;
		double sol=numerador/denominador;
		System.out.println("Sol="+ sol);
	}
	
	
	public void equals(int numeradorR, int denominadorR ) {
		if (numeradorR==numeroador && denominadorR==denomirador) {
			System.out.println("Son los mismos relaccionales");
		}else {
			System.out.println("No son los mismos relaccionales");
		}
	}
	
	public void compareTo(double numeradorR, double denominadorR ) {
		double numerador= (double) numeroador;
		double denominador= (double) denomirador;
		double resultado1= numerador/denominador;
		double resultadoR=numeradorR/denominadorR;
		if (resultado1>resultadoR) {
			System.out.println("El relaccional actual es menor con respecto al anterior");
		}else {
			System.out.println("El relaccional actual es mayor con tespecto al anterior");
		}
	}
	
	
}
