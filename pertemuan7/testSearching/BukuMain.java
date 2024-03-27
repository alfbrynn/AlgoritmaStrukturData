package pertemuan7.testSearching;
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    PencarianBuku19 data = new PencarianBuku19();
    int jumBuku = 5;

    System.out.println("--------------------------------");
    System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
    for ( int i=0; i<jumBuku; i++){
        System.out.println("-------------------");
        System.out.println("Kode buku \t: ");
        int kodeBuku = s.nextInt();
        System.out.println("Judul buku \t: ");
        String judulBuku = sc.nextLine();
        System.out.println("Tahun terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.println("Pengarang \t: ");
        String pengarang = sc.nextLine();
        System.out.println("Stok \t: ");
        int Stock = s.nextInt();
        Buku19 m = new Buku19(kodeBuku, judulBuku, tahunTerbit, pengarang, Stock);
        data.tambah(m);
        
        System.out.println("==================================");
        System.out.println("Data keseluruhan mahasiswa");

        System.out.println("===========================================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("----------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.println("Kode buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        }
    }
}