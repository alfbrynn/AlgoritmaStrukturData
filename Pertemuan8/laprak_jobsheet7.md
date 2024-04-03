LAPORAN PRAKTIKUM JOBSHEET 7 PERTEMUAN 8

MUHAMMAD ALIF FEBRIANSYAH 
2341720025

Percobaan 1
membuat penyimpanan tumpukan barang dalam gudang
class Barang19
```java
package Pertemuan8;

public class Barang19 {

    int kode;
    String nama, kategori;

    public Barang19(int kode, String nama, String kategori){
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```
class Gudang19
```java
package Pertemuan8;

import java.security.PublicKey;

class Gudang19 {

    Barang19[] tumpukan;
    int size;
    int top;

    public Gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang19[size];
        top = -1;
    }

    public boolean cekKosong(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang19 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");        
        } else {
            System.out.println("Gagal! Tumpukan barang digundang sudah penuh");
        }
    }

    public Barang19 ambilBarang(){
        if (!cekKosong()) {
            Barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + "diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang19 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = 0; i <= top; i++){
                System.out.printf("Kode %d: %s (kategori %s)\n ", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i]. kategori);
            } 
        }else {
            System.out.println("Tumpukan barang kosong");
            
        }
    }
}
```
class Main19
```java
package Pertemuan8;
import java.io.StringReader;
import java.util.Scanner;
class Main19 {

    public static void main(String[] args) {
        // instansiasi objek bernama gudang dengan nilai parameternya 7
        Gudang19 gudang = new Gudang19(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. tambah barang");
            System.out.println("2. ambil barang");
            System.out.println("3. tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang19 barangBaru = new Barang19(kode, nama , kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}
```
contoh output
```java
Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: majalah
Masukkan nama kategori: buku
Barang majalah Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 1
Masukkan kode barang: 26
Masukkan nama barang: jaket
Masukkan nama kategori: pakaian
Barang jaket Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 2
Barang jaketdiambil dari Gudang.

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 1
Masukkan kode barang: 33
Masukkan nama barang: pizza
Masukkan nama kategori: makanan
Barang pizza Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 21: majalah (kategori buku)
Kode 33: pizza (kategori makanan)

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. keluar
Pilih operasi: 
```

pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana saja yang perlu diperbaiki?
saya hanya memperbaiki emthod lihatBarangTeratas pada class Gudang19.
```java
 // method ini untuk merepresentasikan peek untuk dapat mengecek tumpukan barang di posisi top
    public Barang19 lihatBarangTeratas(){
        if (!cekKosong()) { // isEmpty di ubah menjadi cekKosong
            Barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
```
untuk output sudah sesuai dengan requirements yang di berikan
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode
programnya!
```java
Gudang19 gudang = new Gudang19(7);
```
berdasarkan potongan kode tersebut telah ditentukan jumlah maksimal data barang adalah 7
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi
tersebut dihapus, apa dampaknya?
untuk memastikan bahwa tumpukan tidak kosong sebelum mencoba menampilkan barang
dampaknya jika method ini dihapus yaitu terjadi exeption saat tumpukan kosong sehingga sistem tidak dapat memunculkan output yang dinginkan
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
berikut cuplikan kode pada class main untuk menampilkan barang teratas
```java
case 4:
                    gudang.lihatBarangTeratas();
```
dikarenaka pada program sebelumnya sudah dibuatkan method untuk menampilkan barang teratas, kita hanya perlu memanggil method tersebut pada class main
```java
// inputan jumlah kapasitas tumpukan
        Scanner sc19 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas yang di inginkan: ");
        int kapasitas = sc19.nextInt();
        Gudang19 gudang = new Gudang19(kapasitas);
```
cuplikan kode di atas merupakan kode untuk input jumlah kapasitas yang dapat ditampung tumpukan
5. Commit dan push kode program ke Github