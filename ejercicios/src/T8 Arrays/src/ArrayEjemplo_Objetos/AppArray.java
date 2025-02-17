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
    
   
    public void BusquedaDni(Persona [] arrayPersonas,String dniBuscado){
         
       
        boolean encontrada = false;

        for (Persona persona : arrayPersonas) {
            if (persona != null && persona.getDni().equals(dniBuscado)) {
                System.out.println("Persona encontrada: " + persona);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se ha encontrado ninguna persona con el DNI " + dniBuscado);
        }
        
    }
    // Busqueda por posición
    // Debuelbe la posicion den la que se encuentra co0n el dni en el array
    // 0-1
    public void BusquedaDni2(Persona [] arrayPersonas,String dniBuscado){
        
        for (int i = 0; i< arrayPersonas.length;i++){
            if (arrayPersonas[i].getDni().compareTo(dniBuscado)==0){
                System.out.println("Persona encontrada: " + arrayPersonas[i]);
            }
         System.out.println("No se ha encontrado ninguna persona con el DNI " + dniBuscado);
        }
    }
    
    public static void main(String[] args) {
        
        Persona [] arrayPersonas = new Persona[5];
        AppArray app = new AppArray();
        String dniBuscado = "11145678N";
        
        Persona persona1 = new Persona("Pepe","Juan","12345678N",12);
        Persona persona2 = new Persona("Maria","Tierra","11145678N",18);
        Persona persona3 = new Persona("Marco","Aurelio","12388878N",30);

        
        arrayPersonas[0]= persona1;
        arrayPersonas[1]= persona2; 
        arrayPersonas[2]= persona3;
      
        
        //System.out.println(Arrays.toString(arrayPersonas));
        
        
        // Buscar y mostrar la persona con un dni concreto 
        app.BusquedaDni(arrayPersonas, dniBuscado);        app.BusquedaDni2(arrayPersonas, dniBuscado);

        
       
        // Busca las personas mayores de edad
        
    }
}
