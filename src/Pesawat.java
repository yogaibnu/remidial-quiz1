/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Pesawat {
    private String nama;
    private int jumlah;
    private int biaya;
    private Jadwal jadwal;
    
    public Pesawat() {
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    
    public int totalBiaya(int biaya, int jumlah) {
        return biaya*jumlah;
    }
    
    public String info() {
        String info = "";
        info += "Nama Maskapai: " + nama + "\n";
        info += "Biaya Tiket: " + biaya + "\n";
        info += jadwal.info();
        info += "Jumlah Tiket: " + jumlah + "\n";
        info += "Total Pembayaran: " + totalBiaya(biaya, jumlah) + "\n";
        return info;
    }
}
