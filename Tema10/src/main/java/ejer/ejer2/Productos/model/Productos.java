/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer.ejer2.Productos.model;

/**
 *
 * @author jovcubni
 */
public class Productos {
 
    private int idProducto;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int tipo;

    public Productos() {
    }

    public Productos(String descripcion, double precio, int cantidad, int tipo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Productos(int idProducto, String descripcion, double precio, int cantidad, int tipo) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNombre(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
