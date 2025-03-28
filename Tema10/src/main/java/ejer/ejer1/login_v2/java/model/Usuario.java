package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author macarena
 *
 * Representa la tabla 'usuario' de la BD. Modelo de datos de la entidad Usuario
 * que será utiliza en las operaciones CRUD.
 *
 */
public class Usuario {

    private int idUser;         // columna id_user    
    private String login;       // columna login
    private String password;    // columna password
    private int blocked;        // columna blocked

    // Constructor vacío (necesario en JavaBeans)
    public Usuario() {
    }

    // Constructores con parámetros
    public Usuario(int idUser, String login, String password, int blocked) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.blocked = blocked;
    }

    public Usuario(String login, String password, int blocked) {        
        this.login = login;
        this.password = password;
        this.blocked = blocked;
    }
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    // Muestra el usuario a nivel de depuración
    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", login=" + login + ", password=" + password + ", blocked=" + blocked + '}';
    }
   
}
