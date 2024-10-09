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
public class Bisiestos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean bisiesto = false;
        System.out.print("Dime en qué año estamos para saber si es bisiesto o no: ");
        int año = teclado.nextInt();
        
        if (año % 4 == 0) {
            bisiesto = true;
            if (año % 100 == 0 && año % 400 != 0) {
                bisiesto = false;
            }
        }
        
        if (bisiesto) {
            System.out.print("Es bisiesto");
        } else {
            System.out.print("No es bisiesto");
        }
    }
}

