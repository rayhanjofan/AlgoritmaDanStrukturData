package Jobsheet2;
public class MataKuliahMain24 {
    
    public static void main(String[] args) {
        
        // Objek 1: Menggunakan konstruktor default
        Matakuliah24 mk1 = new Matakuliah24();
        // Atur nilai atribut setelah instansiasi
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        // Panggil semua method pada mk1
        System.out.println("\n--- Panggilan Method Objek mk1 ---");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tampilInformasi();
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        
        // Objek 2: Menggunakan konstruktor berparameter
        Matakuliah24 mk2 = new Matakuliah24("IF202", "Struktur Data", 3, 6);
        
        // Panggil semua method pada mk2
        System.out.println("\n--- Panggilan Method Objek mk2 ---");
        mk2.tampilInformasi();
        mk2.kurangiJam(8); // Contoh pengurangan gagal
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.tampilInformasi();
    }
}
