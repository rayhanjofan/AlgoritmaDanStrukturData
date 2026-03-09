package Praktikum03;

public class Matakuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // constructor berparameter
    public Matakuliah24(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
