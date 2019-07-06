/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.data.barang;

import javax.swing.JOptionPane;

/**
 *
 * @author MaySM
 */
public class Form_Data_Barang extends javax.swing.JPanel {

    /**
     * Creates new form Form_Data_Barang
     */
    public Form_Data_Barang() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        b_Reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        b_Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        b_Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t_kode_barang = new javax.swing.JTextField();
        t_nama_barang = new javax.swing.JTextField();
        t_harga = new javax.swing.JTextField();
        c_tgl = new javax.swing.JComboBox<>();
        c_bln = new javax.swing.JComboBox<>();
        c_thn = new javax.swing.JComboBox<>();
        b_Simpan = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA BARANG");

        table_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Tanggal Masuk", "Harga"
            }
        ));
        table_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_barang);
        if (table_barang.getColumnModel().getColumnCount() > 0) {
            table_barang.getColumnModel().getColumn(0).setHeaderValue("Kode Barang");
            table_barang.getColumnModel().getColumn(1).setHeaderValue("Nama Barang");
            table_barang.getColumnModel().getColumn(2).setHeaderValue("Tanggal Masuk");
            table_barang.getColumnModel().getColumn(3).setHeaderValue("Harga");
        }

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setText("Refresh Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode Barang");

        b_Reset.setText("Reset");
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Barang");

        b_Update.setText("Update");
        b_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UpdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Masuk");

        b_Delete.setText("Delete");
        b_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Harga");

        t_kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_kode_barangActionPerformed(evt);
            }
        });

        c_tgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c_tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tglActionPerformed(evt);
            }
        });

        c_bln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        c_thn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2016", "2015", "2014", "2013", "2012", "2011", "2000" }));

        b_Simpan.setText("Simpan");
        b_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_kode_barang)
                            .addComponent(t_nama_barang)
                            .addComponent(t_harga)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(b_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(b_Simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(b_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(b_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(c_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Simpan)
                            .addComponent(b_Reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Update)
                            .addComponent(b_Delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil_barang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        reset();
    }//GEN-LAST:event_b_ResetActionPerformed

    private void b_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UpdateActionPerformed
        String kode_barang="", nama_barang = "", tgl_masuk="", tgl="", bln="", thn="";
        int harga = 0;

        kode_barang = t_kode_barang.getText();
        nama_barang = t_nama_barang.getText();
        tgl = c_tgl.getSelectedItem().toString();
        bln = c_bln.getSelectedItem().toString();
        thn = c_thn.getSelectedItem().toString();
        tgl_masuk = thn+"-"+bln+"-"+tgl;
        harga = Integer.parseInt(t_harga.getText());
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "update tabel_barang set "
            + "nama_barang='"+nama_barang+"', "
            + "tgl_masuk='"+tgl_masuk+"', "
            + "harga='"+harga+"'"
            + "where kode_barang='"+kode_barang+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Merubah data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Merubah data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_UpdateActionPerformed

    private void b_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DeleteActionPerformed
        // TODO add your handling code here:
        String kode_barang="";
        kode_barang = t_kode_barang.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "delete from tabel_barang where kode_barang='"+kode_barang+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menghapus data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_DeleteActionPerformed

    private void b_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SimpanActionPerformed
        String kode_barang="", nama_barang = "", tgl_masuk="", tgl="", bln="", thn="";
        int harga = 0;

        kode_barang = t_kode_barang.getText();
        nama_barang = t_nama_barang.getText();
        tgl = c_tgl.getSelectedItem().toString();
        bln = c_bln.getSelectedItem().toString();
        thn = c_thn.getSelectedItem().toString();
        tgl_masuk = thn+"-"+bln+"-"+tgl;
        harga = Integer.parseInt(t_harga.getText());
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "insert into tabel_barang values('"+kode_barang+"', '"+nama_barang+"', '"+tgl_masuk+"', '"+harga+"')";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_SimpanActionPerformed

    private void table_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_barangMouseClicked
        // TODO add your handling code here:
        int tabelBarang = table_barang.getSelectedRow();
        t_kode_barang.setText(table_barang.getValueAt(tabelBarang, 0).toString());
        t_nama_barang.setText(table_barang.getValueAt(tabelBarang, 1).toString());
        t_harga.setText(table_barang.getValueAt(tabelBarang, 3).toString());
        c_tgl.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(8, 10));
        c_bln.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(5, 7));
        c_thn.setSelectedItem(table_barang.getValueAt(tabelBarang, 2).toString().substring(0, 4));
    }//GEN-LAST:event_table_barangMouseClicked

    private void c_tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_tglActionPerformed

    private void t_kode_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_kode_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_kode_barangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Delete;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Simpan;
    private javax.swing.JButton b_Update;
    private javax.swing.JComboBox<String> c_bln;
    private javax.swing.JComboBox<String> c_tgl;
    private javax.swing.JComboBox<String> c_thn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_kode_barang;
    private javax.swing.JTextField t_nama_barang;
    private javax.swing.JTable table_barang;
    // End of variables declaration//GEN-END:variables

    private void tampil_barang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
