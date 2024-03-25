Pertemuan 6 
jobsheet 6 
SORTING

Muhammad ALif Febriansyah 
2341720025

percobaan 1
mengurutkan data mahasiswa berdasarkan ipk menggunakan bubble sort
class Mahasiswa
```java
package pertemuan6.BubbleSelectionInsertion;

public class Mahasiswa{
    String nama;
    int thnMsk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMsk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun masuk: "+thnMsk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}
```
class daftarMahasiswa
```java
package pertemuan6.BubbleSelectionInsertion;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
```
class main
```java
package pertemuan6.BubbleSelectionInsertion;
//import java.util.Scanner;

public class ClassMain{
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Donpu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa stelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}
```
contoh output
```
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun masuk: 2017
Umur = 25
IPK = 3.0
--------------------
Nama = Rara
Tahun masuk: 2012
Umur = 19
IPK = 4.0
--------------------
Nama = Donpu
Tahun masuk: 2018
Umur = 19
IPK = 3.5
--------------------
Nama = Abdul
Tahun masuk: 2017
Umur = 23
IPK = 2.0
--------------------
Nama = Ummi
Tahun masuk: 2019
Umur = 21
IPK = 3.75
--------------------
Data mahasiswa stelah sorting desc berdasarkan ipk
Nama = Rara
Tahun masuk: 2012
Umur = 19
IPK = 4.0
--------------------
Nama = Ummi
Tahun masuk: 2019
Umur = 21
IPK = 3.75
--------------------
Nama = Donpu
Tahun masuk: 2018
Umur = 19
IPK = 3.5
--------------------
Nama = Nusa
Tahun masuk: 2017
Umur = 25
IPK = 3.0
--------------------
Nama = Abdul
Tahun masuk: 2017
Umur = 23
IPK = 2.0
--------------------
```

pertanyaan
1. Terdapat di method apakah proses bubble sort?
berada di method bubbleSort()
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
untuk apa proses tersebut?
Proses penukaran dalam bubble sort bertujuan untuk memindahkan elemen yang lebih besar
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
perulangan i: mengontrol interasi keseluruhan bubble sort, dimulai dari indeks 0 dan berakhir pada indeks n-1
perulangan j; mengontrol perbandingan dan penukaran elemen array pada setiap pada setiap iterasi perulangan i. perulangan ini dimulai dair indeks 1 dan berakhir pada indeks n-i-1.
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? 
memastikan perulangan i tidak melebihi batas array
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? 
memastikan perulangan j tidak melebihi batas array pada setiap iterasi i
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
jika terdapat n elemen dalam array, maka perulangan i akan dijalankan sebanyak n-1 kali. jumlah tahan bubble sort sama dengan jumlah perulagan i yaitu n-1 tahap.


percobaan 2 selection sort
```java
package pertemuan6.BubbleSelectionInsertion;

import java.util.List;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------");
        }
    }

    // method bubble sort
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    // dibawah ini adalah proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    // method selection (percobaan 2 menggunakan selection)
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
```
class main memanggil method selectionSort
```java
package pertemuan6.BubbleSelectionInsertion;
//import java.util.Scanner;

public class ClassMain{
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Donpu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa stelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        // memanggil method selectionSort (percobaan 2)
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
    }
}
```
contoh output
```
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun masuk: 2017
Umur = 25
IPK = 3.0
--------------------
Nama = Rara
Tahun masuk: 2012
Umur = 19
IPK = 4.0
--------------------
Nama = Donpu
Tahun masuk: 2018
Umur = 19
IPK = 3.5
--------------------
Nama = Abdul
Tahun masuk: 2017
Umur = 23
IPK = 2.0
--------------------
Nama = Ummi
Tahun masuk: 2019
Umur = 21
IPK = 3.75
--------------------
Data mahasiswa stelah sorting desc berdasarkan ipk
Nama = Rara
Tahun masuk: 2012
Umur = 19
IPK = 4.0
--------------------
Nama = Ummi
Tahun masuk: 2019
Umur = 21
IPK = 3.75
--------------------
Nama = Donpu
Tahun masuk: 2018
Umur = 19
IPK = 3.5
--------------------
Nama = Nusa
Tahun masuk: 2017
Umur = 25
IPK = 3.0
--------------------
Nama = Abdul
Tahun masuk: 2017
Umur = 23
IPK = 2.0
--------------------
Data mahasiswa setelah sorting asc berdasarkan ipk
Nama = Abdul
Tahun masuk: 2017
Umur = 23
IPK = 2.0
--------------------
Nama = Nusa
Tahun masuk: 2017
Umur = 25
IPK = 3.0
--------------------
Nama = Donpu
Tahun masuk: 2018
Umur = 19
IPK = 3.5
--------------------
Nama = Ummi
Tahun masuk: 2019
Umur = 21
IPK = 3.75
--------------------
Nama = Rara
Tahun masuk: 2012
Umur = 19
IPK = 4.0
--------------------
```

pertanyaan
di dalam method selecion sort, terdapat baris program seperti di bawah ini:



percobaan 3 membuat method insertionSort untuk melakukan sorting secara ascending
```java
// method insertionSort (percobaan 3 mengunakan sorting insertion secara ascending)
    void insertionSort(){
        for(int i=1; i<listMhs.length; i++){
            Mahasiswa tmp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk>tmp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
```

pertanyaan

latihan praktikum
membuat palform travel menyediakan layanan pemesanan kebutuhan travelling dengan kasus 
1. harga dimulai dari harga termurah ke harga tertinggi
2. rating bintang penginapan dari bintangn tertinggi ke terendah
class 