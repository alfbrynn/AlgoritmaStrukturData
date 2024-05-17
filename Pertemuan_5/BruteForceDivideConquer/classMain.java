package Pertemuan_5.BruteForceDivideConquer;
import java.util.Scanner;
public class classMain{
    public static void main(String[] args) {
    Scanner sc19 = new Scanner(System.in);
    System.out.println("-------------------");
    System.out.print("Masukkan jumlah elemen: ");
    int iJml = sc19.nextInt();

    Factorial[] fk19 = new Factorial[iJml];
    for(int i = 0; i < iJml; i++){
        fk19[i] = new Factorial();
        System.out.print("Masukkan nilai data ke-" +(i+1)+": ");
        int iNilai = sc19.nextInt();
        fk19[i].nilai = iNilai;
    }

    System.out.println("HASIL - BRUTE FORCE");
    for(int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah " + fk19[i].factorialBF(fk19[i].nilai));
    }

    System.out.println("HASIL - DIVIDE CONQUER");
    for( int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan divide conquer adalah " + fk19[i].factorialDC(fk19[i].nilai));
    }
    }
}