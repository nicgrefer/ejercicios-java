package Productos.model;

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

    public TipoProductoDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Select de los tipos de productos
    public List<TipoProducto> getAllTiposProducto() throws SQLException {
        List<TipoProducto> tipoProductos = new ArrayList<>();
        String sql = "SELECT * FROM tiposproducto";
        
        try (Connection conn = databaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) { // Itera sobre todas las filas del ResultSet
                TipoProducto tipoProducto = new TipoProducto();
                tipoProducto.setIdTipo(rs.getInt("idTipo"));
                tipoProducto.setTipo(rs.getString("tipo"));
                
                tipoProductos.add(tipoProducto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Relanza la excepción para que el llamador pueda manejarla
        }
        
        return tipoProductos; // Devuelve la lista de TipoProducto
    }
}