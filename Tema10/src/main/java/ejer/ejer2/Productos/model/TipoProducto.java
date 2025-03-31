/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer.ejer2.Productos.model;

/**
 *
 * @author jovcubni
 */
public class TipoProducto {
 
    private int idTipo;
    private char tipo;

    public TipoProducto() {
    }

    public TipoProducto(char tipo) {
        this.tipo = tipo;
    }

    public TipoProducto(int idTipo, char tipo) {
        this.idTipo = idTipo;
        this.tipo = tipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
