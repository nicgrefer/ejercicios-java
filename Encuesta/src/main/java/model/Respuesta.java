/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jovcubni
 * 1 --> Seleccionado
 * 0 --> No seleccionado
 */
public class Respuesta {
    
    private int id_respuesta;
    private int yes;
    private int no;
    private int ns_nc;

    public int getId_respuesta() {
        return id_respuesta;
    }

    public int getYes() {
        return yes;
    }

    public int getNo() {
        return no;
    }

    public int getNs_nc() {
        return ns_nc;
    }


    public void setYes(int yes) {
        this.yes = yes;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNs_nc(int ns_nc) {
        this.ns_nc = ns_nc;
    }

    public Respuesta() {
    }

    
    public Respuesta(int yes, int no, int ns_nc) {
        this.yes = yes;
        this.no = no;
        this.ns_nc = ns_nc;
    }

    @Override
    public String toString() {
        return "Respuestas{" + "id_respuesta=" + id_respuesta + ", yes=" + yes + ", no=" + no + ", ns_nc=" + ns_nc + '}';
    }

    
    
            
}
