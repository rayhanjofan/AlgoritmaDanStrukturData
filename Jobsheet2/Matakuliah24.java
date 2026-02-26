package Jobsheet2;
public class Matakuliah24 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah24() {
        this.kodeMK = "MK000";
        this.nama = "Nama Mata Kuliah Default";
        this.sks = 0;
        this.jumlahJam = 0;
        System.out.println("Objek MataKuliah default telah dibuat.");
    }

    // 2. Konstruktor Berparameter
    public Matakuliah24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("Objek MataKuliah berparameter telah dibuat.");
    }

    // Method
    
    // tampilInformasi(): method ini digunakan untuk menampilkan semua informasi yang berkaitan dengan mata kuliah.
    public void tampilInformasi() {
        System.out.println("---------------------------------------------");
        System.out.println("Informasi Mata Kuliah:");
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS    : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam + " jam/minggu");
        System.out.println("---------------------------------------------");
    }

    // ubahSKS(int sksBaru): method ini memungkinkan pengubahan nilai SKS...
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS mata kuliah " + this.nama + " telah diubah menjadi " + sksBaru + ".");
    }

    // tambahJam(int jam): method ini menambahkan jumlah jam tambahan...
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println(jam + " jam tambahan berhasil ditambahkan.");
        System.out.println("Jumlah Jam saat ini: " + this.jumlahJam + " jam.");
    }

    // kurangiJam(int jam): method ini berfungsi untuk mengurangi jumlah jam dari mata kuliah...
    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println(jam + " jam berhasil dikurangi.");
            System.out.println("Jumlah Jam yang baru: " + this.jumlahJam + " jam.");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam (" + this.jumlahJam + ") tidak mencukupi untuk dikurangi " + jam + " jam.");
        }
    }
}
