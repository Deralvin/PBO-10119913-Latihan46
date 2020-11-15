/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan46;

import java.time.Year;
import java.util.Scanner;

/**
 * @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class Pbo10119913latihan46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang, umur;
        String normal = "\u001b[0m";
        String merah = "\u001B[31m";

        tahunSekarang = Year.now().getValue();
        Age user = new Age(tahunSekarang);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        user.setYearBirth(scanner.nextInt());
        tahunLahir = user.getYearBirth();
        umur = user.hitungUmur();

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+ tahunLahir);
        System.out.println("Hari ini tahun : "+tahunSekarang);
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", umur);
        System.out.println("Tandanya Kamu "+ merah+ user.tandanyaKamu(umur)+ normal);
    }
    
}
