/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jovcubni
 */
public class ImagenesDAO {
    
    private final DatabaseConection databaseConnection;
    
    public ImagenesDAO (DatabaseConection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    public List<Imagenes> cargarImagenes() {
        List<Imagenes> imagenes = new ArrayList<>();

        String sql = "SELECT * FROM imagenes";

        try (Connection conn = databaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Imagenes imagen = new Imagenes();
                imagen.setID(rs.getInt("id"));
                imagen.setUrl(rs.getString("url"));
                imagenes.add(imagen);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de la Base de datos: " + e.getMessage());
        }

    return imagenes;
}
    
}
