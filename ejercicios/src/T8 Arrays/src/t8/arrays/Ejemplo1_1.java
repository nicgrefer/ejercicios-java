/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package t8.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author sandr
 */
public class Ejemplo1_1 extends javax.swing.JFrame {

    private int[] alturas; // asi es como se declara un array para, en este caso, almacenar alturas.
    
    /**
     * Creates new form Ejemplo1
     */
    public Ejemplo1_1() {
        initComponents();
        
        this.setTitle("Primer ejemplo de arrays");
        this.setLocationRelativeTo(null);
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
        textFieldNumElementos = new javax.swing.JTextField();
        BotonCrearArray = new javax.swing.JButton();
        BotonAlturaMedia = new javax.swing.JButton();
        BotonMinMax = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nº de elementos:");

        BotonCrearArray.setText("Crear array de alturas");
        BotonCrearArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearArrayActionPerformed(evt);
            }
        });

        BotonAlturaMedia.setText("Altura media");
        BotonAlturaMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAlturaMediaActionPerformed(evt);
            }
        });

        BotonMinMax.setText("Altura min/max");
        BotonMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMinMaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNumElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonCrearArray))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAlturaMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonMinMax)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldNumElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearArray))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAlturaMedia)
                    .addComponent(BotonMinMax))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearArrayActionPerformed
        // creamos el array de alturas
        // creamos el array de alturas
        if(this.textFieldNumElementos.getText().isEmpty()){
            System.out.println("Debes de proporcionar un tamaño para el Array.");
            return;
        }
            //Ha metido algo
            //Hay que comprobar si es valido
            //-> numerico y positivo

        try{
            int tamanio=Integer.parseInt( this.textFieldNumElementos.getText());
            if(tamanio <=0){
                System.out.println("Error. El tamanio debe de ser positivo.");
                return;
            }
            crearArray(tamanio);
        }catch(NumberFormatException ex) {
            System.out.println("Error. Debes de introducir un valor numerico");
        }
    }//GEN-LAST:event_BotonCrearArrayActionPerformed

    public void crearArray (int tamanio) {

        alturas= new int[tamanio]; //llamamos al array, como se de un objeto se tratase
            System.out.println("Array creado de tamanio "+alturas.length);
    //        mostrarArray();
    //        Arrays.fill(alturas, -1);
    //        mostrarArray();

            rellenarArray();
            mostrarArray();
    }
    
    private void BotonAlturaMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAlturaMediaActionPerformed
        // TODO add your handling code here:
        if(alturas==null){
            System.out.println("Primero debes de crear un array.");
            return;
        }
        
        int total=0; //acumula las alturas
        int contador=0; //contabiliza las alturas
        for(int i=0; i<alturas.length; i++){
            if(alturas[i] !=0){
                contador++;
                total+= alturas.length;
            }
        }
        double media=(double)total/contador;
        System.out.println("La media es: "+media);
    }//GEN-LAST:event_BotonAlturaMediaActionPerformed

    private void BotonMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMinMaxActionPerformed
        // TODO add your handling code here:
        
        if(alturas==null){
            System.out.println("Primero debes de crear un array.");
            return;
        }
        
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int actual=alturas.length;
        for (int i =0 ; i<alturas.length ; i++){
            if (alturas[i] != 0){
                if (alturas [i]>min){
                    min = alturas[i];
                }
                if (alturas [i]<max){
                    max = alturas[i];
                }
            }
        
        }
        System.out.println("Altura minima: "+ min);
        System.out.println("Altura maxima: "+ max);
    }//GEN-LAST:event_BotonMinMaxActionPerformed

       

    //Muestra el contenido del Array 
    private void mostrarArray(){
        for(int i=0; i<alturas.length; i++){
            System.out.println("Posicion " +i+ ":" +alturas[i]);
        }
    }
    
    //Llena el array con alturas entre 10 y 300.
    private void rellenarArray(){
        Random r = new Random();
        for(int i=0; i<alturas.length; i++){
            alturas[i]=r.nextInt(10,301);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Ejemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlturaMedia;
    private javax.swing.JButton BotonCrearArray;
    private javax.swing.JButton BotonMinMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textFieldNumElementos;
    // End of variables declaration//GEN-END:variables
}
