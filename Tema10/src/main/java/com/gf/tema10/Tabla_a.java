/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.tema10;

import java.util.Date;



/**
 * Esto espara hacer otra forma del delet.
 * Consiste en almacenar todos los elementos que ay en una lista de tipo 'tabla_a' y de esa forma 
 * no se repie el select.
 * En el bucle deonde recoge cada select y lo introduce en la tabla añadimos en un combo vox
 * las opciones de PK y cuando seleccione uno tiene que aparecer el resto de datos que le pertenece 
 * basandose en la lista 'tabla_a'
 * @author jovcubni
 */
public class Tabla_a {
    
    private int a1;
    private String a2;
    private double a3;
    private java.util.Date a4;

    public Tabla_a(int a1, String a2, double a3, Date a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public Tabla_a() {
    }

    public int getA1() {
        return a1;
    }
    public String getA2() {
        return a2;
    }
    public double getA3() {
        return a3;
    }
    public Date getA4() {
        return a4;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }
    public void setA2(String a2) {
        this.a2 = a2;
    }
    public void setA3(double a3) {
        this.a3 = a3;
    }
    public void setA4(Date a4) {
        this.a4 = a4;
    }

    @Override
    public String toString() {
        return  a1+" " ;
    }

       
    
    
    
}
