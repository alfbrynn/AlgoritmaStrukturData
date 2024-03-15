package pertemuan5.Pangkat;
import java.util.Scanner;

public class pangkatMain{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc19.nextInt();
    

    pangkat[] png = new pangkat[elemen];
    for(int i = 0; i < elemen; i++){
        //png[i] = new pangkat();
        System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        int nilai = sc19.nextInt();
        //png[i].nilai = nilai;
        System.out.println("Masukkan nilai pemangkat: ");
        int pangkat = sc19.nextInt();
        //png[i].pangkat = pangkat;
        png[i] = new pangkat(nilai, pangkat);
    }

    System.out.println("Pilih metode perhitungan yang ingin digunakan: ");
    System.out.println("1. Brute Force");
    System.out.println("2. Divide Qonquer");
    int pilihan = sc19.nextInt();

    switch(pilihan) {
        case 1:
            System.out.println("HASIL - BRUTE FORCE");
            for(int i = 0; i < elemen; i++){
            System.out.println
            ("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            break;
        case 2:
            System.out.println("HASIL - DIVIDE CONQUER");
            for(int i = 0; i < elemen; i++){
            System.out.println
            ("Hasil dari " + png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            break;
        default:
            System.out.println("Pilihan tidak valid");
        }
    }
    //System.out.println("HASIL - BRUTE FORCE");
    //for(int i = 0; i < elemen; i++){
    //    System.out.println
    //    ("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
    //}

    //System.out.println("HASIL - DIVIDE CONQUER");
    //for(int i = 0; i < elemen; i++){
    //    System.out.println
    //    ("Hasil dari " + png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    //}
    //}
}