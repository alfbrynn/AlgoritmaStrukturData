package Pertemuan_5.Sum;
import java.util.Scanner;

public class mainSum{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5,9)");
        System.out.println("Masukkan jumlah bulan: ");
        int elemen = sc19.nextInt();

        sum sm = new sum(elemen);
        System.out.println("==================================================");
        for(int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke- "+(i+1)+" = ");
            sm.keuntungan[i] = sc19.nextDouble();
        }
        System.out.println("==================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("==================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}