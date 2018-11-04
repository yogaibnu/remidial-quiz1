/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Penumpang {
    private String nama;
    
    public Penumpang() {
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
