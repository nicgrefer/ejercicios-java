/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author jovcubni
 */
public class CambioED {
    
    public static void main(String[] args) {
    
        Scanner teclado=new Scanner (System.in);
        final double cambioDibisa=1.11;
        
        System.out.print("Cuantos euros quieres pasar a dolares: ");
        float euros = teclado.nextFloat();
        
        double conversionDolar = (euros*cambioDibisa/1);
        
        System.out.println("Los " + euros + " euros equivalen a " + conversionDolar + " dolares");
        
        
        
    }
    
}
