/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author jovcubni
 */
public class ejemplo1 {
    
    public static void main(String[] args) {
        // creamos un ArrayList String, si no masraca el tipo se podria mezcalr los tipos de datos
    ArrayList<String>lista = new ArrayList<>();
    
        System.out.println("Esta vacia " + lista.isEmpty());
        
        lista.add("uno");        lista.add("dos");        lista.add("tres");        lista.add("cuatro");
        
        // Tamanio del array 
        
        System.out.println("No. de elementos que contiene: "+ lista.size());
        
        // Mostrar array
        
        System.out.println(lista);        
    
        // Añadir un objeto en el medio
        
        lista.add(0, "cero");
        
        // Mostrar 
        System.out.println(lista);
        
        // Remplazar la cadena 'tres' por la cadena 'new3'
        String newElemento = "new3";
        lista.set(3, newElemento);
        System.out.println(lista);
       
        // Vaciar array
        //lista.clear();
        //System.out.println(lista);
        
        
        // Borrado de elementos
        
        // 2 tipos -> remove o 
        System.out.println("Eliminado e elemento nueve "+lista.remove( "nueve"));
        //String objBorrado=lista.remove(0);
        
        // Busqueda 
        
        System.out.println("Esta la cadena 99 " + lista.indexOf("99")); // --> 1 o -1
        System.out.println("Esta la cadena 1 "+ lista.contains("uno"));// --> true o false
        
        // Ordenación 
        
        Collections.sort(lista);
        System.out.println(lista);
            // Busqueda 
            String key = "nueva";
            System.out.println(Collections.binarySearch(lista, key));
            key = "dos";
            System.out.println(Collections.binarySearch(lista, key));
            
        Collections.reverse(lista);
        System.out.println(lista);
        
    }
   
}
