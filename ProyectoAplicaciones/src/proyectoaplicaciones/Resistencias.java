/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaplicaciones;

import java.awt.Color;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class Resistencias extends javax.swing.JFrame {

    Color Fondo = new Color(9,72,111);
    Color cafe = new Color (92,63,9);
    Color violeta = new Color (90,16,114);
    Color verde = new Color (21,98,8);
    Color dorado = new Color (205,180,68);
    Color plata = new Color (229,228,227);
    Color naranja = new Color(235,157,11);
    CalculoResistencia res = new CalculoResistencia();
    public Resistencias() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Fondo);//Color de Fondo
        this.labelBanda1.setOpaque(true);
        this.labelBanda1.setBackground(Color.white);
        this.labelBanda2.setOpaque(true);
        this.labelBanda2.setBackground(Color.white);
        this.labelMultiplicador.setOpaque(true);
        this.labelMultiplicador.setBackground(Color.white);
        this.labelTolerancia.setOpaque(true);
        this.labelTolerancia.setBackground(Color.white);
        
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelBanda1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBanda2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelMultiplicador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelTolerancia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxBanda1 = new javax.swing.JComboBox<>();
        jComboBoxBanda2 = new javax.swing.JComboBox<>();
        jComboBoxMultiplicador = new javax.swing.JComboBox<>();
        jComboBoxTolerancia = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelValorTolerancia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VALOR DE RESISTENCIA POR CODIGO DE COLORES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte1Resistencia.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte2Resistencia.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte3Resistencia.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte4Resistencia.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parte5Resistencia.png"))); // NOI18N

        jComboBoxBanda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banda No.1", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jComboBoxBanda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBanda1ActionPerformed(evt);
            }
        });

        jComboBoxBanda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banda No.2", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jComboBoxBanda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBanda2ActionPerformed(evt);
            }
        });

        jComboBoxMultiplicador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multiplicador", "Negro", "Café", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plata", " " }));
        jComboBoxMultiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMultiplicadorActionPerformed(evt);
            }
        });

        jComboBoxTolerancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tolerancia", "Dorado", "Plata", "Café", "Rojo" }));
        jComboBoxTolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxToleranciaActionPerformed(evt);
            }
        });

        jButton1.setText("GENERAR VALOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VALOR RESISTENCIA:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOLERANCIA           :");

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));

        labelValorTolerancia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValorTolerancia.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jComboBoxBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jComboBoxTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelValor, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(labelValorTolerancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(labelTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxMultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jComboBoxTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelValorTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBanda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBanda1ActionPerformed
        // TODO add your handling code here:
        if(jComboBoxBanda1.getSelectedIndex()==0)
            this.labelBanda1.setBackground(Color.white);
        if(jComboBoxBanda1.getSelectedIndex()==1)
            this.labelBanda1.setBackground(Color.black);
        if(jComboBoxBanda1.getSelectedIndex()==2)
            this.labelBanda1.setBackground(cafe);
        if(jComboBoxBanda1.getSelectedIndex()==3)
            this.labelBanda1.setBackground(Color.red);
        if(jComboBoxBanda1.getSelectedIndex()==4)
            this.labelBanda1.setBackground(naranja);
        if(jComboBoxBanda1.getSelectedIndex()==5)
            this.labelBanda1.setBackground(Color.yellow);
        if(jComboBoxBanda1.getSelectedIndex()==6)
            this.labelBanda1.setBackground(verde);
        if(jComboBoxBanda1.getSelectedIndex()==7)
            this.labelBanda1.setBackground(Color.blue);
        if(jComboBoxBanda1.getSelectedIndex()==8)
            this.labelBanda1.setBackground(violeta);
        if(jComboBoxBanda1.getSelectedIndex()==9)
            this.labelBanda1.setBackground(Color.gray);
        if(jComboBoxBanda1.getSelectedIndex()==10)
            this.labelBanda1.setBackground(Color.white);
        
    }//GEN-LAST:event_jComboBoxBanda1ActionPerformed

    private void jComboBoxBanda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBanda2ActionPerformed
        // TODO add your handling code here:
         if(jComboBoxBanda2.getSelectedIndex()==0)
            this.labelBanda2.setBackground(Color.white);
        if(jComboBoxBanda2.getSelectedIndex()==1)
            this.labelBanda2.setBackground(Color.black);
        if(jComboBoxBanda2.getSelectedIndex()==2)
            this.labelBanda2.setBackground(cafe);
        if(jComboBoxBanda2.getSelectedIndex()==3)
            this.labelBanda2.setBackground(Color.red);
        if(jComboBoxBanda2.getSelectedIndex()==4)
            this.labelBanda2.setBackground(naranja);
        if(jComboBoxBanda2.getSelectedIndex()==5)
            this.labelBanda2.setBackground(Color.yellow);
        if(jComboBoxBanda2.getSelectedIndex()==6)
            this.labelBanda2.setBackground(verde);
        if(jComboBoxBanda2.getSelectedIndex()==7)
            this.labelBanda2.setBackground(Color.blue);
        if(jComboBoxBanda2.getSelectedIndex()==8)
            this.labelBanda2.setBackground(violeta);
        if(jComboBoxBanda2.getSelectedIndex()==9)
            this.labelBanda2.setBackground(Color.gray);
        if(jComboBoxBanda2.getSelectedIndex()==10)
            this.labelBanda2.setBackground(Color.white);
    }//GEN-LAST:event_jComboBoxBanda2ActionPerformed

    private void jComboBoxMultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMultiplicadorActionPerformed
        // TODO add your handling code here:
         if(jComboBoxMultiplicador.getSelectedIndex()==0)
            this.labelMultiplicador.setBackground(Color.white);
        if(jComboBoxMultiplicador.getSelectedIndex()==1)
            this.labelMultiplicador.setBackground(Color.black);
        if(jComboBoxMultiplicador.getSelectedIndex()==2)
            this.labelMultiplicador.setBackground(cafe);
        if(jComboBoxMultiplicador.getSelectedIndex()==3)
            this.labelMultiplicador.setBackground(Color.red);
        if(jComboBoxMultiplicador.getSelectedIndex()==4)
            this.labelMultiplicador.setBackground(naranja);
        if(jComboBoxMultiplicador.getSelectedIndex()==5)
            this.labelMultiplicador.setBackground(Color.yellow);
        if(jComboBoxMultiplicador.getSelectedIndex()==6)
            this.labelMultiplicador.setBackground(verde);
        if(jComboBoxMultiplicador.getSelectedIndex()==7)
            this.labelMultiplicador.setBackground(Color.blue);
        if(jComboBoxMultiplicador.getSelectedIndex()==8)
            this.labelMultiplicador.setBackground(violeta);
        if(jComboBoxMultiplicador.getSelectedIndex()==9)
            this.labelMultiplicador.setBackground(Color.gray);
        if(jComboBoxMultiplicador.getSelectedIndex()==10)
            this.labelMultiplicador.setBackground(Color.white);
        if(jComboBoxMultiplicador.getSelectedIndex()==11)
            this.labelMultiplicador.setBackground(dorado);
        if(jComboBoxMultiplicador.getSelectedIndex()==12)
            this.labelMultiplicador.setBackground(plata);
    }//GEN-LAST:event_jComboBoxMultiplicadorActionPerformed

    private void jComboBoxToleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxToleranciaActionPerformed
        // TODO add your handling code here:
        if(jComboBoxTolerancia.getSelectedIndex()==0)
            this.labelTolerancia.setBackground(Color.white);
        if(jComboBoxTolerancia.getSelectedIndex()==1)
            this.labelTolerancia.setBackground(dorado);
        if(jComboBoxTolerancia.getSelectedIndex()==2)
            this.labelTolerancia.setBackground(plata);
        if(jComboBoxTolerancia.getSelectedIndex()==3)
            this.labelTolerancia.setBackground(cafe);
        if(jComboBoxTolerancia.getSelectedIndex()==4)
            this.labelTolerancia.setBackground(Color.red);
        else
            this.labelTolerancia.setBackground(Color.white);
    }//GEN-LAST:event_jComboBoxToleranciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jComboBoxBanda1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Ingrese un color en la Banda No.1");
            this.labelValor.setText("");
            this.labelTolerancia.setText("");
        }
        if(jComboBoxBanda2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Ingrese un color en la Banda No.2");
            this.labelValor.setText("");
            this.labelTolerancia.setText("");
        }
        if(jComboBoxMultiplicador.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Ingrese un color en el Multiplicador");
            this.labelValor.setText("");
            this.labelTolerancia.setText("");
        }
        if(jComboBoxTolerancia.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Ingrese un color en la Tolerancia");
            this.labelValor.setText("");
            this.labelTolerancia.setText("");
        }
        else{
            double banda1 = jComboBoxBanda1.getSelectedIndex()-1;
            double banda2 = jComboBoxBanda2.getSelectedIndex()-1;
            double Multiplicador = pow(10,jComboBoxMultiplicador.getSelectedIndex()-1);
            double Tolerancia = jComboBoxTolerancia.getSelectedIndex();
            double valorResistencia = res.calculoValorResistencia(banda1, banda2, Multiplicador);
            String valor = Double.toString(valorResistencia);
            String tolerancia = Double.toString(res.calculoTolerancia(Tolerancia));
            if(valorResistencia<1000){
            labelValor.setText(""+valor+"Ω");
            }
            if(valorResistencia>=1000000000){
                valorResistencia/=1000000000.0;
                valor = Double.toString(valorResistencia);
                labelValor.setText(""+valor+"GΩ"); 
            }
            if(valorResistencia>=1000 && valorResistencia<1000000){
                valorResistencia/=1000.0;
                valor = Double.toString(valorResistencia);
                labelValor.setText(""+valor+"kΩ"); 
            }
            if(valorResistencia>=1000000){
                valorResistencia/=1000000.0;
                valor = Double.toString(valorResistencia);
                labelValor.setText(""+valor+"MΩ"); 
            }
            
            labelValorTolerancia.setText("±"+tolerancia+"%");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Resistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxBanda1;
    private javax.swing.JComboBox<String> jComboBoxBanda2;
    private javax.swing.JComboBox<String> jComboBoxMultiplicador;
    private javax.swing.JComboBox<String> jComboBoxTolerancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelBanda1;
    private javax.swing.JLabel labelBanda2;
    private javax.swing.JLabel labelMultiplicador;
    private javax.swing.JLabel labelTolerancia;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelValorTolerancia;
    // End of variables declaration//GEN-END:variables
}
