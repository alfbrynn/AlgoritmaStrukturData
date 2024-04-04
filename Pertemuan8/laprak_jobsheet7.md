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

Percobaan 2
konversi kode buku yang awalnya desimal menjadi biner
Class gudang19. agar kode barang dapat dikonversi ke biner saat barang itu di ambil atau dikeluarkan pada tambahkan baris kode pada method ambil barang
```java
package Pertemuan8;

import java.security.PublicKey;

class Gudang19 {

    Barang19[] tumpukan;
    int size;
    int top;

    // konstruktor berparameter untuk melakukan inisialisasi kapasitas maksimum data barang
    public Gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang19[size];
        top = -1;
    }

    // method cekKosong untuk mengecek apakah tumpukan barang didalam gudang masih kosong
    public boolean cekKosong(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    // method ini untuk mengecek apakah tumpukan barang di dalam gudang sudah penuh
    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    // method ini untuk mempresentasikan push, method ini menerima parameter brg berupa objek barang
    public void tambahBarang(Barang19 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");        
        } else {
            System.out.println("Gagal! Tumpukan barang digundang sudah penuh");
        }
    }

    // method ini untuk mempresentasikan pop, method ini tidak menerima parameter karena barang yang diambil pasti pada posisi teratas
    public Barang19 ambilBarang(){
        if (!cekKosong()) {
            Barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + "diambil dari Gudang.");
            // konversi kode barang ke biner
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

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

    // PERCOBAAN 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi19 stack = new StackKonversi19();
        while (kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
```
membuat class StackKonversi19
```java
package Pertemuan8;

public class StackKonversi19 {

    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi19(){
        this.size = 32; // asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }
    public void push(int data){
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack penuh");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
```
contoh output
```java
Masukkan jumlah kapasitas yang di inginkan: 3

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 1
Masukkan kode barang: 12
Masukkan nama barang: meja
Masukkan nama kategori: furnitur
Barang meja Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 1
Masukkan kode barang: 34   
Masukkan nama barang: kursi
Masukkan nama kategori: furnitur
Barang kursi Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 43
Pilihan tidak valid. Silahkan coba lagi.

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 1
Masukkan kode barang: 43
Masukkan nama barang: laptop
Masukkan nama kategori: gadget 
Barang laptop Berhasil ditambahkan ke Gudang

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 12: meja (kategori furnitur)
 Kode 34: kursi (kategori furnitur)
 Kode 43: laptop (kategori gadget)
 Barang teratas: laptop

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi: 2
Barang laptopdiambil dari Gudang.
Kode unik dalam biner: 101011

Menu
1. tambah barang
2. ambil barang
3. tampilkan tumpukan barang
4. tampilkan tumpukan barang teratas
5. keluar
Pilih operasi:
```

Pertanyaan
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!
hasilnya akan sama, karena keduanya memastikan bahwa perulangan terus berlanjut selama `kode` masih bernilai lebih besar dari 0.
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!
Cuplikan kode tersebut adalah sebuah metode untuk mengonversi bilangan desimal ke biner menggunakan struktur data stack. Berikut adalah alur kerjanya:
1. Sebuah objek stack (`StackKonversi19`) dibuat untuk menyimpan sisa hasil pembagian bilangan desimal dengan 2.
2. Perulangan `while` dijalankan selama `kode` tidak sama dengan 0. Pada setiap iterasi, modulus 2 dari `kode` dihitung untuk mendapatkan sisa pembagian, yang kemudian dimasukkan ke dalam stack menggunakan metode `push()`. Selanjutnya, nilai `kode` dibagi dengan 2 untuk mendapatkan nilai selanjutnya.
3. Setelah selesai mengonversi seluruh digit desimal ke biner dan menyimpannya dalam stack, string biner yang akan menjadi hasil akhir diinisialisasi.
4. Dilakukan perulangan `while` untuk mengeluarkan elemen dari stack menggunakan metode `pop()` dan menambahkannya ke string biner.
5. Setelah stack kosong, string biner yang telah terisi dengan digit biner dari bilangan desimal dikembalikan sebagai hasil.

Percobaan 3
Konversi notasi infix ke postfix
class postfix19
```java
package Pertemuan8;

import javax.print.attribute.standard.MediaSize.ISO;

public class Postfix19 {
    int n, top;
    char[] stack;

    public Postfix19(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    // method isOperand untuk mengecek apakah elemen berupa operan
    public boolean IsOperand(char c){
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c =='.' ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c){
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q){
        String P = "";
        char c;
        for (int i = 0; i < n; i++){
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
    
}
```
class postfix main
```java
package Pertemuan8;
import java.util.Scanner;

class postfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan notasi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix19 post = new Postfix19(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
    
}
```
contoh output
``` java
Masukkan notasi matematika (infix): a+b*(c+d-e)/f
Postfix: abcd+e-*f/+
```
pertanyaan
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?
hal ini mengacu pada skala prioritas dari operator matematika, misalnya, perkalian dan pembagian memiliki prioritas yang sama, begitu juga dengan penjumlahan dan pengurangan maka return valuenya sama. jika return value di ubah dengan nilai yang berbeda setiap case nya, itu akan mengubah prioritas operator matematika
2. Jelaskan alur kerja method konversi!
method ini berfungsi untuk mengkonversi notasi infix ke postfix
1. Inisialisasi string `P` yang akan menyimpan notasi postfix.
2. Iterasi melalui setiap karakter dalam notasi infix yang diberikan.
3. Jika karakter adalah operand (huruf atau angka), tambahkan ke notasi postfix `P`.
4. Jika karakter adalah tanda kurung buka (`(`), dorong ke dalam stack.
5. Jika karakter adalah tanda kurung tutup (`)`), pop dari stack dan tambahkan ke notasi postfix `P` sampai menemukan tanda kurung buka yang sesuai. Kemudian, pop tanda kurung buka dari stack.
6. Jika karakter adalah operator, periksa prioritasnya dengan operator yang ada di dalam stack. Jika operator di dalam stack memiliki prioritas yang sama atau lebih tinggi, pop operator tersebut dan tambahkan ke notasi postfix `P`. Lakukan ini hingga stack kosong atau operator dengan prioritas yang lebih rendah ditemukan. Kemudian dorong operator yang sedang diproses ke dalam stack.
7. Setelah iterasi selesai, jika masih ada operator di dalam stack, pop dan tambahkan ke notasi postfix `P`.
8. Mengembalikan notasi postfix `P` yang telah selesai dikonversi.
3. Pada method konversi, apa fungsi dari potongan kode berikut?
kode tersebut berfungsi untuk mengambil karakter pada posisi tertentu dalam string Q dan menyimpannyake variabel e



