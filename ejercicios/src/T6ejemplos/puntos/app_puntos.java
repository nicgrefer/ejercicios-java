package T6ejemplos.puntos;

public class app_puntos {

	
	 public static void main(String[] args) {
	        Punto p1=new Punto(125, -15);
//	        p1.setX(125);
//	        p1.setY(-15);


	        Punto p2=new Punto(0.0, 13.5);
//	        p2.setX(0.0);
//	        p2.setY(13.5);

	        System.out.println(p1.mostrar());
	        System.out.println(p2.mostrar());
	        
	        p1.desplazamiento(10,5);
	   	 	System.out.println("El numero desplazado es: "+ p1);
	   	
	   	 	p1.desplazar(25, 360);
	   	 	System.out.println("El punto p1 ahora esta en " + p1);
	   	 	
	   	 double distancia=p1.distancia(p2);

	   	System.out.printf("Distancia entre %s y %s: %.2f %n", 
                p1.toString(), p2.toString(), distancia);
	    
	    p1.alCentro();
	        System.out.println("El punto ahora esta en medio de la pantaya que es = " + p1);
	        
	   	 	
	    }
	
	 
	 
}
