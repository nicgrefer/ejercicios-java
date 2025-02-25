/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosArrayList.Banco;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author macarena
 */
public class AppBanco {

    //método que busque todas las cuentas con saldo superior a 1000€
    public ArrayList<Cuenta> getCuentas(ArrayList<Cuenta> lista, double importe) {
        ArrayList<Cuenta> listaResultado=new ArrayList<>();
        for(Cuenta cuenta:lista){
            if(cuenta.getSaldo()>importe){
                listaResultado.add(cuenta);
            }
        }
        return listaResultado;
    }

    //método que ordene los clientes por NIF
    public void ordenarClientesXNIF(ArrayList<Cliente> lista){
        Collections.sort(lista);
    }
        
    //método que busque el cliente con un código determinado
    public Cliente getCliente(ArrayList<Cliente> listaClientes, int codigoCli){
        Cliente key=new Cliente();
        key.setCodCli(codigoCli);
        
        int posicion=listaClientes.indexOf(key);
        
        if(posicion==-1) return null;
        else return listaClientes.get(posicion);
    }
    
    
    //método que ordene las cuentas por fecha (descendentemente)
    //método que busque la cuenta con un nº determinado
    //método que busque las cuentas de un cliente determinado
    public static void main(String[] args) {
        AppBanco app=new AppBanco();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();

        try {
            Cliente cliente1 = new Cliente("99999999A", "Pepe", "Perez");
            Cliente cliente2 = new Cliente("22222222B", "Maria", "Fernandez");

            listaClientes.add(cliente1);
            listaClientes.add(cliente2);

            //mostramos la lista de clientes
            System.out.println(listaClientes);

            Cuenta cuenta1 = new Cuenta(cliente1);
            cuenta1.setSaldo(1500);
            Cuenta cuenta2 = new Cuenta(cliente2);

            listaCuentas.add(cuenta1);
            listaCuentas.add(cuenta2);

            //mostramos la lista de cuentas
            System.out.println(listaCuentas);
            
            //prueba de métodos
            //--------------------------------------
            double importe=1000;
            ArrayList<Cuenta> resultado=app.getCuentas(listaCuentas, importe);
            if(resultado.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay ninguna cuenta con saldo superior a " + importe + " €");
            }else{
                System.out.println("Cuentas con saldo superior a " + importe + " €");
                System.out.println(resultado);
            }
            
            //--------------------------------------
            System.out.println("Lista de clientes ordenada por NIF");
            app.ordenarClientesXNIF(listaClientes);
            System.out.println(listaClientes);
             //--------------------------------------
             System.out.println("Busqueda de cliente por codigo cliente");
             Cliente clienteResultado=app.getCliente(listaClientes, 1);
             if(clienteResultado!=null){
                 System.out.println("Cliente encontrado...");
                 System.out.println(clienteResultado);
             }else{
                 JOptionPane.showMessageDialog(null, "No hay ningun cliente con ese código");
             }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
