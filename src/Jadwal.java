/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Jadwal {
    private String jadwal;
    private String tujuan;
    
    public Jadwal() {
        
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public String info() {
        String info = "";
        info += "Jadwal Penerbangan: " + this.jadwal + "\n";
        info += "Tujuan: " + this.tujuan + "\n";
        return info();
    }
}
