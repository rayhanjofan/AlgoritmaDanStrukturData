package Praktikum03;

public class Dosen24 {
     public String kode;
    public String nama;
    public boolean jenisKelamin; // True untuk Pria, False untuk Wanita
    public int usia;

    // Constructor Berparameter
    public Dosen24(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi
    public void cetakInfo() {
        String jk = this.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Kode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia : " + this.usia);
    }
    
    // Method getter untuk Tugas 2
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    
    public int getUsia() {
        return usia;
    }
}

