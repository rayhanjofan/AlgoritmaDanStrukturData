package Praktikum03;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahDosen = 3; // Tetapkan jumlah dosen, bisa diubah sesuai kebutuhan

        Dosen24[] arrayOfDosen = new Dosen24[jumlahDosen]; // Gunakan looping FOR untuk array

        // Variabel untuk input
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;
        
        // Looping untuk Input Data (FOR)
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            
            System.out.print("Kode : ");
            kode = sc.nextLine();
            
            System.out.print("Nama : ");
            nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String inputJK = sc.nextLine();
            // Konversi String ke Boolean. True = Pria, False = Wanita
            jenisKelamin = inputJK.equalsIgnoreCase("Pria"); 
            
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            
            // Instansiasi objek menggunakan constructor berparameter
            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
            System.out.println();
        }

        System.out.println("---------------------------------");
        
        // Looping untuk Menampilkan Data (FOREACH)
        int counter = 1;
        for (Dosen24 dosen : arrayOfDosen) { 
            System.out.println("Data Dosen ke-" + counter++);
            dosen.cetakInfo(); // Memanggil method cetakInfo()
            System.out.println();

            DataDosen24.dataSemuaDosen(arrayOfDosen); //
            DataDosen24.jumlahDosenPerJenisKelamin(arrayOfDosen); //
            DataDosen24.rerataUsiaDosenPerJenisKelamin(arrayOfDosen); //
            DataDosen24.infoDosenPalingTua(arrayOfDosen); //
            DataDosen24.infoDosenPalingMuda(arrayOfDosen); //
        
        sc.close();
        }       
    }
}
