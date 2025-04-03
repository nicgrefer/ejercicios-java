/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.DatabaseConnection;
import model.RespuestasDAO;
import views.VotarView;

public class App {
    public static void main(String[] args) {
        // Inicializamos la conexión a la base de datos
        DatabaseConnection databaseConnection = new DatabaseConnection();
        RespuestasDAO respuestasDAO = new RespuestasDAO(databaseConnection);
        
        // Creamos la primera vista de la aplicación
        VotarView votarView = new VotarView(databaseConnection, respuestasDAO);
        
        // Mostramos la ventana para poder votar
        votarView.setVisible(true);
    }
}
