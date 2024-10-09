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
public class SigmoNumero {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Dame un mumero: ");
        int caracter=teclado.nextInt();
         
        if (caracter < 0 ){
             
             System.out.print("Es negativo.");
             
         }
        
        else if (caracter > 0){
             
             System.out.print("Es positivo.");
             
         }
        
         else{
             
             System.out.print("Es nulo.");
                         
         }
         
         
         
         
         
     }
}
