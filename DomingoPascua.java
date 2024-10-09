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

public class DomingoPascua {
    
    public static void main(String[] args) {
        
    Scanner teclado=new Scanner(System.in);
    
    System.out.print("Dame el año en el que estamos para saber cuando cay pascua. ");
    int año= teclado.nextInt();
    
    int A = año % 19;
    int B = año % 4;
    int C = año % 7;
    int D = (19 * A + 24) % 30;
    int E = (2 * B + 4 * C + 6 * D + 5) % 7;
    int N = 22 + D + E;
     
    String añoPascua =(N <= 31)? "cae en Marzo":"cae en Abril";
  
   
    System.out.println("El domingo de pascua " + añoPascua +" y cae el dia " + N );
    
    }
}
