/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaySM
);
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Barang extends MyConnection{
    private final String tableName= "produk";
    public String kode;
    public String nama;
    public String harga;
    public String stok;


    public Barang() {
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    public boolean create() {
        boolean result;
        if(!validate()){
            return false;
        }
        String query = "INSERT INTO "+ tableName +"(kode, nama, harga, stok) values ('" + this.kode + "', '" + this.nama + "', '" + this.harga + "', '" + this.stok + "')";
        try {
            result= this.stateOpen().executeUpdate(query) > 0;
            this.stateClose();
            return result;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean validate(){
        boolean status= false;
        if (!"".equals(this.kode) &&  !"".equals(this.nama)){
            status= true;
        } 
        return status;
    }

    public boolean update() {
        if(!validate()){
            return false;
        }
        String query = "UPDATE "+ tableName + " SET kode='" + this.kode
        + "', nama='" + this.nama
        + "', harga='" + this.harga
        + "', stok='" + this.stok
        + "' WHERE id = " + this.id + " ";
        try {
            Statement stmt = this.conn().createStatement();
            return stmt.executeUpdate(query) > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean delete() {
        String query = "DELETE FROM " + tableName + " WHERE id = " + this.id + " ";
        try {
            Statement stmt = this.conn().createStatement();
            return stmt.executeUpdate(query) > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Barang find(int id){
        Barang barang = new Barang();
        String query = "SELECT * FROM " + tableName + " WHERE id = " + id + " ";
        try {
            Statement stmt = this.conn().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next()) {
                barang.setKode(res.getString("kode"));
                barang.setNama(res.getString("nama"));
                barang.setHarga(res.getString("harga"));
                barang.setStok(res.getString("stok"));
                barang.setId(res.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return barang;
    }

    public ArrayList<Barang> all(){
        String query = "SELECT * FROM " + tableName;
        ArrayList<Barang> barangs = new ArrayList<>();
        try {
            Statement stmt = this.conn().createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Barang barang = new Barang();
                barang.setKode(res.getString("kode"));
                barang.setNama(res.getString("nama"));
                barang.setHarga(res.getString("harga"));
                barang.setStok(res.getString("stok"));
                barang.setId(res.getInt("id"));
                barangs.add(barang);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return barangs;
    }
   
}