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
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " 
                + (getX() - getY()));
    }
}
