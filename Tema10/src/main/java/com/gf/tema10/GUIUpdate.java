/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.gf.tema10;

import static com.gf.tema10.EjemploCRUD.conn;
import static com.gf.tema10.EjemploCRUD.passwd;
import static com.gf.tema10.EjemploCRUD.urlBD;
import static com.gf.tema10.EjemploCRUD.user;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class GUIUpdate extends javax.swing.JDialog {

    /**
     * Creates new form GUIUpdate
     */
    
    private String valorPK;
     private EjemploCRUD guiPrincipal;
    
    public GUIUpdate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        guiPrincipal =(EjemploCRUD) parent;
        setFrame();

    }

    public void setFrame(){
        this.setTitle("Actualizacion de datos en la BD: " + EjemploCRUD.bd);
        this.setLocationRelativeTo(guiPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PK_a_editar = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFielda2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFielda3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFielda4 = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Inserte la PK del ememento a modificar");

        PK_a_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PK_a_editarActionPerformed(evt);
            }
        });

        aceptar.setText("ok");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Antes de modificar: ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Columna a2:");

        jLabel4.setText("Columna a3:");

        jLabel5.setText("Columna a4:");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jTextFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addGap(20, 90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonAceptar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButtonCancelar)
                    .addComponent(jTextFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PK_a_editar)
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PK_a_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // Hacemos la inserccion en la base de datos
        ActualizarFila();
        this.dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void ActualizarFila() {
    java.sql.Connection conn = null;
    PreparedStatement ps = null;

    try {
        // 1. Abrir la conexión
        conn = guiPrincipal.abrirConexion();

        // 2. Crear la consulta SQL
        String sql = "UPDATE tabla_a SET a2 = ?, a3 = ?, a4 = ? WHERE a1 = ?";
        ps = conn.prepareStatement(sql);

        // 3. Obtener valores de los campos de texto
        String valorA2 = jTextFielda2.getText();
        

        // Validación y conversión del campo numérico (a3)
        double valorA3;
        try {
            valorA3 = Double.parseDouble(jTextFielda3.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El campo a3 debe ser un número.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación y conversión del campo de fecha (a4)
        String fechaString = jTextFielda4.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        java.sql.Date fechaSQL = null;

        try {
            java.util.Date fechaUtil = sdf.parse(fechaString);
            fechaSQL = new java.sql.Date(fechaUtil.getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error en el formato de la fecha. Use formato dd/MM/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 4. Asignar valores al PreparedStatement
        ps.setString(1, valorA2);
        ps.setDouble(2, valorA3);
        ps.setDate(3, fechaSQL);
        ps.setString(4, valorPK); // Se usa la clave primaria

        // 5. Ejecutar la consulta
        int filasActualizadas = ps.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un registro con esa PK.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage(), "Conexión BD", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar recursos
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        valorPK = PK_a_editar.getText();
        if (valorPK.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Debe ingresar una clave primaria.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pk = Integer.parseInt(valorPK);
        // Select antes de editar
        try {
            //coonectamos con la tabla
            conn=DriverManager.getConnection(urlBD,user,passwd);
            //ejecutamos consulta select 
            String sql = "select * from tabla_a where a1=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                int a1= rs.getInt("a1");
                String a2=rs.getString("a2");
                double a3= rs.getDouble("a3");
                Date a4 = rs.getDate("a4");
                jLabel2.setText("Antes de editar: "+a1+", "+ a2+", "+a3+" ,"+a4);
            }else {
                jLabel2.setText("No se encontro con esa PK");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error con la conexion con la BD", "Desconexion BD", JOptionPane.ERROR_MESSAGE);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Error al cerrar BD","Desconexion BD", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void PK_a_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PK_a_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PK_a_editarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIUpdate dialog = new GUIUpdate(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PK_a_editar;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    javax.swing.JTextField jTextFielda2;
    private javax.swing.JTextField jTextFielda3;
    private javax.swing.JTextField jTextFielda4;
    // End of variables declaration//GEN-END:variables
}
