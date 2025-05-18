/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica3.modelo;

/**
 *
 * @author nicol
 */
public class Employees {
 
    // Creamos componentes     
    public int id;
    public String nombre;
    public String apellido;
    public int depart;

    //Getter
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDepart() {
        return depart;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDepart(int depart) {
        this.depart = depart;
    }
 
    //Constructor
    public Employees() {
    }

    public Employees(int id, String nombre, String apellido, int depart) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.depart = depart;
    }

    @Override
    public String toString() {
        return  id + ", "+ nombre + ", " + apellido + ", "+ depart + '.';
    }
    
    
     
}
