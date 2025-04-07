/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jovcubni
 */
public class DatabaseConection {
    
    private String url = "jdbc:mysql://localchost:3306/galeria";
    private String user = "root";
    private String code = "";
    private Connection conn;
    
    public Connection getConnection() throws SQLException{
        
        conn = DriverManager.getConnection(url, user, user);
        return conn;
    }
    
    
    public void closeConnection() throws SQLException{
        conn.close();
    }
    
}
