/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayEjemplo_Objetos;

import java.util.Arrays;

/**
 *
 * @author jovcubni
 */
public class AppArray {
    
    public static void main(String[] args) {
        
        Persona [] arrayPersonas = new Persona[5];
        
        
        
        Persona persona1 = new Persona("Pepe","Juan","12345678N",12);
        Persona persona2 = new Persona("Maria","Tierra","11145678N",18);
        Persona persona3 = new Persona("Marco","Aurelio","12388878N",30);

        
        arrayPersonas[0]= persona1;        arrayPersonas[1]= persona2;        arrayPersonas[2]= persona3;
      
        
        System.out.println(Arrays.toString(arrayPersonas));
    }
    
}
