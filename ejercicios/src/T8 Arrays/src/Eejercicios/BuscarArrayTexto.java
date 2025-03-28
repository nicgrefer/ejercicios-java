/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Eejercicios;

import javax.swing.JOptionPane;

/**
 *Programa que almacene en un array una lista de palabras introducida por el usuario de tamaño del array sera determinado por el usuario (Usa JSpiner)
 * 
 *El programa permitira buscar el nº de palabras que hay en el array  que empiezan por un caracter que eliga el usuario
 * @author jovcubni
 */

public class BuscarArrayTexto extends javax.swing.JFrame {
private int TAM=0;
public String [] array;
    /**
     * Creates new form OrdenarArrayTexto
     */
    public BuscarArrayTexto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Busqueda en array");
        this.BotonCrear.requestFocus(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pregunta = new javax.swing.JLabel();
        SpinLongArray = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        BotonRellenar = new javax.swing.JButton();
        BotonMostrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pregunta.setText("Elige el tamaño del array (1-10)");

        SpinLongArray.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));

        BotonRellenar.setText("🖋Rellenar Array");
        BotonRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRellenarActionPerformed(evt);
            }
        });

        BotonMostrar.setText("👁Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        BotonBuscar.setText("🔎 Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonOrdenar.setText("✔ Ordenar");
        BotonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Pregunta)
                        .addGap(18, 18, 18)
                        .addComponent(SpinLongArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(BotonRellenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(BotonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BotonMostrar)
                        .addGap(94, 94, 94)
                        .addComponent(BotonOrdenar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta)
                    .addComponent(SpinLongArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRellenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMostrar)
                    .addComponent(BotonOrdenar))
                .addGap(18, 18, 18)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        // TODO add your handling code here:
        TAM = (int) this.SpinLongArray.getValue();
        //System.out.println(TAM);
        array= new String[TAM];
        JOptionPane.showMessageDialog(null, "Array creado correctamente","Con exito",1);


    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRellenarActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<TAM;i++){
            array[i]=JOptionPane.showInputDialog(null, i+" dato");
        }
    }//GEN-LAST:event_BotonRellenarActionPerformed

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_BotonMostrarActionPerformed

    public void mostrar(){
        for (int i=0; i<TAM;i++){
            System.out.println(array[i]);
            
        }
        JOptionPane.showMessageDialog(null, array);
    }
   
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        int sumaPalabreas = 0;
        char caracterEncontrado;
        char caracterReferencia;
        String caracter=JOptionPane.showInputDialog(null,"Introduce la letra que buscas (primer caracter de la frase)");
        
        if (caracter == null || caracter.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresaste ningún carácter.");
            return; // Salimos del programa si la entrada es inválida
        }
        
        caracterReferencia = caracter.charAt(0); // Tomamos el primer carácter ingresado
        
        for (int i=0;i<TAM;i++){
            caracterEncontrado = array[i].charAt(0);
            if (caracterEncontrado==caracterReferencia){
                sumaPalabreas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+ sumaPalabreas+" fraes que inicien con "+ caracterReferencia);
    }//GEN-LAST:event_BotonBuscarActionPerformed

   private void burbuja(String[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {  // Pasadas
        for (int j = 0; j < n - i - 1; j++) {  // Comparación entre parejas
            if (array[j].compareTo(array[j + 1]) > 0) { // Si la palabra actual es mayor que la siguiente
                // Intercambio
                String temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

    
    
    private void BotonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOrdenarActionPerformed
        // TODO add your handling code here:
    if (array == null || array.length == 0) {
        JOptionPane.showMessageDialog(null, "El array está vacío o no ha sido creado.");
        return;
    }
    
    burbuja(array); // Llamamos al método de ordenación
    JOptionPane.showMessageDialog(null, "Array ordenado correctamente.");

    // Mostramos el array ordenado en la consola
    System.out.println("Array ordenado");
    mostrar();


    }//GEN-LAST:event_BotonOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarArrayTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarArrayTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarArrayTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarArrayTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarArrayTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonOrdenar;
    private javax.swing.JButton BotonRellenar;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JSpinner SpinLongArray;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
