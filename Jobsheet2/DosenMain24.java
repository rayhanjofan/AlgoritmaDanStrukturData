package Jobsheet2;
public class DosenMain24 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan konstruktor default
        Dosen24 dsn1 = new Dosen24();
        // Atur nilai atribut setelah instansiasi
        dsn1.idDosen = "D007";
        dsn1.nama = "Dr. Budi Doremi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Jaringan Komputer";

        // Panggil semua method pada dsn1
        System.out.println("\n--- Panggilan Method Objek dsn1 ---");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2024);
        dsn1.ubahKeahlian("Keamanan Siber");
        dsn1.tampilInformasi();

        // Objek 2: Menggunakan konstruktor berparameter
        Dosen24 dsn2 = new Dosen24("D010", "Prof. Rina Sari", true, 2008, "Basis Data");

        // Panggil semua method pada dsn2
        System.out.println("\n--- Panggilan Method Objek dsn2 ---");
        dsn2.tampilInformasi();
        dsn2.hitungMasaKerja(2024);
        dsn2.ubahKeahlian("Data Mining");
        dsn2.setStatusAktif(true);
        dsn2.tampilInformasi();
    }
}