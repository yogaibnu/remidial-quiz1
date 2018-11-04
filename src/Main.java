/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Main {
    public static void main(String[] args) {
        try{
            Penumpang penumpang = new Penumpang();
            penumpang.setNama("Edward");

            Jadwal jadwal = new Jadwal();
            jadwal.setJadwal("10:00 am");
            jadwal.setTujuan("Surabaya");

            Pesawat pesawat = new Pesawat();
            pesawat.setNama("Citilink");
            pesawat.setJadwal(jadwal);
            pesawat.setBiaya(450000);
            pesawat.setJumlah(3);

            Pembayaran pembayaran = new Pembayaran();
            pembayaran.setPenumpang(penumpang);
            pembayaran.setPesawat(pesawat);

            System.out.println(pembayaran.info());
        } catch(Exception e){
            System.out.println();
        }
    }
}
