package Pertemuan3.BangunRuang;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = sc.nextInt();

        for(int i = 0; i < jumlahBangunRuang; i++){
            System.out.println("\nBangun Ruang ke- " + (i + 1) + ": ");

        // Input untuk Kerucut
        System.out.println("Kerucut:");
        System.out.print("Masukkan jari-jari: ");
        int jariJariKerucut = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggiKerucut = sc.nextInt();
        Kerucut19 kerucut = new Kerucut19(jariJariKerucut, tinggiKerucut);
        System.out.printf("Luas permukaan kerucut: %.2f\n", kerucut.hitungLuasPermukaan());
        System.out.printf("Volume kerucut: %.2f\n", kerucut.hitungVolume());

        // Input untuk Limas Segi Empat Sama Sisi
        System.out.println("\nLimas Segi Empat Sama Sisi:");
        int sisiAlasLimas, tinggiLimas;
        System.out.print("Masukkan panjang sisi alas: ");
        sisiAlasLimas = sc.nextInt();
        System.out.print("Masukkan tinggi limas: ");
        tinggiLimas = sc.nextInt();
        limasSegiEmpatSamaSisi19 limas = new limasSegiEmpatSamaSisi19(sisiAlasLimas, tinggiLimas);
        System.out.printf("Luas permukaan limas: %.2f\n", limas.hitungLuasPermukaan());
        System.out.printf("Volume limas: %.2f\n", limas.hitungVolume());

        // Input untuk Bola
        System.out.println("\nBola:");
        int jariJariBola;
        System.out.print("Masukkan jari-jari bola: ");
        jariJariBola = sc.nextInt();
        Bola19 bola = new Bola19(jariJariBola);
        System.out.printf("Luas permukaan bola: %.2f\n", bola.hitungLuasPermukaan());
        System.out.printf("Volume bola: %.2f\n ", bola.hitungVolume());
        }
    }
}
