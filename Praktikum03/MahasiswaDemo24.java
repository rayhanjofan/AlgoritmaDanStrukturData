package Praktikum03;

import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        Mahasiswa24[] arrayOfMahasiswa24 = new Mahasiswa24[3]; 
        String dummy;

        
        for(int i = 0; i < 3; i++) { 
            arrayOfMahasiswa24[i] = new Mahasiswa24(); 
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1)); 
            System.out.print("NIM   : "); 
            arrayOfMahasiswa24[i].nim = sc.nextLine(); 
            System.out.print("Nama  : "); 
            arrayOfMahasiswa24[i].nama = sc.nextLine(); 
            System.out.print("Kelas : "); 
            arrayOfMahasiswa24[i].kelas = sc.nextLine(); 
            System.out.print("IPK   : "); 
            dummy = sc.nextLine(); 
            arrayOfMahasiswa24[i].ipk = Float.parseFloat(dummy); 
            System.out.println("------------------------------------");
        }
        Mahasiswa24 [] myArrayOfMahasiswa = new Mahasiswa24 [3];
        myArrayOfMahasiswa [0].nim = "244107060033";
        myArrayOfMahasiswa [0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa [0].kelas = "SIB-1E";
        myArrayOfMahasiswa [0].ipk = (float) 3.75;

            for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa24[i].cetakInfo();
            System.out.println("------------------------------------");
            
        }
    }
}