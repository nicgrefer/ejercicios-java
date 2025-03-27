/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.gf.crud;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author macarena
 */
public class GUIBorrarDatos extends javax.swing.JDialog {

    private EjemploCRUD guiPrincipal;
    private DefaultComboBoxModel<Tabla_A> modeloCombo;

    public GUIBorrarDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        guiPrincipal = (EjemploCRUD) parent;
        setFrame();
        llenarCombo();
    }

    private void setFrame() {
        this.modeloCombo = new DefaultComboBoxModel<>();
        this.jComboBox1.setModel(modeloCombo);
        this.setTitle("Borrado de datos en la BD " + EjemploCRUD.bd);
        this.jTextField1.setEditable(false);
        this.jTextField2.setEditable(false);
        this.jTextField3.setEditable(false);
        this.jTextField1.setBackground(Color.LIGHT_GRAY);
        this.jTextField2.setBackground(Color.LIGHT_GRAY);
        this.jTextField3.setBackground(Color.LIGHT_GRAY);
        this.jTextField1.setFocusable(false);
        this.jTextField2.setFocusable(false);
        this.jTextField3.setFocusable(false);
        this.setLocationRelativeTo(guiPrincipal);
    }

    private void llenarCombo() {
        Connection conn = null;
        try {
            //1.abrir conexion
            conn = guiPrincipal.abrirConexion();
            //2. ejecutar consulta: INSERT
            String sql = "select * from tabla_a";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //creo un objeto Tabla_A con los datos de la fila
                int a1 = rs.getInt("a1");
                String a2 = rs.getString("a2");
                double a3 = rs.getDouble("a3");
                Date a4 = rs.getDate("a4");

                Tabla_A objA = new Tabla_A(a1, a2, a3, a4);

                //almaceno el objA en el combo
                modeloCombo.addElement(objA);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de BD",
                    "Conectar con BD", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        } finally {
            //3. cerrar conexion
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al cerrar BD",
                        "Error BD", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("PK");

        jLabel2.setText("Selecciona el registro a eliminar:");

        jLabel3.setText("Columna A2:");

        jLabel4.setText("Columna A3:");

        jLabel5.setText("Columna A4:");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAceptar)
                            .addComponent(jButtonCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        //cojo el objeto seleccionado
        Tabla_A objeto = (Tabla_A) this.jComboBox1.getSelectedItem();
        //y lo muestro en los textField
        this.jTextField1.setText(objeto.getA2());
        this.jTextField2.setText(String.valueOf(objeto.getA3()));
        this.jTextField3.setText(String.valueOf(objeto.getA4()));
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        //borramos la fila correspondiente al objeto seleccionado en la BD
        String mensajeConfir = "¿Estás seguro de que quieres eliminar la fila?";
        int respuesta = JOptionPane.showConfirmDialog(this, mensajeConfir, "Borrado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            borrarFila((Tabla_A) this.jComboBox1.getSelectedItem());
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void borrarFila(Tabla_A obj) {
        Connection conn = null;
        try {
            //1.abrir conexion
            conn = guiPrincipal.abrirConexion();
            //2. ejecutar consulta: DELETE
            String sql = "delete from tabla_a where a1=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, obj.getA1());
            ////////////////////////
            //comprobamos operación
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Fila eliminada",
                        "Borrar", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar de la BD",
                        "Borrar", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de BD",
                    "Borrar", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        } finally {
            //3. cerrar conexion
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al cerrar BD",
                        "Error BD", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
