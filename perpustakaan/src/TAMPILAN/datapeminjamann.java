/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAMPILAN;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import CONTROL.c_datapeminjaman;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import KONEKSI.koneksi;
import MODEL.datapeminjaman;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author x.x
 */
public class datapeminjamann extends javax.swing.JFrame {

    /**
     * Creates new form daftarpeminjam
     */
    public datapeminjamann() {
        initComponents();
         Dimension layar=Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        refresh();
    }
  datapeminjaman pin = new datapeminjaman();
    c_datapeminjaman ctrl = new c_datapeminjaman(koneksi.getKoneksi());
    List<datapeminjaman> list = new ArrayList();
    public void refresh() {
        list = ctrl.getdatapeminjaman();
        String[][] data = new String[list.size()][7];
        int i = 0;
        for (datapeminjaman li : list) {
            data[i][0] = String.valueOf(li.getIdpinjam());
            data[i][1] = String.valueOf(li.getIdpeminjam());
            data[i][2] = String.valueOf(li.getIdbuku());
            data[i][3] = String.valueOf(li.getTgl1());
            data[i][4] = String.valueOf(li.getTgl2());
            data[i][5] = String.valueOf(li.getDenda());
  

            i++;
        }
        datapeminjaman.setModel(new DefaultTableModel(data, new String[]{"idpinjam", "idpeminjam","idbuku", "tglpinjam", "tglkembali",
            "denda"}));

    }
      public void cari() {
        try {//sama seperti refresh cuma ini hanya tabel yang sesuai dengan id yang dipanggil
            int carii=Integer.parseInt(caritxt.getText());
            list = ctrl.cari(carii);
            String[][] data = new String[list.size()][7];
            int i = 0;
            for (datapeminjaman li : list) {
                data[i][0] = String.valueOf(li.getIdpinjam());
                data[i][1] = String.valueOf(li.getIdpeminjam());
                data[i][2] = String.valueOf(li.getIdbuku());
                data[i][3] = String.valueOf(li.getTgl1());
                data[i][4] = String.valueOf(li.getTgl2());
                data[i][5] = String.valueOf(li.getDenda());
                
                
                i++;
            }
            
            datapeminjaman.setModel(new DefaultTableModel(data, new String[]{"idpinjam", "idpeminjam","idbuku", "tglpinjam", "tglkembali",
                "denda"}));
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Tidak ditemukan");
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

        jLabel2 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datapeminjaman = new javax.swing.JTable();
        idpinjam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        caribtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idbuku = new javax.swing.JTextField();
        caritxt = new javax.swing.JTextField();
        tgl2 = new javax.swing.JTextField();
        idpeminjam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tgl1 = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        denda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(834, 540));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Cari Id peminjam:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/tambah1.png"))); // NOI18N
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tambahMousePressed(evt);
            }
        });
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 130, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Tanggal Kembali:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        datapeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idpinjam", "idpeminjam", "idbuku", "tglpinjam", "tglkembali", "denda"
            }
        ));
        datapeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datapeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datapeminjaman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 440, 110));

        idpinjam.setEditable(false);
        idpinjam.setEnabled(false);
        idpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(idpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Id Pinjam:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/backbut.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/close1.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        caribtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/Untitled-3.png"))); // NOI18N
        caribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribtnActionPerformed(evt);
            }
        });
        getContentPane().add(caribtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 40, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Id Buku:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));
        getContentPane().add(idbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 180, -1));
        getContentPane().add(caritxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 200, -1));

        tgl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl2ActionPerformed(evt);
            }
        });
        getContentPane().add(tgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 200, -1));
        getContentPane().add(idpeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 200, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Denda:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tanggal Pinjam:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        getContentPane().add(tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 180, -1));

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/hapus1.png"))); // NOI18N
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hapusMouseExited(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 130, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Id Peminjam:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/simpan1.png"))); // NOI18N
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                simpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                simpanMouseExited(evt);
            }
        });
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 130, 20));
        getContentPane().add(denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TAMPILAN/images/data.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
      ImageIcon A=new ImageIcon(getClass().getResource("images/backbut2.png"));
      back.setIcon(A);
    }//GEN-LAST:event_backMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
   ImageIcon A=new ImageIcon(getClass().getResource("images/close1.png"));
      close.setIcon(A);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
       ImageIcon A=new ImageIcon(getClass().getResource("images/close2.png"));
      close.setIcon(A);
    }//GEN-LAST:event_closeMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        ImageIcon A=new ImageIcon(getClass().getResource("images/backbut.png"));
      back.setIcon(A);
    }//GEN-LAST:event_backMouseExited

    private void tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseEntered
