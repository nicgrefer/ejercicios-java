/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author jovcubni
 */
public class Imagenes {
    
    private int ID;
    private String url;

    public int getID() {
        return ID;
    }

    public String getUrl() {
        return url;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Imagenes() {
    }

    public Imagenes(String url) {
        this.url = url;
    }

    public Imagenes(int ID, String url) {
        this.ID = ID;
        this.url = url;
    }

    @Override
    public String toString() {
        return url;
    }

    
    
    
}
