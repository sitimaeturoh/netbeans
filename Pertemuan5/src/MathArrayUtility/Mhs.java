/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathArrayUtility;

/**
 *
 * @author MaySM
 */
public class Mhs {
    int nim, angkatan;
    String nama, kelas;

    public Mhs(int nim, int angkatan, String nama, String kelas) {
        this.nim = nim;
        this.angkatan = angkatan;
        this.nama = nama;
        this.kelas = kelas;
    }
    
    public Object[][] getData(){
        return new Object[][] {{nim, angkatan, nama, kelas}};
    }
    
    @Override
    public String toString() {
        return "Mhs{" + "nim=" + nim + ", angkatan=" + angkatan + ", nama=" + nama + ", kelas=" + kelas + '}';
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    
    
}
