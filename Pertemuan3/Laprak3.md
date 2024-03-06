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
tidak, dengan tidak adanya konstruktor pada clas persegi panjang maka java akan compile secara otomatis membuat konstruktor default. pemanggilan konstruktor default class persegi panjang yaitu untuk membuat objek baru.
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
contoh class mahasiswa adalah class yang digunakan untuk membuat objek mahasiswa dengan objek mahasiswa dengan atribut nama dan umur. kemudian dalam kelas main, array of object data mahasiswa diinisialisasi sebagai array 2 dimensi. setiap elemen dari array tersebut adalah onjek dari kelas mahasiswa. objek objek tersebut kemudian di akses dan informasinya dicetak menggunakan dua loop bersarang.
```java
public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
```
fungsi main
```java
public class Main {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi sebagai array of object Mahasiswa
        Mahasiswa[][] dataMahasiswa = new Mahasiswa[2][2];
        
        // Inisialisasi objek Mahasiswa untuk setiap elemen array
        dataMahasiswa[0][0] = new Mahasiswa("John", 20);
        dataMahasiswa[0][1] = new Mahasiswa("Doe", 22);
        dataMahasiswa[1][0] = new Mahasiswa("Alice", 21);
        dataMahasiswa[1][1] = new Mahasiswa("Bob", 23);

        // Akses dan cetak informasi mahasiswa menggunakan loop bersarang
        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                Mahasiswa mahasiswa = dataMahasiswa[i][j];
                System.out.println("Nama: " + mahasiswa.getNama() + ", Umur: " + mahasiswa.getUmur());
            }
        }
    }
}
```
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? ArrayIndexOutOfBoundsExecption. dalam kasus ini indeks yang digunakan berada diluar rentang indeks yang valid dari array.
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
```java
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
            ppArray[i] = new PersegiPanjang19();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            //int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
            //int lebar = sc.nextInt();

            //ppArray[i] = new PersegiPanjang19(panjang, lebar);
        }

        for(int i = 0; jumlah < 3; i++){
            System.out.println("Persegi Panjang ke-1" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        // ini merupakan kode percobaan sebelumnya
        
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
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !
tidak diperbolehkan karena akan menyebabkan beberapa  masalah ketidakkonsistenan data, pemborosan dan kesalahan logika.

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
package Pertemuan3.Segititga;
public class Segitiga19{
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga19(int a, int t){
        alas = a;
        tinggi = t;
    }
}
```
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring) 
```java
package Pertemuan3.Segititga;
public class Segitiga19{
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga19(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
```
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
```java
package Pertemuan3.Segititga;
public class SegitigaMain19{
    public static void main(String[] args) {
        Segitiga19[] sgArray = new Segitiga19[4];
        
        sgArray[0] = new Segitiga19(10, 4);
        sgArray[1] = new Segitiga19(20, 10);
        sgArray[2] = new Segitiga19(15, 6);
        sgArray[3] = new Segitiga19(25, 10);
    }
}
```
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling()
```java
package Pertemuan3.Segititga;
public class SegitigaMain19{
    public static void main(String[] args) {
        Segitiga19[] sgArray = new Segitiga19[4];
        
        sgArray[0] = new Segitiga19(10, 4);
        sgArray[1] = new Segitiga19(20, 10);
        sgArray[2] = new Segitiga19(15, 6);
        sgArray[3] = new Segitiga19(25, 10);

        for(int i = 0; i < 4; i++){
            System.out.println("Luas segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Keliling segitiga " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
```

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
fungsi main
```java
package Pertemuan3.BangunRuang;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = sc.nextInt();

        for(int i = 0; i < jumlahBangunRuang; i++){
            System.out.println("\nBangun Ruang ke- " + (i + 1) + ": ");

        // Input untuk Kerucut
        System.out.println("Kerucut:");
        System.out.print("Masukkan jari-jari: ");
        int jariJariKerucut = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggiKerucut = sc.nextInt();
        Kerucut19 kerucut = new Kerucut19(jariJariKerucut, tinggiKerucut);
        System.out.printf("Luas permukaan kerucut: %.2f\n", kerucut.hitungLuasPermukaan());
        System.out.printf("Volume kerucut: %.2f\n", kerucut.hitungVolume());

        // Input untuk Limas Segi Empat Sama Sisi
        System.out.println("\nLimas Segi Empat Sama Sisi:");
        int sisiAlasLimas, tinggiLimas;
        System.out.print("Masukkan panjang sisi alas: ");
        sisiAlasLimas = sc.nextInt();
        System.out.print("Masukkan tinggi limas: ");
        tinggiLimas = sc.nextInt();
        limasSegiEmpatSamaSisi19 limas = new limasSegiEmpatSamaSisi19(sisiAlasLimas, tinggiLimas);
        System.out.printf("Luas permukaan limas: %.2f\n", limas.hitungLuasPermukaan());
        System.out.printf("Volume limas: %.2f\n", limas.hitungVolume());

        // Input untuk Bola
        System.out.println("\nBola:");
        int jariJariBola;
        System.out.print("Masukkan jari-jari bola: ");
        jariJariBola = sc.nextInt();
        Bola19 bola = new Bola19(jariJariBola);
        System.out.printf("Luas permukaan bola: %.2f\n", bola.hitungLuasPermukaan());
        System.out.printf("Volume bola: %.2f\n ", bola.hitungVolume());
        }
    }
}
```
fungsi kerucut
```java
package Pertemuan3.BangunRuang;

public class Kerucut19{
    private int jariJari;
    private int tinggi;

    public Kerucut19(int jariJari, int tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan(){
        return Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));
    }

    public double hitungVolume(){
        return (1.0/3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}
```
fungsi limas segi empat sama sisi
```java
package Pertemuan3.BangunRuang;
public class limasSegiEmpatSamaSisi19{
    private int sisiAlas;
    private int tinggi;

    public limasSegiEmpatSamaSisi19(int sisiAlas, int tinggi){
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan(){
        int luasAlas = sisiAlas * sisiAlas;
        int luasSegitigaSisi = (sisiAlas * tinggi) / 2;
        return luasAlas + 4 * luasSegitigaSisi;
    }

    public double hitungVolume(){
        double luasAlas = sisiAlas * sisiAlas;
        return (1.0 / 3) * luasAlas * tinggi;
    }
}
```
fungsi bola
```java
package Pertemuan3.BangunRuang;
public class Bola19{
    private int jariJari;

    public Bola19(int jariJari){
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungVolume(){
        return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
    }
}
```
contoh output
```
Masukkan jumlah bangun ruang: 2

Bangun Ruang ke- 1: 
Kerucut:
Masukkan jari-jari: 12
Masukkan tinggi: 32
Luas permukaan kerucut: 1740,79
Volume kerucut: 4825,49

Limas Segi Empat Sama Sisi:
Masukkan panjang sisi alas: 13
Masukkan tinggi limas: 12
Luas permukaan limas: 481,00
Volume limas: 676,00

Bola:
Masukkan jari-jari bola: 32
Luas permukaan bola: 12867,96
Volume bola: 137258,28

Bangun Ruang ke- 2:
Kerucut:
Masukkan jari-jari: 12
Masukkan tinggi: 23
Luas permukaan kerucut: 1430,39
Volume kerucut: 3468,32

Limas Segi Empat Sama Sisi:
Masukkan panjang sisi alas: 12
Masukkan tinggi limas: 34
Luas permukaan limas: 960,00
Volume limas: 1632,00

Bola:
Masukkan jari-jari bola: 43
Luas permukaan bola: 23235,22
Volume bola: 333038,14
```
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
fungsi data mahasiswa
```java
package Pertemuan3.DataMahasiswa;

import java.util.Scanner;

public class DataMahasiswa19 {
    private String[] nama;
    private String[] nim;
    private char[] jenisKelamin;
    private double[] Ipk;

    public DataMahasiswa19(int jumlahMahasiswa){
        nama = new String[jumlahMahasiswa];
        nim = new String[jumlahMahasiswa];
        jenisKelamin = new char[jumlahMahasiswa];
        Ipk = new double[jumlahMahasiswa];
    }

    public void inputDataMahasiswa(Scanner sc, int i){
        System.out.print("Masukkan nama: ");
        nama[i] = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim[i] = sc.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenisKelamin[i] = sc.nextLine().charAt(0);
        System.out.print("Masukkan Ipk: ");
        Ipk[i] = sc.nextDouble();
        sc.nextLine();
    }

    public void tampilDataMahasiswa(){
        for(int i = 0; i < nama.length; i++){
            System.out.println("Data mahasiswa ke- " + (i + 1));
            System.out.println("nama: " + nama[i]);
            System.out.println("nim: " + nim[i]);
            System.out.println("jenis kelamin: " + jenisKelamin[i]);
            System.out.println("nilai IPK: " + Ipk[i]);
        }
    }
}
```
fungsi main untuk memanggil fungsi data mahasiswa
```java
package Pertemuan3.DataMahasiswa;
import java.util.Scanner;

public class MainDataMahasiswa19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa = 3;

        DataMahasiswa19 dataMhs = new DataMahasiswa19(jumlahMahasiswa);

        for(int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            dataMhs.inputDataMahasiswa(sc, i);
        }

        dataMhs.tampilDataMahasiswa();
    }
}
```
contoh output
```
Masukkan data mahasiswa ke- 1
Masukkan nama: Rina
Masukkan nim: 1234567
Masukkan jenis kelamin (L/P): P
Masukkan Ipk: 3,5
Masukkan data mahasiswa ke- 2
Masukkan nama: Rio
Masukkan Ipk: 4,0
Masukkan data mahasiswa ke- 3
Masukkan nama: Reza
Masukkan nim: 8765398
Masukkan jenis kelamin (L/P): L
Masukkan Ipk: 3,8
Data mahasiswa ke- 1nama: Rinanim: 1234567jenis kelamin: Pnilai IPK: 3.5Data mahasiswa ke- 2nama: Rionim: 7654321jenis kelamin: Lnilai IPK: 4.0Data mahasiswa ke- 3nama: Rezanim: 8765398jenis kelamin: Lnilai IPK: 3.8
PS E:\Polinema\semester 2\AlgoritmaStrukturData>  e:; cd 'e:\Polinema\semester 2\AlgoritmaStrukturData'; & 'C:\Program Files\Java\jdk-21\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\ASUS\AppData\Roaming\Code\User\workspaceStorage\9a028d5ecac3dfc700b99731ebc51a7a\redhat.java\jdt_ws\AlgoritmaStrukturData_61e6e29b\bin' 'Pertemuan3.DataMahasiswa.MainDataMahasiswa19'
Masukkan data mahasiswa ke- 1
Masukkan nama: Rina
Masukkan nim: 1234567
Masukkan jenis kelamin (L/P): P
Masukkan Ipk: 3,5
Masukkan data mahasiswa ke- 2
Masukkan nama: Rio
Masukkan nim: 7654321
Masukkan jenis kelamin (L/P): L
Masukkan Ipk: 4,0
Masukkan data mahasiswa ke- 3
Masukkan nama: Reza
Masukkan nim: 8765398
Masukkan jenis kelamin (L/P): L
Masukkan Ipk: 3,8
Data mahasiswa ke- 1
nama: Rina
nim: 1234567
jenis kelamin: P
nilai IPK: 3.5
Data mahasiswa ke- 2
nama: Rio
nim: 7654321
jenis kelamin: L
nilai IPK: 4.0
Data mahasiswa ke- 3
nama: Reza
nim: 8765398
jenis kelamin: L
nilai IPK: 3.8
```

terima kasih