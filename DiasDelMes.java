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
public class DiasDelMes {
    
     public static void main(String[] args) {
    
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("Dime el numero del mes en le que estamos");
         int nMes= teclado.nextInt();              
         
         if (nMes == 2){
             
             System.out.println("Este mes tiene 28 dias");
                         
         }else {
             
             boolean comp = (nMes== 4 ||nMes == 6 || nMes == 9 ||nMes == 11);

            System.out.print(comp? "Este mes tiene 30 dias" : "Este mes tiene 31 dias");
       
        }
        
    }
}
