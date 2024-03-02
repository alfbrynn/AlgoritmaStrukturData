LAPORAN PRAKTIKUM JOBSHEET 3

MUHAMMAD ALIF FEBRIANSYAH
2341720025
TI-1B

Percobaan 1
fungsi main ArrayOobjects19
```java
public class ArrayObjects19 {
    public static void main(String[] args) {
        PersegiPanjang19[] ppArray = new PersegiPanjang19[3];
        
        ppArray[0] = new PersegiPanjang19();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang19();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang19();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}
```
fungsi PanjangSegitiga19
```java
public class PersegiPanjang19 {
    public int panjang;
    public int lebar;
}
```
contoh output
```
Persegi Panjang ke-0, panjang: 110, lebar: 30
Persegi Panjang ke-0, panjang: 80, lebar: 40
Persegi Panjang ke-0, panjang: 100, lebar: 20
```
Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan! tidak harus, kita dapat membuat array of object tanpa menambahkan method apapun pada class. misal kita memiliki class persegi panjang dengan atribut panjang dan lebar. kita dapat memuat array of object persegi panjang tanpa menambahkan method apapun pada class persegi panjang
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
tidak, dengan tidak adanya konstruktor pada clas persegi panjang maka java aka compile secara otomatis membuat konstruktor default. pemanggilan konstruktor default class persegi panjang yaitu untuk membuat objek baru.
3. Apa yang dimaksud dengan kode berikut ini:
mendeklarasikan dan menginialisasi array of object PersegiPanjang
4. Apa yang dimaksud dengan kode berikut ini:
membuat objek baru PersegiPanjang dan menyimpannya di array ppArray pada indeks ke-1. mengatur nilai atribut panjang dan lebar objek PersegiPanjang pada indeks ke-1 menjadi 80 dan 40.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2? untuk meningkatkan modularitas dan readability kode

percobaan 2
mengubah kode menjadi loop pada fungsi main arrayobjects
```java
import java.util.Scanner;
public class ArrayObjects19 {
    public static void main(String[] args) {
        PersegiPanjang19[] ppArray = new PersegiPanjang19[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang19();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Persegi Panjang ke-1" + i);
            System.out.println("Panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
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
```
contoh output
```
Persegi panjang ke-0
Masukkan panjang: 32
Masukkan lebar: 23
Persegi panjang ke-1
Masukkan panjang: 33
Masukkan lebar: 11
Persegi panjang ke-2
Masukkan panjang: 23
Masukkan lebar: 34
Persegi Panjang ke-10
Panjang: 23, lebar: 34
Persegi Panjang ke-11
Panjang: 23, lebar: 34
Persegi Panjang ke-12
Panjang: 23, lebar: 34
```
pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
iya, setiap elemen pada array 2 dimensi menjadi array of object itu sendiri
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
contoh class mahasiswa adalah class yang digunakan untuk membuat objek mahasiswa dengan objek mahasiswa dengan atribut nama dan umur. kemudian dalam kelas main, array of object data mahasiswa diinisialisasi sebagai array 2 dimensi. setiap elemen dari array tersebut adalah onjek dari kelas mahasiswa. objek objek tersebut kemudia dikases dan informasinya dicetak menggunakan dua loop bersarang.
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? ArrayIndexOutOfBoundsExecption. dalam kasus ini indeks yang digunakan berada diluar rentang indeks yang valid dari array.
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

percobaan 3
ArrayBalok
```java
package Pertemuan3.ArrayBalok;
public class ArrayBalok19 {
    public static void main(String[] args) {
        Balok19[] blArray = new Balok19[3];
       
        blArray[0] = new Balok19(100, 30, 12);
        blArray[1] = new Balok19(120, 40, 15);
        blArray[2] = new Balok19(210, 50, 25);

        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
```
Balok
```java
package Pertemuan3.ArrayBalok;

public class Balok19 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok19(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
```
pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! iya, sebuah kelas dapat memiliki lebih dari satu konstruktor. kosntruktor adalah metode khusus dalam sebuah kelas yang memiliki nama yang sama dengan kelas tersebut. namun, mereka dapat memiliki parameter yang berbeda, sehingga kita dapat memiliki beberapa konstruktor dalam satu kelas.
contoh
```java
public class Mobil {
    private String merek;
    private String warna;
    private int tahun;

    // Konstruktor tanpa parameter
    public Mobil() {
        merek = "Toyota";
        warna = "Hitam";
        tahun = 2020;
    }

    // Konstruktor dengan parameter
    public Mobil(String merek, String warna, int tahun) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Metode lainnya
}
```
dalam contoh tersebut, class mobil memiliki 2 konstruktot satu tanpa parameter dan satu dengan 3 parameter.
2. Jika diketahui terdapat class Segitiga seperti berikut ini:
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
```java
public class Segitiga {
    private int alas;
    private int tinggi;

    // Konstruktor dengan parameter
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
```
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring) 
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling()

Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, 
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atributatribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan 
tinggi limas
d. Pada bola, inpuntan untuk atribut hanya jari-jari

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:
Masukkan data mahasiswa ke- 1
Masukkan nama :Rina
Masukkan nim :1234567
Masukkan jenis kelamin :P
Masukkan IPK :3.5
Masukkan data mahasiswa ke- 2
Masukkan nama :Rio
Masukkan nim :7654321
Masukkan jenis kelamin :L
Masukkan IPK :4.0
Masukkan data mahasiswa ke- 3
Masukkan nama :Reza
Masukkan nim :8765398
Masukkan jenis kelamin :L
Masukkan IPK :3.8
Data Mahasiswa ke-1
nama : Rina
nim : 1234567
Jenis kelamin : P
Nilai IPK : 3.5
Data Mahasiswa ke-2
nama : Rio
nim : 7654321
Jenis kelamin : L
Nilai IPK : 4.0
Data Mahasiswa ke-3
nama : Reza
nim : 8765398
Jenis kelamin : L
Nilai IPK : 3.8
3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, 
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing 
proses tersebut)