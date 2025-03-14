/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapas.Ejercicios.Libros;

/**
 *
 * @author jovcubni
 */
public class ListaStok {
    
    //Variables
    private String Codigo;
    private int Stok;
    
    // Getter y setter

    public String getCodigo() {
        return Codigo;
    }
    public int getStok() {
        return Stok;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public void setStok(int Stok) {
        this.Stok = Stok;
    }
    
   // Constructor

    public ListaStok(String Codigo, int Stok) {
        this.Codigo = Codigo;
        this.Stok = Stok;
    }
    
    // To string 

    @Override
    public String toString() {
        return Codigo + " "+ Stok+ "" ;
    }
    
    
    
}
