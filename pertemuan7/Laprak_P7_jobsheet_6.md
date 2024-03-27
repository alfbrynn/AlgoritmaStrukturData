JOBSHEET 6
SEARCHING

A. percobaan searching menggunakan algoritma sequential search
membuat projek baru dengan class buku, class pencarianBuku dan class Main
class Buku19
```java
package pertemuan7.testSearching;
public class Buku19{
    // atribut class Buku19
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    // kontruktor Buku19 dengan parameter
    public Buku19(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    // method tampilDataBuku tipe void
    public void tampilDataBuku(){
        System.out.println("========================");
        System.out.println("Kode buku: "+kodeBuku);
        System.out.println("Judul buku: "+judulBuku);
        System.out.println("Tahun terbit: "+tahunTerbit);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Stock: "+stock);
    }
}
```
class pencarianBuku19
```java
package pertemuan7.testSearching;

public class PencarianBuku19 {

    Buku19 listBk[] = new Buku19[5];
    int idx;

    // method tambah() untuk menambahkan objek dari class buku ke dalam atribut listBk
    void tambah(Buku19 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method tampil untuk menampilkan semua data buku yang ada dalam class
    void tampil(){
        for (Buku19 m : listBk){ // listBk tidak mengunakan array
            m.tampilDataBuku();
        }
    }

    // method findSeqSearch 
    public int FindSeqSearch(int cari){
        int posisi = -1; // inisialisasi posisi dengan nilai default -1 yang menandakan tidak ditemukannya data
        for (int j=0; j<listBk.length; j++){
            if (listBk[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+ pos); // tambahkan +1 pada posisi untuk menyesuaikan dengan indeks array yang dimulai dari 0
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }
}
```
class Main
```java
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
        
    }
}
```
contoh output
```
--------------------------------
Masukkan data buku secara urut dari kode buku terkecil:
-------------------
Kode buku       : 111
Judul buku      : matematika
Tahun terbit    : 2023
Pengarang       : alif
Stok    : 2
-------------------
Kode buku       : 112
Judul buku      : indonesia
Tahun terbit    : 2011
Pengarang       : brian
Stok    : 3
-------------------
Kode buku       : 113
Judul buku      : ian
Tahun terbit    : 2014
Pengarang       : ian
Stok    : 1
-------------------
Kode buku       : 114
Judul buku      : Inggris
Tahun terbit    : 2019
Pengarang       : Gab
Stok    : 2
-------------------
Kode buku       : 116
Judul buku      : Narnia
Tahun terbit    : 2020
Pengarang       : Ijat
Stok    : 2
==================================
Data keseluruhan mahasiswa
===========================================
Data keseluruhan Buku:
========================
Kode buku: 111
Judul buku: matematika
Tahun terbit: 2023
Pengarang: alif
Stock: 2
========================
Kode buku: 112
Judul buku: indonesia
Tahun terbit: 2011
Pengarang: brian
Stock: 3
========================
Kode buku: 113
Judul buku: ian
Tahun terbit: 2014
Pengarang: ian
Stock: 1
========================
Kode buku: 114
Judul buku: Inggris
Tahun terbit: 2019
Pengarang: Gab
Stock: 2
========================
Kode buku: 116
Judul buku: Narnia
Tahun terbit: 2020
Pengarang: Ijat
Stock: 2
----------------------------------------
Pencarian data:
Masukkan kode buku yang dicari:
Kode buku: 111
Menggunakan sequential search
Data: 111ditemukan pada indeks 0
```
membuat method tampil data pada class pencarianBuku dan menambahkan isi dari method tampilData
```java
package pertemuan7.testSearching;

public class PencarianBuku19 {

    Buku19 listBk[] = new Buku19[5];
    int idx;

    // method tambah() untuk menambahkan objek dari class buku ke dalam atribut listBk
    void tambah(Buku19 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method tampil untuk menampilkan semua data buku yang ada dalam class
    void tampil(){
        for (Buku19 m : listBk){ // listBk tidak mengunakan array
            m.tampilDataBuku();
        }
    }

    // method findSeqSearch 
    public int FindSeqSearch(int cari){
        int posisi = -1; // inisialisasi posisi dengan nilai default -1 yang menandakan tidak ditemukannya data
        for (int j=0; j<listBk.length; j++){
            if (listBk[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+ pos); // tambahkan +1 pada posisi untuk menyesuaikan dengan indeks array yang dimulai dari 0
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1){
            System.out.println("Kode buku \t: "+ x);
            System.out.println("Judul \t: "+listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: "+listBk[pos].pengarang);
            System.out.println("Stok \t: "+listBk[pos].stock);
        } else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }
}
```
memanggil method tampilData pada main
```java
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
        data.tampilData(cari, posisi);
        
    }
}
```
contoh output
```
--------------------------------
Masukkan data buku secara urut dari kode buku terkecil:
-------------------
Kode buku       : 111
Judul buku      : algoritma
Tahun terbit    : 2010
Pengarang       : alif
Stok    : 2
-------------------
Kode buku       : 123
Judul buku      : matematika
Tahun terbit    : 2019
Pengarang       : ian
Stok    : 4
-------------------
Kode buku       : 134
Judul buku      : fisika
Tahun terbit    : 2002
Pengarang       : lutfi
Stok    : 2
-------------------
Kode buku       : 234
Judul buku      : bahasa
Tahun terbit    : 2000
Pengarang       : indah
Stok    : 4
-------------------
Kode buku       : 321
Judul buku      : diskrit
Tahun terbit    : 2021
Pengarang       : nagga
Stok    : 1
==================================
Data keseluruhan mahasiswa
===========================================
Data keseluruhan Buku:
========================
Kode buku: 111
Judul buku: algoritma
Tahun terbit: 2010
Pengarang: alif
Stock: 2
========================
Kode buku: 123
Judul buku: matematika
Tahun terbit: 2019
Pengarang: ian
Stock: 4
========================
Kode buku: 134
Judul buku: fisika
Tahun terbit: 2002
Pengarang: lutfi
Stock: 2
========================
Kode buku: 234
Judul buku: bahasa
Tahun terbit: 2000
Pengarang: indah
Stock: 4
========================
Kode buku: 321
Judul buku: diskrit
Tahun terbit: 2021
Pengarang: nagga
Stock: 1
----------------------------------------
Pencarian data: 
Masukkan kode buku yang dicari:
Kode buku: 111
Menggunakan sequential search
Data: 111ditemukan pada indeks 0
Kode buku       : 111
Judul   : algoritma
Tahun terbit    : 2010
Pengarang       : alif
Stok    : 2
```

pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
untuk emnghentikan iterasi setelah sebuah elemen yang sesuai ditemukan.
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :