/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioAgenda;

/**
 *
 * @author jovcubni
 */
public class Contacto {
    private int Id;
    private String nombre;
    private int telefono;
    protected static int aux = 1;
    
    // Constructor sin parámetros
    public Contacto() {
        this.Id = aux++;
    }

    // Getter y setter
    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Constructor con parámetros
    public Contacto(int Id, String nombre, int telefono) {
        this.Id = Id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // To string
    @Override
    public String toString() {
        return "Contacto con Id=" + Id + ", nombre=" + nombre + " y telefono=" + telefono + ' ';
    }
}
    