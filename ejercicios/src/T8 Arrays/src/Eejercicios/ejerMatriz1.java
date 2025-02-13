/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eejercicios;


import java.util.Arrays;

/**
 *
 * @author jovcubni
 */
public class ejerMatriz1 {
    

    
    public void rellenar(int[][]matrid){
        int filas = matrid.length;
        int columnas = matrid[0].length;
        int  suma = 0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 1) {
                    matrid[i][j] = (int) (2*j+1); 

                } else {
                    
                    matrid[i][j] = (int) (2*suma); 
                    suma++;
                }
            }
        }
    }
    
    public void mostrar (int [][]matrid){
        int filas = matrid.length;
        int columna = matrid[0].length;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columna;j++){
                System.out.print(matrid[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    
    public int suma(int [][]matrid){
        int suma = 0;
        int filas = matrid.length;
        int columna = matrid[0].length;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columna;j++){
                 suma= suma+matrid[i][j];
            }
        }
        return suma;
    }
    
    public void mostrarDiagonal(int [][]matrid){
        for (int i = 0; i < matrid.length; i++) {
            for(int j=0; j < matrid[0].length; j++){
                if(i==j){
                     System.out.print(matrid[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        ejerMatriz1 app = new ejerMatriz1();
        
        int [][]tabla;
        tabla = new int [5][5];
        
        app.rellenar(tabla);
        System.out.println("Tabla creada");
        app.mostrar(tabla);
        System.out.println("Suma: "+ app.suma(tabla));
        app.mostrarDiagonal(tabla);
        
    }
}
