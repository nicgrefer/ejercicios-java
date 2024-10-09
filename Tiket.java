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
public class Tiket {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Total compra con IVA: ");
        double precioConIVA=teclado.nextDouble();
        System.out.print("Porcentaje IVA ");
        double iva=teclado.nextInt();
        
        
        //sin iva
        double precioSinIVA =(precioConIVA-(precioConIVA*(iva/100f)));
        System.out.println("El precio sin IVA es " + precioSinIVA );
        
        
    }
}
    