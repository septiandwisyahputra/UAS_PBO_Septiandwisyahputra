/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerTeman;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.ModelTeman;
import util.koneksi;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Plaza
 */
public class ViewTeman extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    koneksi koneksi = new koneksi();
    ControllerTeman ct = new ControllerTeman();
    ModelTeman mt = new ModelTeman();
    /**
     * Creates new form ViewTeman
     */
    public ViewTeman() {
        initComponents();
        tampildata();
        batalBaru();
    }
     private void baru() {
        bersih();
        bt_baru.setText("Batal");
        bt_baru.setEnabled(true);
        bt_hapus.setEnabled(false);
        bt_simpan.setEnabled(true);
        bt_bersih.setEnabled(false);
        bt_tutup.setEnabled(true);
        bt_ubah.setEnabled(false);
    }

    private void batalBaru(){
        bersih();
        bt_baru.setText("Baru");
        bt_baru.setEnabled(true);
        bt_simpan.setEnabled(false);
        bt_hapus.setEnabled(false);
        bt_tutup.setEnabled(true);
        bt_ubah.setEnabled(false);
        bt_bersih.setEnabled(false);
    }
     private void tampiltombol(){
        bt_baru.setText("Batal");
        bt_baru.setEnabled(true);
        bt_hapus.setEnabled(false);
        bt_bersih.setEnabled(true);
        bt_ubah.setEnabled(false);
        bt_simpan.setEnabled(true);
        bt_tutup.setEnabled(true);
    }
     private void tampiltable(){
        bt_baru.setEnabled(true);
        bt_baru.setText("Batal");
        bt_simpan.setEnabled(false);
        bt_hapus.setEnabled(true);
        bt_ubah.setEnabled(true);
        bt_bersih.setEnabled(true);
        bt_tutup.setEnabled(true);
    }
    private void bersih(){
        tf_id.setText("");
        tf_nama.setText("");
        tf_nope.setText("");
        tf_email.setText("");
    }
private void tampildata() {
        koneksi.koneksidatabase();

        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("ID");
        tabel.addColumn("Nama");
        tabel.addColumn("NO Handphone");
        tabel.addColumn("Email");

        tb_teman.setModel(tabel);
        try {
            String sql = "select * from tbl_teman";

            ResultSet res = koneksi.state.executeQuery(sql);
            while (res.next()) {
                tabel.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nama"),
                    res.getString("nope"),
                    res.getString("email"),
                    
                });
                tb_teman.setModel(tabel);
            }
        } catch (SQLException e) {
            System.err.println("" + e.getMessage());
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

        tf_id = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        tf_nope = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_teman = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bt_baru = new javax.swing.JButton();
        bt_ubah = new javax.swing.JButton();
        bt_simpan = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_bersih = new javax.swing.JButton();
        bt_tutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_id.setEditable(false);
        getContentPane().add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, -1));

        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });
        tf_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_namaKeyReleased(evt);
            }
        });
        getContentPane().add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));

        tf_nope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nopeActionPerformed(evt);
            }
        });
        tf_nope.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nopeKeyReleased(evt);
            }
        });
        getContentPane().add(tf_nope, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, -1));

        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_emailKeyReleased(evt);
            }
        });
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, -1));

        jLabel1.setText("id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("No. Hp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        tb_teman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_teman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_temanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_teman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 120));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        bt_baru.setText("Baru");
        bt_baru.setEnabled(false);
        bt_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_baruActionPerformed(evt);
            }
        });

        bt_ubah.setText("Ubah");
        bt_ubah.setEnabled(false);
        bt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ubahActionPerformed(evt);
            }
        });

        bt_simpan.setText("Simpan");
        bt_simpan.setEnabled(false);
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_hapus.setText("Hapus");
        bt_hapus.setEnabled(false);
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_bersih.setText("Bersih");
        bt_bersih.setEnabled(false);
        bt_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bersihActionPerformed(evt);
            }
        });

        bt_tutup.setText("Tutup");
        bt_tutup.setEnabled(false);
        bt_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_baru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(bt_bersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(bt_tutup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_baru)
                    .addComponent(bt_ubah))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan)
                    .addComponent(bt_hapus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_bersih)
                    .addComponent(bt_tutup))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 190, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
         try {
            String nama = tf_nama.getText().trim();
            String nope = tf_nope.getText().trim();
            String email = tf_email.getText().trim();
                                    
            mt.setNama(nama);
            mt.setNope(nope);
            mt.setEmail(email);
           
            ct.simpandata(mt);
            tampildata();
            bersih();
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Tidak Tersimpan !!!");
            tf_nama.setText("");
            tf_nama.requestFocus();
        }
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaActionPerformed

    private void tf_nopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nopeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nopeActionPerformed

    private void bt_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_tutupActionPerformed

    private void bt_bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bersihActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bt_bersihActionPerformed

    private void bt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ubahActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(tf_id.getText().trim());
            String nama = tf_nama.getText().trim();
            String nope = tf_nope.getText().trim();
            String email =tf_email.getText().trim();
            
            mt.setId(id);
            mt.setNama(nama);
            mt.setNope(nope);
            mt.setEmail(email);
            
            ct.ubahdata(mt);
            
            bersih();
            tampildata();
        } catch (NullPointerException e) {
            System.err.println(""+e);
            JOptionPane.showMessageDialog(this, "Tidak Terubah!!!");
        }
    }//GEN-LAST:event_bt_ubahActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(tf_id.getText());
            
            mt.setId(id);
            ct.hapusdata(mt);
            
            tampildata();
            bersih();
        } catch (NullPointerException e) {
            System.err.println(""+e);
            JOptionPane.showMessageDialog(this, "Data Tidak Terhapus!!!");
        }
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void tb_temanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_temanMouseClicked
        // TODO add your handling code here:
        tampiltable();
        int baris = tb_teman.getSelectedRow();
        tf_id.setText(tb_teman.getValueAt(baris,0).toString());
        tf_nama.setText(tb_teman.getValueAt(baris,1).toString());
        tf_nope.setText(tb_teman.getValueAt(baris,2).toString());
        tf_email.setText(tb_teman.getValueAt(baris,3).toString());
       
    }//GEN-LAST:event_tb_temanMouseClicked

    private void tf_namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_namaKeyReleased
        // TODO add your handling code here:
        tampiltombol();
    }//GEN-LAST:event_tf_namaKeyReleased

    private void tf_nopeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nopeKeyReleased
        // TODO add your handling code here:
        tampiltombol();
    }//GEN-LAST:event_tf_nopeKeyReleased

    private void tf_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyReleased
        // TODO add your handling code here:
        tampiltombol();
    }//GEN-LAST:event_tf_emailKeyReleased

    private void bt_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_baruActionPerformed
        // TODO add your handling code here:
         String logic = bt_baru.getText();
        if (logic.equals("Baru")){
            baru();
        }else{
            batalBaru();
        }
    }//GEN-LAST:event_bt_baruActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTeman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTeman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTeman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTeman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTeman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_baru;
    private javax.swing.JButton bt_bersih;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_tutup;
    private javax.swing.JButton bt_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_teman;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nope;
    // End of variables declaration//GEN-END:variables
}
