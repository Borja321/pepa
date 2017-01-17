/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Borja
 */
public class cliente extends javax.swing.JFrame {

    static public ResultSet r;
    int var;
    public cliente() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/entornodedesarrollo";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from clientes";
        r = s.executeQuery(query);
        r.first();
        NIF.setText(r.getString("NIF"));
        NOMBRE.setText(r.getString("NOMBRE"));
        DIRECCION.setText(r.getString("DIRECCION"));
        POBLACION.setText(r.getString("POBLACION"));
        PROVINCIA.setText(r.getString("PROVINCIA"));
        TELEFONO.setText(r.getString("TELEFONO"));
        CONFIRMAR.setVisible(false);
        CANCELAR.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NIF = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        DIRECCION = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TELEFONO = new javax.swing.JTextField();
        POBLACION = new javax.swing.JTextField();
        PROVINCIA = new javax.swing.JTextField();
        PRIMERA = new javax.swing.JButton();
        ANTERIOR = new javax.swing.JButton();
        SIGUIENTE = new javax.swing.JButton();
        ULTIMA = new javax.swing.JButton();
        NUEVA = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        CONFIRMAR = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIF");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("DIRECCIÓN");

        NIF.setEditable(false);
        NIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIFActionPerformed(evt);
            }
        });

        NOMBRE.setEditable(false);

        DIRECCION.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CLIENTES");

        jLabel5.setText("POBLACIÓN");

        jLabel6.setText("PROVINCIA");

        jLabel7.setText("TELEFONO");

        TELEFONO.setEditable(false);

        POBLACION.setEditable(false);

        PROVINCIA.setEditable(false);

        PRIMERA.setText("PRIMERA");
        PRIMERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIMERAActionPerformed(evt);
            }
        });

        ANTERIOR.setText("ANTERIOR");
        ANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANTERIORActionPerformed(evt);
            }
        });

        SIGUIENTE.setText("SIGUIENTE");
        SIGUIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGUIENTEActionPerformed(evt);
            }
        });

        ULTIMA.setText("ULTIMA");
        ULTIMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULTIMAActionPerformed(evt);
            }
        });

        NUEVA.setText("NUEVA");
        NUEVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVAActionPerformed(evt);
            }
        });

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        CONFIRMAR.setText("CONFIRMAR");
        CONFIRMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMARActionPerformed(evt);
            }
        });

        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CONFIRMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ANTERIOR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NUEVA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PRIMERA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(ULTIMA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(POBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(POBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRIMERA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ULTIMA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANTERIOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIGUIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUEVA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BORRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CONFIRMAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIFActionPerformed

    private void PRIMERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIMERAActionPerformed
        try {
            // TODO add your handling code here:
            r.first();
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PRIMERAActionPerformed

    private void ANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANTERIORActionPerformed
        // TODO add your handling code here:
          try {
            if(r.previous()){
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ANTERIORActionPerformed

    private void SIGUIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGUIENTEActionPerformed
   // TODO add your handling code here:
    try {
            // TODO add your handling code here:
            if(r.next()){;
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SIGUIENTEActionPerformed

    private void ULTIMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULTIMAActionPerformed
        try {
            // TODO add your handling code here:
            r.last();
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ULTIMAActionPerformed

    private void NUEVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVAActionPerformed
        // TODO add your handling code here:
        NIF.setEditable(true);
        NOMBRE.setEditable(true);
        DIRECCION.setEditable(true);
        POBLACION.setEditable(true);
        PROVINCIA.setEditable(true);
        TELEFONO.setEditable(true);
            NIF.setText("");
            NOMBRE.setText("");
            DIRECCION.setText("");
            POBLACION.setText("");
            PROVINCIA.setText("");
            TELEFONO.setText("");
            CONFIRMAR.setVisible(true);
            CANCELAR.setVisible(true);
            PRIMERA.setEnabled(false);
            ULTIMA.setEnabled(false);
            ANTERIOR.setEnabled(false);
            SIGUIENTE.setEnabled(false);
            MODIFICAR.setEnabled(false);
            BORRAR.setEnabled(false);
            NUEVA.setEnabled(false);
            var=1;
    }//GEN-LAST:event_NUEVAActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        CONFIRMAR.setVisible(true);
            CANCELAR.setVisible(true);
            PRIMERA.setEnabled(false);
            ULTIMA.setEnabled(false);
            ANTERIOR.setEnabled(false);
            SIGUIENTE.setEnabled(false);
            MODIFICAR.setEnabled(false);
            BORRAR.setEnabled(false);
            NUEVA.setEnabled(false);
            NOMBRE.setEditable(true);
        DIRECCION.setEditable(true);
        POBLACION.setEditable(true);
        PROVINCIA.setEditable(true);
        TELEFONO.setEditable(true);
            var=2;
  
    // TODO add your handling code here:
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void CONFIRMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMARActionPerformed
        if (var==1){
         try { NIF.setEditable(false);
         NOMBRE.setEditable(false);
        DIRECCION.setEditable(false);
        POBLACION.setEditable(false);
        PROVINCIA.setEditable(false);
        TELEFONO.setEditable(false);
            String vCodigo, vNombre, vDIRECCION,vPOBLACION,vPROVINCIA,vTELEFONO;
            vCodigo=NIF.getText();
            vNombre=NOMBRE.getText();
            vDIRECCION=DIRECCION.getText();
            vPOBLACION=POBLACION.getText();
            vPROVINCIA=PROVINCIA.getText();
            vTELEFONO=TELEFONO.getText();
            String url="jdbc:mysql://localhost:3306/entornodedesarrollo";
              String user="root";
            String pass="";        Connection connection = DriverManager.getConnection(url,user,pass);
    Statement s=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    String query = "insert clientes values('" + vCodigo + "','" + vNombre + "','" + vDIRECCION  + "','" +vPOBLACION+ "','" +vPROVINCIA+ "','" +vTELEFONO+"')";
    int resultado=s.executeUpdate(query);
    String query2= "select * from clientes";
            r=s.executeQuery(query2);
    r.first();
            CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            PRIMERA.setEnabled(true);
            ULTIMA.setEnabled(true);
            ANTERIOR.setEnabled(true);
            SIGUIENTE.setEnabled(true);
            MODIFICAR.setEnabled(true);
             BORRAR.setEnabled(true);
             NUEVA.setEnabled(true);
}  catch (SQLException ex) {
    Logger.getLogger(Frabricantes.class.getName()).log(Level.SEVERE, null, ex);
}}
        if (var==2){
         try {
    String vNIF,vNombre,vDireccion, vPoblacion, vProvincia, vTelefono;
    vNIF=NIF.getText();
    vNombre=NOMBRE.getText();
    vDireccion=DIRECCION.getText();
    vPoblacion=POBLACION.getText();
    vProvincia=PROVINCIA.getText();
    vTelefono=TELEFONO.getText();
    String url="jdbc:mysql://localhost:3306/entornodedesarrollo";
    String user="root";
    String pass="";
    Connection connection = DriverManager.getConnection(url,user,pass);
    Statement s=connection.createStatement();
    String query = "update clientes set NOMBRE='"+vNombre+"',DIRECCION='" + vDireccion + "', POBLACION='" + vPoblacion + "', PROVINCIA='" + vProvincia + "', TELEFONO='" + vTelefono + "' WHERE NIF='" + vNIF +"'";
    int resultado=s.executeUpdate(query);
    String query2= "select * from clientes";
            r=s.executeQuery(query2);
    r.first();
    CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            PRIMERA.setEnabled(true);
            ULTIMA.setEnabled(true);
            ANTERIOR.setEnabled(true);
            SIGUIENTE.setEnabled(true);
            MODIFICAR.setEnabled(true);
            BORRAR.setEnabled(true);
            NUEVA.setEnabled(true);
            NOMBRE.setEditable(false);
        DIRECCION.setEditable(false);
        POBLACION.setEditable(false);
        PROVINCIA.setEditable(false);
        TELEFONO.setEditable(false);


}  catch (SQLException ex) {
    Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
}}
        if (var==3){
         try { 
            String vNIF;
            vNIF=NIF.getText();
            String url="jdbc:mysql://localhost:3306/entornodedesarrollo";
            String user="root";
            String pass="";        
            Connection connection = DriverManager.getConnection(url,user,pass);
            Statement s=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "DELETE FROM clientes WHERE NIF='"+vNIF+"'";
            int resultado=s.executeUpdate(query);
            String query2= "select * from clientes";
            r=s.executeQuery(query2);
            //r.refreshRow();
            r.first();
            CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            PRIMERA.setEnabled(true);
            ULTIMA.setEnabled(true);
            ANTERIOR.setEnabled(true);
            SIGUIENTE.setEnabled(true);
            MODIFICAR.setEnabled(true);
            BORRAR.setEnabled(true);
            NUEVA.setEnabled(true);
            }  catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        } }
    }//GEN-LAST:event_CONFIRMARActionPerformed

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
           try {NIF.setEditable(false);
           NOMBRE.setEditable(false);
        DIRECCION.setEditable(false);
        POBLACION.setEditable(false);
        PROVINCIA.setEditable(false);
        TELEFONO.setEditable(false);
            // TODO add your handling code here:
            r.first();
           NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
            CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            PRIMERA.setEnabled(true);
            ULTIMA.setEnabled(true);
            ANTERIOR.setEnabled(true);
            SIGUIENTE.setEnabled(true);
            MODIFICAR.setEnabled(true);  
            BORRAR.setEnabled(true);
           NUEVA.setEnabled(true);} 
           catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);  } // TODO add your handling code here:
    }//GEN-LAST:event_CANCELARActionPerformed

    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
            CONFIRMAR.setVisible(true);
            CANCELAR.setVisible(true);
            PRIMERA.setEnabled(false);
            ULTIMA.setEnabled(false);
            ANTERIOR.setEnabled(false);
            SIGUIENTE.setEnabled(false);
            MODIFICAR.setEnabled(false);
            BORRAR.setEnabled(false);
            NUEVA.setEnabled(false);
            var=3;
    }//GEN-LAST:event_BORRARActionPerformed

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new cliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANTERIOR;
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton CONFIRMAR;
    private javax.swing.JTextField DIRECCION;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JTextField NIF;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton NUEVA;
    private javax.swing.JTextField POBLACION;
    private javax.swing.JButton PRIMERA;
    private javax.swing.JTextField PROVINCIA;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JTextField TELEFONO;
    private javax.swing.JButton ULTIMA;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
