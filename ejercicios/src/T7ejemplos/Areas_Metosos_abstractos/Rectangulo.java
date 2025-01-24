package T7ejemplos.Areas_Metosos_abstractos;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	double calcularArea() {
		return base * altura;
	}
	
}
