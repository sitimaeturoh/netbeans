/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author MaySM
 */
public interface Options {
    void operasi (int pilihan, String simbol);
    double hasil();
    void hapus();
    void nomor (String s);
    void tampil (double d);
    String format (double d);  
}
