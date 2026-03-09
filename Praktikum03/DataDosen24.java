package Praktikum03;

public class DataDosen24 {
    
    // a. dataSemuaDosen (Dosen[] arrayOfDosen)
    public static void dataSemuaDosen(Dosen24[] arrayOfDosen) { 
        System.out.println("\n--- A. DATA SEMUA DOSEN ---");
        int index = 1;
        for (Dosen24 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + index++);
            d.cetakInfo();
            System.out.println("-------");
        }
    }

    // b. jumlahDosenPerJenisKelamin (Dosen[] arrayOfDosen)
    public static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) { // true = Pria
                pria++;
            } else { // false = Wanita
                wanita++;
            }
        }
        System.out.println("\n--- B. JUMLAH DOSEN PER JENIS KELAMIN ---");
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    // c. rerataUsiaDosenPerJenisKelamin (Dosen[] arrayOfDosen)
    public static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int countPria = 0;
        int totalUsiaWanita = 0;
        int countWanita = 0;

        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) { // Pria
                totalUsiaPria += d.usia;
                countPria++;
            } else { // Wanita
                totalUsiaWanita += d.usia;
                countWanita++;
            }
        }
        
        double rerataPria = countPria > 0 ? (double) totalUsiaPria / countPria : 0;
        double rerataWanita = countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\n--- C. RERATA USIA DOSEN PER JENIS KELAMIN ---");
        System.out.printf("Rata-rata Usia Dosen Pria: %.2f\n", rerataPria);
        System.out.printf("Rata-rata Usia Dosen Wanita: %.2f\n", rerataWanita);
    }

    // d. infoDosenPalingTua (Dosen24[] arrayOfDosen)
    public static void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen24 palingTua = arrayOfDosen[0];
        for (Dosen24 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) {
                palingTua = d;
            }
        }
        System.out.println("\n--- D. DOSEN PALING TUA ---");
        palingTua.cetakInfo();
    }

    // e. infoDosenPalingMuda (Dosen24[] arrayOfDosen)
    public static void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen24 palingMuda = arrayOfDosen[0];
        for (Dosen24 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) {
                palingMuda = d;
            }
        }
        System.out.println("\n--- E. DOSEN PALING MUDA ---");
        palingMuda.cetakInfo();
    }
}
