/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eejercicios;

import java.util.Random;

/**
 *
 * @author jovcubni
 */
public class ejerMatriz2 {
    
    public void rellenar(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++){
   
                matriz[i][j] = (int) (Math.random() * 100);
                
            }
        }
    }
    
    public void mostrar (int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for(int j=0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public void traspuesta(int matriz[][]){
        int [][]traspuesta= new int[5][4];
        for (int i = 0;i<matriz.length;i++){
            for (int j=0; j < matriz[0].length; j++){
                traspuesta[j][i]=matriz[i][j];
            }
        }
        mostrar(traspuesta);
    }
    
    public static void main(String[] args) {
        
        ejerMatriz2 app = new ejerMatriz2();
        
        int [][]tabla;
        tabla = new int [4][5];
        app.rellenar(tabla);
        app.mostrar(tabla);
        System.out.println("------------");
        app.traspuesta(tabla);
        
    }
    
}
