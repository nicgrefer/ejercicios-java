package T7ejemplos.Areas_Metosos_abstractos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	double calcularArea() {
		double area = Math.PI * Math.pow(radio, 2);
		BigDecimal bd = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
}
