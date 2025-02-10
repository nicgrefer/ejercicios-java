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
public class BusquedaBinaria {
      
    public static void main(String[] args) {
         int[] array = {5, 2, 8, 1, 3, 0, 6};
        
        // Ordenamos el array antes de realizar la búsqueda binaria
        Arrays.sort(array);
        
        // Mostramos el array ordenado correctamente
        System.out.println("Array ordenado: " + Arrays.toString(array));
        
        // Buscamos el número 2 en el array ordenado
        int posicion = Arrays.binarySearch(array, 2);
        System.out.println(posicion);
    }

    
}
