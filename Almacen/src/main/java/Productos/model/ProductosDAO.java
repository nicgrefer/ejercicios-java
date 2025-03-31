/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos.model;

import com.mysql.cj.xdevapi.Result;

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
public class ProductosDAO {

    private final DatabaseConnection databaseConnection;

    public ProductosDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    // Select de los productos
    public List <Productos> getProductos() throws SQLException{
         List<Productos> productos = new ArrayList<>();
         String sql = "select * from productos ";
          try (Connection conn = databaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
              Productos producto = new Productos();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setDescripcion(rs.getString("descripcion"));
              producto.setPrecio(rs.getInt("precio"));
              producto.setCantidad(rs.getInt("cantidad"));
              producto.setTipo(rs.getInt("tipo"));
              
              productos.add(producto);
              
          }catch (SQLException e){
              e.printStackTrace();
          }
   
         return null;
    }
 
    
}
