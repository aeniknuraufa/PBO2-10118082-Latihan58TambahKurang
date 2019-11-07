/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118082.latihan58.tambahkurang;

/**
 *	
 * @author
 * Nama     : Aenik Nur Aufa
 * Kelas    : IF 2
 * NIM      : 10118082
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menghitung
 * penjumlahan dan selisih nilai
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.tampilHasilJumlah();
        
        SelisihBilangan selisihBilangan = new SelisihBilangan();
        selisihBilangan.tampilSelisih();
    }
    
}
