/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jovcubni
 */

    public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/encuestas";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static final int UMBRAL = 3;
    private Connection conn;

    // Obtener conexión
    public Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conn;
    }

    // Cerrar conexión
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Probar conexión
    public boolean testConnection() {
        try (Connection testConn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}


