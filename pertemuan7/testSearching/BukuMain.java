package pertemuan7.testSearching;
import java.util.Scanner;

import pertemuan5.Sum.mainSum;
public class BukuMain {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    PencarianBuku19 data = new PencarianBuku19();
    int jumBuku = 5;

    System.out.println("--------------------------------");
    System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
    for ( int i=0; i<jumBuku; i++){
        System.out.println("-------------------");
        System.out.print("Kode buku \t: ");
        int kodeBuku = s.nextInt();
        System.out.print("Judul buku \t: ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.print("Stok \t: ");
        int Stock = s.nextInt();
        Buku19 m = new Buku19(kodeBuku, judulBuku, tahunTerbit, pengarang, Stock);
        data.tambah(m);
        
        }
        System.out.println("==================================");
        System.out.println("Data keseluruhan mahasiswa");

        // pemanggila method tampil
        System.out.println("===========================================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("----------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        // pemanggilan method tampilData
        data.tampilData(cari, posisi);
        
        // pemanggilan method findBinarySearch
        System.out.println("========================");
        System.out.println("menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}