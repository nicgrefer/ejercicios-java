package T6ejercicios.Calculadora;



public class Calculadora {

	private double n1;
	private double n2;
	private String operacion;
	private double resultado;
	
	//Getter y setter
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//
	@Override
	public String toString() {
	    return "Calculadora " + n1 + " " + operacion + " " + n2 + " = " + resultado;
	}
	
	//
	public Calculadora(double n1, double n2, String operacion) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.operacion = operacion;

	}
	public Calculadora() {
		this.n1=0;
		this.n2 = 0;
		this.operacion = "";
		this.resultado = 0;
	}
	
public double operar(double n1, double n2, String operacion) {
	
	this.n1=n1;
	this.n2=n2;
	this.operacion=operacion;
	
	
	if (operacion.equals("+"))
		resultado= n1+n2;
	else if (operacion.equals("-")) 
		resultado=n1-n2;
	else if (operacion.equals("x")) 
		resultado=n1*n2;
	else if (operacion.equals("/")) 
		if (n2!=0)
			resultado=n1/n2;
		else {
			System.out.println("Error");
			
		}
		
	else if (operacion.equals("%")) 
		resultado=n1%n2;
	return resultado;
}

	
}
