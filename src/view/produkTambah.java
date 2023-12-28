/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Database;
import model.Produk;

/**
 *
 * @author wwwvf
 */
public class produkTambah extends javax.swing.JDialog {
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);
    private static String boundSeller;
    private static String tempImgPath;
    
    /**
     * Creates new form test
     */
    public produkTambah(java.awt.Frame parent, boolean modal, String boundSeller) {
        super(parent, modal);
        initComponents();
        this.boundSeller = boundSeller;
        
        this.getContentPane().setBackground(Color.WHITE);
        produkTambahNama.setBackground(TRANSPARENT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tambahProdukImg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        produkTambahNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        produkTambahHarga = new javax.swing.JTextField();
        produkTambahBackButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        produkTambahStok = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        produkTambahKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produkTambahDeskripsi = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 225, 54));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Warungpedia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tambahProdukImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahProdukImg.setText("Gambar produkmu akan muncul di sini!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambahProdukImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambahProdukImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 225, 54));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Tambah Produk");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        produkTambahNama.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        produkTambahNama.setText("<nama produk>");
        produkTambahNama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        produkTambahNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkTambahNamaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Harga");

        produkTambahHarga.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        produkTambahHarga.setText("<harga barang>");
        produkTambahHarga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        produkTambahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkTambahHargaActionPerformed(evt);
            }
        });

        produkTambahBackButton.setBackground(new Color(0, 0, 0, 0));
        produkTambahBackButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        produkTambahBackButton.setText("Kembali");
        produkTambahBackButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 225, 54), 2, true));
        produkTambahBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkTambahBackButtonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Stok");

        produkTambahStok.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        produkTambahStok.setText("<stok barang>");
        produkTambahStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkTambahStokActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Pilih Gambar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 225, 54), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 225, 54));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Kategori");

        produkTambahKategori.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        produkTambahKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Elektronik" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Deskripsi");

        produkTambahDeskripsi.setColumns(20);
        produkTambahDeskripsi.setRows(5);
        jScrollPane1.setViewportView(produkTambahDeskripsi);

        jButton2.setBackground(new java.awt.Color(255, 225, 54));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("Konfirmasi");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1619, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(produkTambahBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(produkTambahNama)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(produkTambahHarga)
                                        .addComponent(produkTambahStok)
                                        .addComponent(produkTambahKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jSeparator2)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)))))
                .addContainerGap(679, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produkTambahNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(produkTambahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(produkTambahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(produkTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(produkTambahBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produkTambahNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkTambahNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkTambahNamaActionPerformed

    private void produkTambahBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkTambahBackButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_produkTambahBackButtonActionPerformed

    private void produkTambahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkTambahHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkTambahHargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        
        File f = fileChooser.getSelectedFile();

        if(f != null) {
            Image img = (new ImageIcon(f.toString())).getImage().getScaledInstance(
                tambahProdukImg.getWidth(), tambahProdukImg.getHeight(), Image.SCALE_SMOOTH
            );
        
            tambahProdukImg.setText("");
            tambahProdukImg.setIcon(new ImageIcon(img));
            tempImgPath = f.getAbsolutePath();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void produkTambahStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkTambahStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkTambahStokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String produkNama = produkTambahNama.getText();
        String produkDeskripsi = produkTambahDeskripsi.getText();
        int produkHarga = 0;
        int produkStok = 0;
        boolean isValid = false;
        
        try {
            produkHarga = Integer.valueOf(produkTambahHarga.getText());
            produkStok = Integer.valueOf(produkTambahStok.getText());
            isValid = (!produkNama.isEmpty() 
                && !produkDeskripsi.isEmpty()
                && produkHarga >= 0
                && produkStok >= 0
            );
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga dan stok harus sebuah angka dan lebih dari -1.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        System.out.println(isValid);
        
        // Handle file
        String newpath = "src//upload";
        File directory = new File(newpath);
        if (!directory.exists()){
                    directory.mkdirs();
        }
        File fileawal;
        File fileakhir;
        String ext = this.tempImgPath.substring(tempImgPath.lastIndexOf(".")+1);
        fileawal = new File(tempImgPath);
        fileakhir = new File(
            newpath + "//" + String.format("%s%s.%s", 
                boundSeller, produkNama.replace(" ", ""), ext
            )
        );
        
        try {
            Files.copy(fileawal.toPath(), fileakhir.toPath());
        } catch (IOException ex) {
            Logger.getLogger(CustomerSignUp.class.getName()).log(Level.SEVERE, null, ex);
            isValid = false;
        } catch (InvalidPathException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Gagal", JOptionPane.INFORMATION_MESSAGE);
            isValid = false;
        }
                
        // Sending to DB
        if(isValid) {
            try {
                Database db = new Database();
                String sql = String.format(
                    "INSERT INTO produk(nama, harga, stok, kategori, deskripsi, image_path, penjual) VALUES('%s', %d, %d, '%s', '%s', '%s', '%s')",
                    produkNama, produkHarga, produkStok,
                    produkTambahKategori.getSelectedItem().toString(),
                    produkDeskripsi, String.format("%s%s.%s", boundSeller, produkNama, ext),
                    boundSeller
                );
                db.query(sql);
                JOptionPane.showMessageDialog(null, "Produk berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(produkTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produkTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produkTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produkTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                produkTambah dialog = new produkTambah(new javax.swing.JFrame(), true, 
                    "ashdashdlashdlashas"
                );
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton produkTambahBackButton;
    private javax.swing.JTextArea produkTambahDeskripsi;
    private javax.swing.JTextField produkTambahHarga;
    private javax.swing.JComboBox<String> produkTambahKategori;
    private javax.swing.JTextField produkTambahNama;
    private javax.swing.JTextField produkTambahStok;
    private javax.swing.JLabel tambahProdukImg;
    // End of variables declaration//GEN-END:variables
}
