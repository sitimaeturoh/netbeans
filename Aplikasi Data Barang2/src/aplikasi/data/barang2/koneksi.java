/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.data.barang2;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MaySM
 */
public class koneksi {
    public static Connection conn;
    
    public void connect(){
        String user = "postgres";
        String pass = "6april98";
        String url = "jdbc:postgresql://localhost:5432/db1";
        try {
            if (conn == null){
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "BERHASIL");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL"+e);
            
            }
        }
        public static void main (String[]args) {
            new koneksi(). connect();
        }

    
}
