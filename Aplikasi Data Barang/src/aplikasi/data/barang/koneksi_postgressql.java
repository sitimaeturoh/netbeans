/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.data.barang;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MaySM
 */
public class koneksi_postgressql {
    
    Connection koneksi;
    public Connection getConnection(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_contoh","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database GAGAl", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi;
    }
}

    
