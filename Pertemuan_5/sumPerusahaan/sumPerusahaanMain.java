package Pertemuan_5.sumPerusahaan;
import java.util.Scanner;
public class sumPerusahaanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = scanner.nextInt();

        sumKeuntungan sumKeuntungan = new sumKeuntungan(jumlahPerusahaan);
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Masukkan jumlah bulan: ");
            int elemen = scanner.nextInt();
            sumKeuntungan.perusahaan[i] = new sumPerusahaan(elemen);

            for (int j = 0; j < elemen; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " (dalam juta (contoh 3,5)): ");
                sumKeuntungan.perusahaan[i].keuntungan[j] = scanner.nextDouble();
            }
        }

        System.out.println("==================================================");
        System.out.println("Algoritma Brute Force");
        double[][] keuntunganBF = new double[jumlahPerusahaan][];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            keuntunganBF[i] = sumKeuntungan.perusahaan[i].keuntungan;
        }
        System.out.println("Total keuntungan semua perusahaan dengan metode Brute Force: "
                + sumKeuntungan.totalBF(keuntunganBF));
        System.out.println("==================================================");

        System.out.println("Algoritma Divide Conquer");
        double[][] keuntunganDC = new double[jumlahPerusahaan][];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            keuntunganDC[i] = sumKeuntungan.perusahaan[i].keuntungan;
        }
        System.out.println("Total keuntungan semua perusahaan dengan metode Divide Conquer: "
                + sumKeuntungan.totalDC(keuntunganDC, 0, jumlahPerusahaan - 1));
        System.out.println("==================================================");

        scanner.close();
    }
}