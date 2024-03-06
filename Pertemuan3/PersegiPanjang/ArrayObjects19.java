package Pertemuan3.PersegiPanjang;
import java.util.Scanner;

public class ArrayObjects19 {
    public static void main(String[] args) {
        //PersegiPanjang19[] ppArray = new PersegiPanjang19[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah ukuran: ");
        int jumlah = sc.nextInt();

        PersegiPanjang19[] ppArray = new PersegiPanjang19[jumlah];

        for(int i = 0; i < jumlah; i++){
            //ppArray[i] = new PersegiPanjang19();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            //ppArray[i].panjang = sc.nextInt();
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            //ppArray[i].lebar = sc.nextInt();
            int lebar = sc.nextInt();

            ppArray[i] = new PersegiPanjang19(panjang, lebar);
        }

        for(int i = 0; jumlah < 3; i++){
            System.out.println("Persegi Panjang ke-1" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        
        //ppArray[0] = new PersegiPanjang19();
        //ppArray[0].panjang = 110;
        //ppArray[0].lebar = 30;

        //ppArray[1] = new PersegiPanjang19();
        //ppArray[1].panjang = 80;
        //ppArray[1].lebar = 40;

        //ppArray[2] = new PersegiPanjang19();
        //ppArray[2].panjang = 100;
        //ppArray[2].lebar = 20;

        //System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        //System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        //System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}