ImageIcon A=new ImageIcon(getClass().getResource("images/tambah2.png"));
      tambah.setIcon(A);
    }//GEN-LAST:event_tambahMouseEntered

    private void tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseExited
       ImageIcon A=new ImageIcon(getClass().getResource("images/tambah1.png"));
      tambah.setIcon(A);
    }//GEN-LAST:event_tambahMouseExited

    private void simpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseEntered
        ImageIcon A=new ImageIcon(getClass().getResource("images/simpan2.png"));
      simpan.setIcon(A);
    }//GEN-LAST:event_simpanMouseEntered

    private void simpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseExited
   ImageIcon A=new ImageIcon(getClass().getResource("images/simpan1.png"));
      simpan.setIcon(A);
    }//GEN-LAST:event_simpanMouseExited

    private void hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseEntered
      ImageIcon A=new ImageIcon(getClass().getResource("images/hapus2.png"));
      hapus.setIcon(A);
    }//GEN-LAST:event_hapusMouseEntered

    private void hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseExited
  ImageIcon A=new ImageIcon(getClass().getResource("images/hapus1.png"));
      hapus.setIcon(A);
    }//GEN-LAST:event_hapusMouseExited

    private void tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMousePressed
  
    }//GEN-LAST:event_tambahMousePressed

    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
 
    }//GEN-LAST:event_tambahMouseClicked

    private void datapeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datapeminjamanMouseClicked
       idpinjam.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 0).toString());
       idpeminjam.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 1).toString());
       idbuku.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 2).toString());
       tgl1.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 3).toString());
       tgl2.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 4).toString());
       denda.setText(datapeminjaman.getValueAt(datapeminjaman.getSelectedRow(), 5).toString());
      
        
    }//GEN-LAST:event_datapeminjamanMouseClicked

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
    
    }//GEN-LAST:event_simpanMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {
            int jwb = JOptionPane.showConfirmDialog(null, "Apakah anda Yakin Menghapus data ini ?", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (jwb == JOptionPane.YES_OPTION) {
                String hps = ctrl.hapus(idpinjam.getText().toString());
                if (hps.equals("berhasil hapus")) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menghapus data", "Info", JOptionPane.INFORMATION_MESSAGE);
                    refresh();
                }
            }else{
                return;
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
      int kode = Integer.parseInt(idpinjam.getText().toString());
      int id = Integer.parseInt(idpeminjam.getText().toString());
      int idb = Integer.parseInt(idbuku.getText().toString());
        
        String tglpinjam = tgl1.getText().toString();
        String tglkembali = tgl2.getText().toString();
        String dendas = denda.getText().toString();
    
       
        try {
            int jwb = JOptionPane.showConfirmDialog(null, "Apakah anda Yakin Edit data  ini ?", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (jwb == JOptionPane.YES_OPTION) {
                String update = ctrl.Updatedatapeminjaman(kode,id,idb, tglpinjam,tglkembali,dendas);
                refresh();
                if (update.equals("berhasil update")) {
                    JOptionPane.showMessageDialog(null, "Berhasil Edit Member", "Info", JOptionPane.INFORMATION_MESSAGE);
                    refresh();
                }
            } else {
                return;
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
     
        pin.setIdpeminjam(Integer.parseInt(idpeminjam.getText().toString()));
        pin.setIdbuku(Integer.parseInt(idbuku.getText().toString()));
        pin.setTgl1(tgl1.getText().toString());
        pin.setTgl2(tgl2.getText().toString());
        pin.setDenda(denda.getText().toString());
       
        
        boolean tambah = ctrl.inputdatapeminjaman(pin);
        
        if (tambah == true) {
            JOptionPane.showMessageDialog(null, "Berhasil Tambah data", "Info", JOptionPane.INFORMATION_MESSAGE);
            refresh();
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
idpinjam.setText("");
idpeminjam.setText("");
idbuku.setText("");
tgl1.setText("");
tgl2.setText("");
denda.setText("");
caritxt.setText("");
refresh();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tgl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl2ActionPerformed

    private void idpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpinjamActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       this.dispose();
       menukaryawan a =new menukaryawan();
       a.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void caribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribtnActionPerformed
        try{
            cari();
        }catch
        (Exception e){JOptionPane.showMessageDialog(null,"Tidak Ditemukan");
            refresh();
        }

    }//GEN-LAST:event_caribtnActionPerformed

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
            java.util.logging.Logger.getLogger(datapeminjamann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datapeminjamann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datapeminjamann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datapeminjamann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datapeminjamann().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton caribtn;
    private javax.swing.JTextField caritxt;
    private javax.swing.JLabel close;
    private javax.swing.JTable datapeminjaman;
    private javax.swing.JTextField denda;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idbuku;
    private javax.swing.JTextField idpeminjam;
    private javax.swing.JTextField idpinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tgl1;
    private javax.swing.JTextField tgl2;
    // End of variables declaration//GEN-END:variables
}
