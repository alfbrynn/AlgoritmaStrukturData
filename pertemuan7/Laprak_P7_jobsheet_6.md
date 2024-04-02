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
```java
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
```java
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
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
masih bisa berjalan dengan baik
```java
--------------------------------
Masukkan data buku secara urut dari kode buku terkecil:
-------------------
Kode buku       : 3
Judul buku      : the hunger games
Tahun terbit    : 2001
Pengarang       : tolkien
Stok    : 2
-------------------
Kode buku       : 6
Judul buku      : narnia
Tahun terbit    : 2002
Pengarang       : cr lewis
Stok    : 2
-------------------
Kode buku       : 2
Judul buku      : the hobbit
Tahun terbit    : 2011
Pengarang       : jrr tolkien
Stok    : 6
-------------------
Kode buku       : 1
Judul buku      : harry potter
Tahun terbit    : 2004
Pengarang       : jk rowling
Stok    : 2
-------------------
Kode buku       : 8
Judul buku      : matematika
Tahun terbit    : 2003
Pengarang       : erwin
Stok    : 2
==================================
Data keseluruhan mahasiswa
===========================================
Data keseluruhan Buku:
========================
Kode buku: 3
Judul buku: the hunger games
Tahun terbit: 2001
Pengarang: tolkien
Stock: 2
========================
Kode buku: 6
Judul buku: narnia
Tahun terbit: 2002
Pengarang: cr lewis
Stock: 2
========================
Kode buku: 2
Judul buku: the hobbit
Tahun terbit: 2011
Pengarang: jrr tolkien
Stock: 6
========================
Kode buku: 1
Judul buku: harry potter
Tahun terbit: 2004
Pengarang: jk rowling
Stock: 2
========================
Kode buku: 8
Judul buku: matematika
Tahun terbit: 2003
Pengarang: erwin
Stock: 2
----------------------------------------
Pencarian data:
Masukkan kode buku yang dicari:
Kode buku: 1
Menggunakan sequential search
Data: 1ditemukan pada indeks 3
Kode buku       : 1
Judul   : harry potter
Tahun terbit    : 2004
Pengarang       : jk rowling
Stok    : 2
```
saya mencoba input kode buku dengan nomer yang tidak urut dan sistem masih bisa berjalan dengan normal
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
karena sistem menggunakan metode sequential search dimana metode ini tidak perlu mengurutkan nomer untuk melakukan metode sequential search. sehingga sistem dapat berjalan dengan normal
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :
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

    // pertanyaan 3
    // membuat method baru findBuku menggunakan konsep sequential search dengan tipe method dari findBuku yaitu Buku19
    public Buku19 FindBuku(int kodeBuku){
        for (Buku19 buku : listBk){
            if (buku.kodeBuku == kodeBuku){
                return buku;
            }
        }
        return null; 
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku){
                return mid; 
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
```
contoh output
```java
--------------------------------
Masukkan data buku secara urut dari kode buku terkecil:        
-------------------
Kode buku       : 1         
Judul buku      : matematika
Tahun terbit    : 2002
Pengarang       : alip
Stok    : 2
-------------------
Kode buku       : 2
Judul buku      : indonesia
Tahun terbit    : 2300
Pengarang       : ian
Stok    : 3
-------------------
Kode buku       : 3
Judul buku      : diskrit
Tahun terbit    : 2004
Pengarang       : uga
Stok    : 2
-------------------
Kode buku       : 4
Judul buku      : pytagoras
Tahun terbit    : 2004
Pengarang       : dian
Stok    : 42
-------------------
Kode buku       : 5
Judul buku      : umum
Tahun terbit    : 2001
Pengarang       : nabil
Stok    : 2
==================================
Data keseluruhan mahasiswa
===========================================
Data keseluruhan Buku:
========================
Kode buku: 1
Judul buku: matematika
Tahun terbit: 2002
Pengarang: alip
Stock: 2
========================
Kode buku: 2
Judul buku: indonesia
Tahun terbit: 2300
Pengarang: ian
Stock: 3
========================
Kode buku: 3
Judul buku: diskrit
Tahun terbit: 2004
Pengarang: uga
Stock: 2
========================
Kode buku: 4
Judul buku: pytagoras
Tahun terbit: 2004
Pengarang: dian
Stock: 42
========================
Kode buku: 5
Judul buku: umum
Tahun terbit: 2001
Pengarang: nabil
Stock: 2
----------------------------------------
Pencarian data:
Masukkan kode buku yang dicari:
Kode buku: 4
Menggunakan sequential search
Data: 4ditemukan pada indeks 3
Kode buku       : 4
Judul   : pytagoras
Tahun terbit    : 2004
Pengarang       : dian
Stok    : 42
========================
menggunakan binary search
Data: 4ditemukan pada indeks 3
Kode buku       : 4
Judul   : pytagoras
Tahun terbit    : 2004
Pengarang       : dian
Stok    : 42
========================
Kode buku: 4
Judul buku: pytagoras
Tahun terbit: 2004
Pengarang: dian
Stock: 42
```

Percobaan Pengayaan Divide and Conquer
Percobaan Merge Sort
```java
package pertemuan7.mergeSort;
  
class MergeSortTest {
  
    // method mergeSort yang menerima parameter data array yang akan diurutkan
    public void mergeSort(int[] data) {
        sort(data, 0, data.length -1);
    }

    // method merge untuk penggabungan data dari bagian kiri dan kanan
    public void merge(int data[], int left, int middle, int right){
        int[] temp = new int[data.length];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a<= middle && b <= right){
            if (temp[a] <= temp[b]) {
                data[c] = temp [a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i=0; i<=s; i++){
            data[c + i] = temp[a + i];
        }
    }
    
    public void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
  }
```
class main
```java
package pertemuan7.mergeSort;

public class Main {

    public static void main(String[] args) {
        int data[] ={10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSortTest mSort = new MergeSortTest();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
```
contoh output
```java
Sorting dengan merge sort
data awal
10 40 30 50 70 20 100 90 
setelah diurutkan
10 20 30 40 50 70 90 100 
```

Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan 
sequential search dan binary search.
```java
package pertemuan7.testSearching;
public class Buku19{
    // atribut class Buku19
    // kode buku yang awalnya bertipe int diganti String (latihan praktikum)
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    // kontruktor Buku19 dengan parameter
    public Buku19(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
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
class PencarianBuku
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
    public int FindSeqSearch(String cari){
        int posisi = -1; // inisialisasi posisi dengan nilai default -1 yang menandakan tidak ditemukannya data
        for (int j=0; j<listBk.length; j++){
            // if (listBk[j].kodeBuku == cari){
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(String x, int pos){
        if (pos != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+ pos); // tambahkan +1 pada posisi untuk menyesuaikan dengan indeks array yang dimulai dari 0
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos){
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

    // pertanyaan 3
    // membuat method baru findBuku menggunakan konsep sequential search dengan tipe method dari findBuku yaitu Buku19
    // public Buku19 FindBuku(String kodeBuku){
    //     for (Buku19 buku : listBk){
    //         if (buku.kodeBuku == kodeBuku){
    //             return buku;
    //         }
    //     }
    //     return null; 
    // }

    public int findBinarySearch(String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            // if (cari == listBk[mid].kodeBuku){
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid; 
            // } else if (listBk[mid].kodeBuku > cari) {
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
```
class BukuMain
```java
package pertemuan7.testSearching;
import java.util.Scanner;

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
        String kodeBuku = s1.nextLine(); // Menggunakan String untuk kode buku
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

        // pemanggilan method tampil
        System.out.println("===========================================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("----------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        String cari = s.nextLine();
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

        // pemanggilan method FindBuku
        // Buku19 dataBuku = data.FindBuku(cari);
        // dataBuku.tampilDataBuku();

    }
}
```