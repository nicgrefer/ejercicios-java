/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapas.Ejercicios.Libros;

/**
 *
 * @author jovcubni
 */
public class ListaCategoria {
    
    private char Categoria;
    
    // Getter y setter

    public char getCategoria() {
        return Categoria;
    }

    public void setCategoria(char Categoria) {
        this.Categoria = Categoria;
    }
    
    // Constructor

    public ListaCategoria(char Categoria) {
        this.Categoria = Categoria;
    }
    
    // To string 

    @Override
    public String toString() {
        return  Categoria+"" ;
    }
    
    
    
}
