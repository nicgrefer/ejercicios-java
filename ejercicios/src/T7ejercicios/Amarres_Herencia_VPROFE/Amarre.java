/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.amarres;

/**
 *
 * @author profesor
 */
public class Amarre {
    
    private String posicion;
    private Barco barco;

    public Amarre(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }    
    
    public void asignarBarco(Barco b){
        this.barco=b;
    }

    @Override
    public String toString() {
        String msg=(this.barco==null)?"Libre":this.barco.toString();                
        return "Posicion=" + posicion + ", " + msg;
    }        
    
}
