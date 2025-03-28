/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.DatabaseConnection;
import view.LoginView;

/**
 *
 * @author macarena
 * 
 * Punto de entrada de la aplicación. 
 * Inicializa conexión con BD y las vistas para poner en marcha la aplicación.
 */

public class App {
    public static void main(String[] args) {
        // Inicializamos la conexión a la base de datos
        DatabaseConnection databaseConnection = new DatabaseConnection();
        // Creamos la primera vista de la aplicación
        LoginView loginView = new LoginView(databaseConnection);
        // Mostramos la ventana de inicio de sesión
        loginView.setVisible(true);
    }
}

