/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapas;

import java.text.Collator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jovcubni
 */
public class EjemploMapa {
    public static void main(String[] args) {
        
         // Cramos  mapa
        Map<Integer, String> mapa = new HashMap<>();
    
        // rellenamos se usa `.put` 
        mapa.put(1, "Cliente1");
        mapa.put(2, "Cliente2");
        mapa.put(3, "Cliente3");
        mapa.put(4, "Cliente4");
        mapa.put(5, "Cliente5");
        
        // Mostramos contenido del mapa
      
        System.out.println(mapa);
        
        // Mostrar congunto de valores
        
        Collection <String> valores = mapa.values(); // .values debuelve un `Collection` --> El valor
        System.out.println(valores); // mostramos toda la Collection
        
        // Mostrar congunto de clabes
        Set <Integer> cleves= mapa.keySet();// .keySet devielve un `Set` -->La clave 
        System.out.println(cleves);
        
        // Ahora bamos a realizar busquedas
        
        // -> Buscamos por clave
        
        Integer kay = 2;
        
        if (mapa.containsKey(kay)){
            System.out.println("Valor asociado a la cave.. "+ mapa.get(kay));
        }else{
            System.out.println("No existe esa calave");
        }
        
        // -> Buscamos por valor
        
        String value = "Cliente3";
        
        if (mapa.containsValue(value)){
            System.out.println("Valor almacenado en el mapa");
        }else {
            System.out.println("El valor no se amacena en el mapa");
        }
        
       
        
    }
    

}
