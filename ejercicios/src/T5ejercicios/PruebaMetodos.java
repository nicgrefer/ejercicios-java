package T5ejercicios;

import java.text.NumberFormat;

public class PruebaMetodos {

    public static void main(String[] args) {
        
        Utiles app=new Utiles();
        
        if(app.par(8)) System.out.println("Es par");
        else System.out.println("Es impar");
        
        double gradosCelsius=25.6;
        double gradosF=app.toFahrenheit(gradosCelsius);
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println("Grados F: " + nf.format(gradosF));
        
        int numero=13;        
        System.out.println("El divisor mas grande de " + numero + " es: " + 
            app.divisor(numero));       
        
        
    }
    
}
