/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaplicaciones;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ordenamiento extends javax.swing.JFrame {
    Color Fondo = new Color(235,157,11);
    /**
     * Creates new form ordenamiento
     */
    public ordenamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonbuscar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numeroabuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableMatriz1 = new javax.swing.JTable();
        botonOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonbuscar1.setText("Buscar");
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero a buscar:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORDENAMIENTO Y BUSQUEDA DE NUMEROS");

        numeroabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroabuscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de Números:");

        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        tableMatriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableMatriz1);

        botonOrdenar.setText("Ordenar");
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Ingresada"},
                {null, "Ascendente"},
                {null, "Descendente"}
            },
            new String [] {
                "Posicion", "Lista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonOrdenar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(numeroabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(botonOrdenar)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar1))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
        // TODO add your handling code here:
        if(numeroabuscar.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Ingrese una cantidad de Numeros");
        else{
        int Cant =Integer.parseInt(txtN.getText());
        int num=tableMatriz1.getColumnCount();
        int num2=tableMatriz1.getRowCount();
        String [] VectorOrdenar= new String [Cant];
        int [] VectorOrdenarInt = new int [Cant];
        int cont=0;
        String [] VectorOrdenarString= new String [Cant];
        int nume =Integer.parseInt(numeroabuscar.getText());
        
         for(int i=0;i<num;i++){
            VectorOrdenar[i]=(String)tableMatriz1.getValueAt(0, i);
         }
          for(int j=0;j<Cant;j++){
            VectorOrdenarInt[j]=Integer.parseInt(VectorOrdenar[j]);
            if (VectorOrdenarInt[j]==nume)
            {
               
               jTable1.setValueAt(j+1, 0, 0);
                cont++;
            }
        }
          //
        for(int i=0;i<num;i++){
            VectorOrdenar[i]=(String)tableMatriz1.getValueAt(1, i);
         }
          for(int j=0;j<Cant;j++){
            VectorOrdenarInt[j]=Integer.parseInt(VectorOrdenar[j]);
            if (VectorOrdenarInt[j]==nume)
            {
               
               jTable1.setValueAt(j+1, 1, 0);
                cont++;
            }
        }    
        //
        for(int i=0;i<num;i++){
            VectorOrdenar[i]=(String)tableMatriz1.getValueAt(2, i);
         }
          for(int j=0;j<Cant;j++){
            VectorOrdenarInt[j]=Integer.parseInt(VectorOrdenar[j]);
            if (VectorOrdenarInt[j]==nume)
            {
               
               jTable1.setValueAt(j+1, 2, 0);
                cont++;
            }
        }//ya los busca
    }//GEN-LAST:event_botonbuscar1ActionPerformed
    }
    private void numeroabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroabuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroabuscarActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
        if(txtN.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese una cantidad de Numeros");
        }
        else{
        int n = Integer.parseInt(txtN.getText());
        int[][] matriz = new int[3][n];
        tableMatriz(matriz, n);
        botonIngresar.setEnabled(false);//False
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarActionPerformed
        if(txtN.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese una cantidad de Numeros");
        }
        else{
        int Cant =Integer.parseInt(txtN.getText());
        String [] VectorOrdenar= new String [Cant];
        int [] VectorOrdenarInt = new int [Cant];
        String [] VectorOrdenarString= new String [Cant];
        int num=tableMatriz1.getColumnCount();
        for(int i=0;i<num;i++)
            VectorOrdenar[i]=(String)tableMatriz1.getValueAt(0, i);
        for(int j=0;j<Cant;j++)
            VectorOrdenarInt[j]=Integer.parseInt(VectorOrdenar[j]);
        int menor;
           //ORDENAR DE MENOR A MAYOR
    for(int i = 0; i < num; i++){
        for (int j = i+1; j < num; j++) {
            if(VectorOrdenarInt[i]>VectorOrdenarInt[j]){
               int aux=VectorOrdenarInt[i];
               VectorOrdenarInt[i]=VectorOrdenarInt[j];
               VectorOrdenarInt[j]=aux;
            }
        }
    }
    for (int i = 0; i < num; i++) {
        VectorOrdenarString[i]= ""+VectorOrdenarInt[i];
    }
    System.out.println(Arrays.toString(VectorOrdenarInt));
    DefaultTableModel model= (DefaultTableModel)tableMatriz1.getModel() ;
    model.addRow(VectorOrdenarString);
    for(int i=0;i<num;i++){
            VectorOrdenar[i]=(String)tableMatriz1.getValueAt(0, i);
        }
        for(int i=0;i<num;i++){
            VectorOrdenarInt[i]=Integer.parseInt(VectorOrdenar[i]);
        }

    for(int i = 0; i < num; i++){
        for (int j = i+1; j < num; j++) {
            if(VectorOrdenarInt[i]<VectorOrdenarInt[j]){
               int aux=VectorOrdenarInt[i];
               VectorOrdenarInt[i]=VectorOrdenarInt[j];
               VectorOrdenarInt[j]=aux;
            }
        }
    }
    
    for (int i = 0; i < num; i++) {
        VectorOrdenarString[i]= ""+VectorOrdenarInt[i];
    }
    System.out.println(Arrays.toString(VectorOrdenarInt));
    model.addRow(VectorOrdenarString);
    botonOrdenar.setEnabled(false);
                   
    }//GEN-LAST:event_botonOrdenarActionPerformed
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
            java.util.logging.Logger.getLogger(ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonOrdenar;
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numeroabuscar;
    private javax.swing.JTable tableMatriz1;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables

    private void tableMatriz(int[][] matriz, int n) {
        DefaultTableModel model = (DefaultTableModel) tableMatriz1.getModel();
        model.setColumnCount(n);//Cantidad de Columnas    }
        model.setRowCount(1);

}
}


