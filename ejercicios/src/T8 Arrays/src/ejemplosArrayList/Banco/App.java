/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosArrayList.Banco;

import java.util.ArrayList;

/**
 *
 * @author jovcubni
 */
public class App {
    public static void main(String[] args) {
        
        ArrayList <Clientes> listaCliente = new ArrayList<>();
        ArrayList <Cuenta> listaCuenta = new ArrayList<>();

        try{
        Clientes cliente1 = new Clientes("12345678A", "PEPE", "LUIS", "Calle Falsa 123", 600123456);
        Clientes cliente2 = new Clientes("22222222B", "MARIA", "LUISA", "Avenida Siempre Viva", 611987654);

        
        listaCliente.add(cliente2); listaCliente.add(cliente1);
        
        System.out.println(listaCliente);
        }catch (Exception e){
                
                }
        
        
    }
    
    //Metodo que busque kas consultas con saldo superior a 100
    // Metodo que ordenen los clientes por NIF
}
