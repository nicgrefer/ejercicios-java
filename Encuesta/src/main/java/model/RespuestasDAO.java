/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jovcubni
 */
public class RespuestasDAO {
    
    private final DatabaseConnection databaseConnection;   

    public RespuestasDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    
    //Metodos
    
    // -> Insercion de las respuesta 
    
    public boolean insertRespuestas (Respuesta respuesta) {
        String sql = "INSERT INTO respuesta (y, n, ns_nc) VALUES (?, ?, ?)";
        try (java.sql.Connection conn = databaseConnection.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, respuesta.getYes());
                ps.setInt(2, respuesta.getNo());
                ps.setInt(3, respuesta.getNs_nc());
                return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
    
    // -> crear select 
     public List<Respuesta> getRespuestas() {
        List<Respuesta> respuesta = new ArrayList<>();
        String sql = "SELECT * FROM respuesta";
        try (java.sql.Connection conn =  databaseConnection.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Respuesta usuario = new Respuesta();
                usuario.setYes(rs.getInt("y"));
                usuario.setNo(rs.getInt("n"));
                usuario.setNs_nc(rs.getInt("ns_nc"));                             

                respuesta.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respuesta;
    }
    
     ////////////////////////////////////////////////////////////
     //Añadir select count (*) from resp..                    //
     //select count (*) from res.. where y = 1 -> total_votos//
     /////////////////////////////////////////////////////////
     
     
    
    
     public int contarTodas() throws SQLException{
         
         String sqlNRespuestas =  "SELECT COUNT(*) FROM respuesta";
         int nr = 0;
         try (java.sql.Connection conn = databaseConnection.getConnection();
                PreparedStatement ps1 = conn.prepareStatement(sqlNRespuestas);
                ResultSet nRespuestas = ps1.executeQuery()){
             
             if (nRespuestas.next()) {
                    nr = nRespuestas.getInt(1);
                }
             
         }
         
         return nr;
     }

    public int contarYes() throws SQLException {
          String sqlGetYes = "select count(*) from respuesta where y = 1";
         int ny = 0;
         try (java.sql.Connection conn = databaseConnection.getConnection();
                PreparedStatement ps1 = conn.prepareStatement(sqlGetYes);
                ResultSet nRespuestas = ps1.executeQuery()){
             
             if (nRespuestas.next()) {
                    ny = nRespuestas.getInt(1);
                }
             
         }
         
         return ny;
    }

    public int contarNo() throws SQLException {
        String sqlGetNot = "select count(*) from respuesta where n = 1";
         int nn = 0;
         try (java.sql.Connection conn = databaseConnection.getConnection();
                PreparedStatement ps1 = conn.prepareStatement(sqlGetNot);
                ResultSet nRespuestas = ps1.executeQuery()){
             
             if (nRespuestas.next()) {
                    nn = nRespuestas.getInt(1);
                }
             
         }
         
         return nn;
    }

    public int contarNsNc() throws SQLException {
         String sqlGetNSNC = "select count(*) from respuesta where ns_nc = 1";
         int nsc = 0;
         try (java.sql.Connection conn = databaseConnection.getConnection();
                PreparedStatement ps1 = conn.prepareStatement(sqlGetNSNC);
                ResultSet nRespuestas = ps1.executeQuery()){
             
             if (nRespuestas.next()) {
                    nsc = nRespuestas.getInt(1);
                }
             
         }
         
         return nsc;
    }
     
}
