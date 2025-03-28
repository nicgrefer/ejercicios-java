package T6ejemplos.puntos;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Punto {
    private double x;
    private double y;

    //constructor
    public Punto (double x, double y){
        this.x=x;
        this.y=y;
    }

    //metodos (get y set)
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    public String mostrar(){
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }
    
    @Override
    public String toString(){
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }
    
    public void desplazamiento(double desplX, double desplY) {
    	this.x+=desplX;
    	this.y+=desplY;
		
	}
    
    public void desplazar(double nuevaX, double nuevaY) {
    	this.x=nuevaX;
    	this.y=nuevaY;
		
	}
    
    
    public double distancia(Punto otro){
        double calculo = Math.sqrt(Math.pow((otro.getX()-this.getX()),2)
        + (Math.pow((otro.getY()-this.getY()), 2)));
        return calculo;
    }
    
    public void alCentro(){
    	Dimension dimVentana= Toolkit.getDefaultToolkit().getScreenSize();
    	double alto= dimVentana.getHeight();
    	double ancho= dimVentana.getWidth();
    	this.x=ancho/2;
    	this.y=alto/2;
    }
    
}

  