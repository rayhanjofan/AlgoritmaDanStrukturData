package Jobsheet2;  
public class Dosen24 {
    // Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // 1. Konstruktor Default
    public Dosen24() {
        this.idDosen = "D000";
        this.nama = "Nama Dosen Default";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "Umum";
        System.out.println("Objek Dosen default telah dibuat.");
    }

    // 2. Konstruktor Berparameter
    public Dosen24(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
        System.out.println("Objek Dosen berparameter telah dibuat.");
    }

    // Method

    // tampilInformasi(): method ini digunakan untuk menampilkan informasi lengkap tentang dosen
    public void tampilInformasi() {
        String status = this.statusAktif ? "Aktif" : "Tidak Aktif";
        System.out.println("=============================================");
        System.out.println("Informasi Dosen:");
        System.out.println("ID Dosen      : " + idDosen);
        System.out.println("Nama          : " + nama);
        System.out.println("Status Aktif  : " + status);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("=============================================");
    }

    // setStatusAktif(status: boolean): method ini digunakan untuk mengatur status aktif dosen.
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        String statusBaru = status ? "Aktif" : "Tidak Aktif";
        System.out.println("Status Dosen " + this.nama + " diubah menjadi " + statusBaru + ".");
    }

    // hitungMasaKerja(thnSkrg: int): method ini menghitung dan mengembalikan (me-return-kan) masa kerja dosen...
    public int hitungMasaKerja(int thnSkrg) {
        if (this.tahunBergabung > 0 && thnSkrg >= this.tahunBergabung) {
             int masaKerja = thnSkrg - this.tahunBergabung;
             System.out.println("Masa Kerja Dosen " + this.nama + " hingga tahun " + thnSkrg + " adalah " + masaKerja + " tahun.");
             return masaKerja;
        } else {
             System.out.println("Tahun bergabung atau tahun saat ini tidak valid.");
             return 0;
        }
    }

    // ubahKeahlian(bidang: String): method ini digunakan untuk mengubah bidang keahlian dosen.
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Dosen " + this.nama + " diubah menjadi " + bidang + ".");
    }
}

