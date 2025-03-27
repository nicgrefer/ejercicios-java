/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.crud;

import java.util.Date;

/**
 *
 * @author macarena
 */
public class Tabla_A {
    
    private int a1;
    private String a2;
    private double a3;
    private java.util.Date a4;

    public Tabla_A() {
    }

    public Tabla_A(int a1, String a2, double a3, Date a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
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
        return String.valueOf(a1);
    }
    
  
    
}
