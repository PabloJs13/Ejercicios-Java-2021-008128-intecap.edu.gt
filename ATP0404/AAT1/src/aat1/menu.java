package aat1;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
   DefaultTableModel tablauno;
   
   
   
   
    
    
    public menu() {
        
        initComponents();
        setSize(590,500);
        setTitle("Menu");
        setLocationRelativeTo(null);
        
        tablauno=new DefaultTableModel();
        tablauno.addColumn("placa");
        tablauno.addColumn("tipo vehiculo");
        tablauno.addColumn("Hora");
        tablauno.addColumn("fecha");
        tablauno.addColumn("Estado");
        tablauno.addColumn("NO de ingreso");
        
        this.tbldates.setModel(tablauno);
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gtntransporte = new javax.swing.ButtonGroup();
        lbltitulo = new javax.swing.JLabel();
        lblplaca = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        lblhora = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldates = new javax.swing.JTable();
        btnregistrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbusc = new javax.swing.JTextField();
        pnlselectipo = new javax.swing.JPanel();
        rbtnbici = new javax.swing.JRadioButton();
        rbtncarro = new javax.swing.JRadioButton();
        rbtnmoto = new javax.swing.JRadioButton();
        btneliminar = new javax.swing.JButton();
        lblestado = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        lblnoingreso = new javax.swing.JLabel();
        txtnoingreso = new javax.swing.JTextField();
        lblfondoo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("Es un gusto saludarte de nuevo, registra tus datos aca!");
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lblplaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblplaca.setText("Placa:");
        getContentPane().add(lblplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtplaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblhora.setText("Hora:");
        getContentPane().add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));
        getContentPane().add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 50, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblfecha.setText("Fecha:");
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, -1));

        tbldates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Tipo ve vehiculo", "Hora", "Fecha", "Estado", "No. de ingreso"
            }
        ));
        jScrollPane1.setViewportView(tbldates);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 450, 90));

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        btnsalir.setText("X");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        btnbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        txtbusc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtbusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 60, -1));

        pnlselectipo.setToolTipText("kk");

        gtntransporte.add(rbtnbici);
        rbtnbici.setText("Bicicleta");
        pnlselectipo.add(rbtnbici);

        gtntransporte.add(rbtncarro);
        rbtncarro.setText("Carro");
        pnlselectipo.add(rbtncarro);

        gtntransporte.add(rbtnmoto);
        rbtnmoto.setText("Motocicleta");
        pnlselectipo.add(rbtnmoto);

        getContentPane().add(pnlselectipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 50));

        btneliminar.setText("Limpiar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        lblestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblestado.setText("Estado:");
        getContentPane().add(lblestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, -1));

        lblnoingreso.setText("NO. de ingreso:");
        lblnoingreso.setToolTipText("");
        getContentPane().add(lblnoingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        getContentPane().add(txtnoingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, -1));

        lblfondoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ff.jpg"))); // NOI18N
        getContentPane().add(lblfondoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
         this.dispose();
         
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        String placa,tipodevehiculo,hora,fecha,estado,nodeingreso,transporte;
        
        
       
        gtntransporte.add(rbtnbici);
        gtntransporte.add(rbtncarro);
        gtntransporte.add(rbtnmoto);
        
        
        String[] infor = new String[6];
        infor[0]=txtplaca.getText();
        if(rbtnbici.isSelected()) { infor[1] = "Bicicleta"; }
        else if(rbtncarro.isSelected()) { infor[1] = "Carro"; }
        else if (rbtnmoto.isSelected()) { infor[1] = "Motocicleta"; }
        infor[2]=txthora.getText();
        infor[3]=txtfecha.getText();
        infor[4]=txtestado.getText();
        infor[5]=txtnoingreso.getText();
        
        
        if(rbtnbici.isSelected()) {
            tipodevehiculo="Bicicleta";
        }
        else if (rbtncarro.isSelected()) {
            tipodevehiculo="Carro";
        }
        if (rbtnmoto.isSelected()) {
            tipodevehiculo="Moto";
            
        }
         
        
        
        
            
        
        
        
        tablauno.addRow(infor);
        
        
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        txtplaca.setText("");
         
         txthora.setText("");
         txtfecha.setText("");
         tbldates.setToolTipText("");
         gtntransporte.clearSelection();
         txtnoingreso.setText("");
         txtestado.setText("");
         
         
         
         
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       int fila = tbldates.getSelectedRow();
       if (tbldates.getSelectedRow() !=-1) {
           txtplaca.setText(tbldates.getValueAt(fila, 0).toString());
           txthora.setText(tbldates.getValueAt(fila, 3).toString());
           txtfecha.setText(tbldates.getValueAt(fila, 4).toString());
           
           
       }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup gtntransporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblfondoo;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblnoingreso;
    private javax.swing.JLabel lblplaca;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlselectipo;
    private javax.swing.JRadioButton rbtnbici;
    private javax.swing.JRadioButton rbtncarro;
    private javax.swing.JRadioButton rbtnmoto;
    private javax.swing.JTable tbldates;
    private javax.swing.JTextField txtbusc;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtnoingreso;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables

   
    }

