/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Arrays;

/**
 *
 * @author jovcubni
 */
public class Matrices1 {
     
    public void mostrarTabla_1(int [][]matrid){
        int filas = matrid.length;
        int columna = matrid[0].length;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columna;j++){
                System.out.print(matrid[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    
    public void mostrarTabla_2(int [][]matrid){
        for (int i = 0;i<matrid.length;i++){
            System.out.println(Arrays.toString(matrid[i]));
        }
        System.out.println("***************");
        for (int[] vertice : matrid) {
            System.out.println(Arrays.toString(vertice));
        }
    }
    
    public static void main(String[] args) {
        
        Matrices1 app = new Matrices1();
        
        int [][]tabla;// declaracion de una matrid de enteros
        tabla = new int [5][3];// Creaccion de la matriz 5x3
        
        app.mostrarTabla_1(tabla);
        System.out.println("------------------");
        app.mostrarTabla_2(tabla);

        
        
    }
    
}
