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

percobaan 3 membuat method insertionSort untuk melakukan sorting secara ascending
```java
