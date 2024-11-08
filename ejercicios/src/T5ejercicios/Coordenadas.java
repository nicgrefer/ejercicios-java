package T5ejercicios;

import java.text.NumberFormat;
import java.util.Scanner;


public class Coordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberFormat nf=NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		Scanner sc =new Scanner(System.in);
		Coordenadas coor=new Coordenadas();
		
		System.out.print("Introduce el tamaño del radio: ");
		double R=sc.nextDouble();
		System.out.print("Introduce el ángulo en grados");
		double grados=sc.nextDouble();
		
		double x=coor.PosicionPuntoX(R, grados);
		double y=coor.PosicionPuntoY(R, grados);
		
		System.out.print("La posición del punto esta en "+ nf.format(x) + " x y "+ nf.format(y) + " y");
		
	}

	public  double PosicionPuntoX(double radio,double angulo) {
		
		
		double radianes= angulo*Math.PI/180;
		return radio*Math.cos(radianes);
	}
	
	public  double PosicionPuntoY(double radio,double angulo) {

		
		double radianes= angulo*Math.PI/180;
		return radio*Math.sin(radianes);	
	}
	
}
