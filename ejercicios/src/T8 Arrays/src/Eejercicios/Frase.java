/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class Frase {
    public static final int TAM=5;

    public static void main(String[] args) {
         String [] frase = new String[TAM];
         Frase fr= new Frase();
         
        for (int i = 0; i<TAM;i++){
            frase[i]= JOptionPane.showInputDialog(null, "Introduce la palavrea que esta en posicion "+i+": ");
        }
        
    fr.imprimeFrase(frase);
    fr.mayorFrase(frase);
    fr.menorFrase(frase);
        
    }
    
    public void imprimeFrase(String [] frase){
        for (int i = 0; i<TAM;i++){
            System.out.println("La palabra que se encuenta en la posicion "+i+" es "+frase[i] );
        }
        
    }
    
    public void mayorFrase(String [] frase){
        int masLargaLong = 0;
        String masLarga="";
        int posicion=0;
        for (int i =0; i<TAM;i++){
            if (frase[i].length() > masLargaLong) {
                masLargaLong = frase[i].length();
                masLarga = frase[i];
                posicion = i;
            }
        }
        System.out.println("La palabra que esta en la posicion "+posicion+" con valor '"+ masLarga+"' es la palabra mas larga");
    }
    
    public void menorFrase(String [] frase){
        int masCortaLong =Integer.MAX_VALUE;
        String masCorta = "";
        int posicion =0;
        for (int i = 0; i<TAM; i++){
            if(frase[i].length()<masCortaLong){
                masCortaLong = frase[i].length();
                masCorta = frase[i];
                posicion=i;
            }
        }
        System.out.println("La palabra que esta en la posicion "+posicion+" con valor '"+ masCorta+"' es la palabra mas corta");
    }
}
