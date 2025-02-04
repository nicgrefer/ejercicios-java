/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author sandr
 */
public class Personas {
    
    public static final int TAM=5;
    
    public void imprimePersonas(String [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nombre (%d): %s %n", i, array[i]);
            
        }
        
//        //nuevo bucle para objetos
//        for(String nombre:array){
//            System.out.printf("Nombre %s %n", nombre);
//        }
    }
    
    
    public void pares (String [] array ){
        for (int i = 0; i<array.length; i+=2){
            System.out.println(i+array[i]);
        }
    }
    
    public static void main(String[] args) {
        Personas app = new Personas();
        String [] nombres = new String[TAM]; //array para almacenar los nombres
        
        //fori + ctrl + space
        for (int i = 0; i < nombres.length; i++) {
            nombres[i]= JOptionPane.showInputDialog(null, "Nombre ("+i+"): ");
            
        }
        
        //mostramos el contenido del Array
        app.imprimePersonas(nombres);
        app.pares(nombres);
        
    }
}
