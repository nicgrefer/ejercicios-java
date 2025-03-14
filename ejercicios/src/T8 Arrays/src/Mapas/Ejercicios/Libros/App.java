/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapas.Ejercicios.Libros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jovcubni
 */
public class App {
    
    public static void main(String[] args) {
        
        // Creacción Stok
        ArrayList<ListaStok> L = new ArrayList<>();
        L.add(new ListaStok("ABART", 20));
        L.add(new ListaStok("CDXEF", 50));
        L.add(new ListaStok("BKWRK", 25));
        L.add(new ListaStok("BTSQZ", 89));
        L.add(new ListaStok("DRTYM", 60));

        // Creación de la lista de categorías
        ArrayList<ListaCategoria> M = new ArrayList<>();
        M.add(new ListaCategoria('A'));
        M.add(new ListaCategoria('B'));
        M.add(new ListaCategoria('C'));
        M.add(new ListaCategoria('W'));

        
        Map<Character, Integer> stockPorCategoria = new HashMap<>();
        
        System.out.println(L);
        System.out.println(M);
        
        // Ponemos el Stok en el mapa a 0
        for (int i= 0; i<M.size();i++){
            stockPorCategoria.put(M.get(i).getCategoria(), 0);
        }
        
        
        // Ahora cogemos la primera letra del Codigo de 'L' y sumamos las existencias
        
        for (int i = 0 ; i<L.size();i++){ // cogemos la primer caracter de la valbe del 'L' que coresponde al codigo de 'M'
            char categoria  = L.get(i).getCodigo().charAt(0);
           
            if (stockPorCategoria.containsKey(categoria )){
                int stokActual = stockPorCategoria.get(categoria );
                int Añade = L.get(i).getStok();
                int stokFinal = Añade+ stokActual;
                stockPorCategoria.replace(categoria ,stokFinal );
            }
            
        }
        
        System.out.println(stockPorCategoria.toString());
        
        
    }
    
}
