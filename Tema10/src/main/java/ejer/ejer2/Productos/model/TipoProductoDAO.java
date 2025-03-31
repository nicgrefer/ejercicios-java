/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer.ejer2.Productos.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jovcubni
 */
public class TipoProductoDAO {
   
    private final DatabaseConnection databaseConnection;

    public TipoProductoDAO (DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

// Select de los tipod de productos
    
    public List <TipoProducto> TipoDeProductos() throws SQLException{
    
        List<TipoProducto> tipoProductos = new ArrayList<>();
        String sql = "select * from tiposproducto";
        try(Connection conn = databaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql) ;
                ResultSet rs = ps.executeQuery()){
            
            TipoProducto tipoProducto = new TipoProducto();
            tipoProducto.setIdTipo(rs.getInt("idTipo"));
            tipoProducto.setTipo(rs.getString("tipo"));
            
            tipoProductos.add(tipoProducto);
            
        }catch (SQLException e ){
            e.printStackTrace();
        }
        return null;
}

    
}
