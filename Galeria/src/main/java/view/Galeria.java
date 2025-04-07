/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import models.DatabaseConection;
import models.Imagenes;
import models.ImagenesDAO;

/**
 *
 * @author jovcubni
 */
public class Galeria extends javax.swing.JFrame {

    /**
     * Creates new form Galeria
     *
     */
    
    public ImagenesDAO imagenesDAO;
    
    public Galeria() {
        initComponents();
        setFreim();
        DatabaseConection conn = new DatabaseConection(); 
        imagenesDAO = new ImagenesDAO(conn);

        cargarImagen();
    }
    
    public void setFreim(){
        this.setLocationRelativeTo(null);
        this.setTitle("Galeria de imagenes");
        this.jTextPane1.setContentType("text/html");
    }
    
    public void cargarImagen() {
    List<Imagenes> lista = imagenesDAO.cargarImagenes();

    if (lista != null && !lista.isEmpty()) {
        // Mostrar la primera imagen por ejemplo:
        Imagenes img = lista.get(0);
        String url = img.getUrl();

        // Mostrar imagen en el JTextPane (como HTML con imagen):
        jTextPane1.setContentType("text/html");
        jTextPane1.setText("<html><body><img src='" + url + "' width='300'/></body></html>");
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

        Spiner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Galeria = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Spiner.setLayout(new java.awt.GridLayout(0, 1, 10, 10));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Retardo (segundos)");
        Spiner.add(jLabel2);

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(2);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        Spiner.add(jSlider1);

        getContentPane().add(Spiner, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al mundo JAVA");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(Titulo, java.awt.BorderLayout.PAGE_START);

        Galeria.setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane2.setViewportView(jTextPane1);

        Galeria.add(jScrollPane2);

        getContentPane().add(Galeria, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        
        int sec = jSlider1.getValue();
        
        
        
    }//GEN-LAST:event_jSlider1StateChanged

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Galeria;
    private javax.swing.JPanel Spiner;
    private javax.swing.JPanel Titulo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
