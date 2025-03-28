package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author macarena
 *
 * Realiza las operaciones CRUD en la base de datos para la entidad Usuario. 
 * Usa la clase DatabaseConnection para gestionar la conexión MySQL a la BD 'usuarios'.
 *
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private final DatabaseConnection databaseConnection;   

    public UsuarioDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Operación INSERT de un nuevo usuario
    public boolean createUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (login, password, blocked) VALUES (?, ?, ?)";
        try (Connection conn = databaseConnection.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getBlocked());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // SELECT de todos los usuarios
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Connection conn = databaseConnection.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id_user"),
                        rs.getString("login"),
                        rs.getString("password"),
                        rs.getInt("blocked")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // SELECT de un usuario por login
    public Usuario getUsuarioByLogin(String login) {
        String sql = "SELECT * FROM usuario where login=?";
        try (Connection conn = databaseConnection.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, login);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getInt("id_user"),
                            rs.getString("login"),
                            rs.getString("password"),
                            rs.getInt("blocked")
                    );
                }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    // Operación UPDATE de un usuario para bloquearlo
    public boolean bloquearUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET blocked = ? WHERE id_user = ?";
        try (Connection conn = databaseConnection.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, usuario.getBlocked());
            ps.setInt(2, usuario.getIdUser());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
