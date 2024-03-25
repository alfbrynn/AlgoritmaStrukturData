pertemuan 3

Muhammad Alif Febriansyah
2341720025
19
TI 1B

percobaan 1
Menghitung nilai faktorial dengan algoritma brute force dan divide conquer
```java
package pertemuan5.BruteForceDivideConquer;

public class Factorial{
    public int nilai;

    int factorialBF(int n) {
        int facto = 1;
        for(int i = 1; i <= n; i++){
            facto = facto * i;
        }
        return facto;
    }

    int factorialDC(int n){
        if (n==1){
            return 1;
        } else {
            int facto = n * factorialDC(n-1);
            return facto;
        }
    }
}
```
main faktorial
```java
package pertemuan5.BruteForceDivideConquer;
import java.util.Scanner;
public class classMain{
    public static void main(String[] args) {
    Scanner sc19 = new Scanner(System.in);
    System.out.println("-------------------");
    System.out.print("Masukkan jumlah elemen: ");
    int iJml = sc19.nextInt();

    Factorial[] fk19 = new Factorial[iJml];
    for(int i = 0; i < iJml; i++){
        fk19[i] = new Factorial();
        System.out.print("Masukkan nilai data ke-" +(i+1)+": ");
        int iNilai = sc19.nextInt();
        fk19[i].nilai = iNilai;
    }

    System.out.println("HASIL - BRUTE FORCE");
    for(int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah " + fk19[i].factorialBF(fk19[i].nilai));
    }

    System.out.println("HASIL - DIVIDE CONQUER");
    for( int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan divide conquer adalah " + fk19[i].factorialDC(fk19[i].nilai));
    }
    }
}
```
contoh output
```
-------------------
Masukkan jumlah elemen: 3
Masukkan nilai data ke-1: 5
Masukkan nilai data ke-2: 8
Masukkan nilai data ke-3: 3
HASIL - BRUTE FORCE
Hasil perhitungan faktorial menggunakan brute force adalah 120 
Hasil perhitungan faktorial menggunakan brute force adalah 40320
Hasil perhitungan faktorial menggunakan brute force adalah 6   
HASIL - DIVIDE CONQUER
Hasil perhitungan faktorial menggunakan divide conquer adalah 120
Hasil perhitungan faktorial menggunakan divide conquer adalah 40320
Hasil perhitungan faktorial menggunakan divide conquer adalah 6
```

pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!
if else digunakan untuk mengimplementasikan rekursi. jika kondisi n==1 terpenuhi, maka fungsi akan mengembalikan nilai 1 karena 1!=1, maka fungsi akan melakukan pemanggilan rekursif dengan memanggilnya sendiri dengan parameter n-1 dan mengalikan nilai n dengan rekursi dari n-1. dengan demikian, jika kita ingin menghitung nilai faktorial dari suatu bilangan, kita membagi masalah menjadi masalah yang lebih kecil dengan mengurangi n satu per satu hingga mencapai base case.
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan!
iya, memungkinkan merubah perulangan for, misalnya menggunakan perulangan while loop.
```java
int factorialBF(int n){
    int facto = 1;
    int i = 1;
    while (i <= n){
        facto = facto * i;
        i++;
    }
    return facto;
}
```
while loop digunakan dengan menginialisasi i dengan nilai 1. selama i kurang dari satu atau sama dengan n, perulangan akan terus berjalan, dan faktorial akan dikalikan dengan i, kemudian nilai i akan bertambah satu setiap iterasi.
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 'facto *= i': ini adalah operasi yang dilakukan dalam BF. ini memperbarui nilai faktorial dengan mengalihkannya dengan nilai i setiap kali iterasi loop. ini adalah cara langsung untuk menghitung faktorial dengan mengakumulasi hasil perkalian.
'int facto = n * factorialDC(n-1)' ini adalah operasi yang digunakan dalam DC. operasinya yaitu menghitung faktorial n, kita mengalikan n dengan hasil rekursif dari faktorial (n-1). ini membagi masalah menjadi submasalah yang lebih kecil dan menyelesaikannya secara terpisah kemudian menggabungkan hasilnya.

percobaan 2
menghitung hasil pangkat dengan algoritma brute force dan divide conquer
class pangkat
```java
package pertemuan5.Pangkat;

public class pangkat{
    public int nilai, pangkat;

    int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        } else {
            if (n%2==1){
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            } else {
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    }
}
```
class pangkat main
```java
package pertemuan5.Pangkat;
import java.util.Scanner;

public class pangkatMain{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc19.nextInt();
    

    pangkat[] png = new pangkat[elemen];
    for(int i = 0; i < elemen; i++){
        png[i] = new pangkat();
        System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        int nilai = sc19.nextInt();
        png[i].nilai = nilai;
        System.out.println("Masukkan nilai pemangkat: ");
        int pangkat = sc19.nextInt();
        png[i].pangkat = pangkat;
    }

    System.out.println("HASIL - BRUTE FORCE");
    for(int i = 0; i < elemen; i++){
        System.out.println
        ("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
    }

    System.out.println("HASIL - DIVIDE CONQUER");
    for(int i = 0; i < elemen; i++){
        System.out.println
        ("Hasil dari " + png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
    }
    }
}
```
contoh output
```
==============
Masukkan jumlah elemen yang dihitung:
2
Masukkan nilai yang hendak dipangkatkan:
6
Masukkan nilai pemangkat:
2
Masukkan nilai yang hendak dipangkatkan:
4
Masukkan nilai pemangkat:
3
HASIL - BRUTE FORCE
Hasil dari 6 pangkat 2 adalah 36
Hasil dari 4 pangkat 3 adalah 64
HASIL - DIVIDE CONQUER
Hasil dari 6 pangkat 2 adalah 36
Hasil dari 4 pangkat 3 adalah 64
```

pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
- method BF
metode ini menggunakan pendekatan sederhana dengan melakukan pengulangan sebanyak n kali untuk mengalikan nilai a sebanyak n kali.
- method DC
metode ini adalah membagi pangkat menjadi dua bagian, kemudian menghitung pangkat dari setengahnya dan menggabungkan hasilnya. metode ini secara rekursif memanggil diri sendiri hingga mencapai base case.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
tidak, tahap combine seharusnya terjadi saat hasil perhitungan dari submasalah dikombinasikan untuk memberikan hasil akhir. dalam kode tersebut hasil perhitungan untk setiap submasalah dikembalikan secara langsung tanpa ada tahap kombinasi.
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor.
pertama kita harus menambahkan konstruktor pada class pangkat
```java
   public pangkat(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
```
kemudian panggil konstruktor pada class pangkat melalui class pangkatmMain menggunakan kode berikut
```java
    for(int i = 0; i < elemen; i++){
        //png[i] = new pangkat();
        System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        int nilai = sc19.nextInt();
        //png[i].nilai = nilai;
        System.out.println("Masukkan nilai pemangkat: ");
        int pangkat = sc19.nextInt();
        //png[i].pangkat = pangkat;
        png[i] = new pangkat(nilai, pangkat);
    }
```
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case!
```java
package pertemuan5.Pangkat;
import java.util.Scanner;

public class pangkatMain{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc19.nextInt();
    

    pangkat[] png = new pangkat[elemen];
    for(int i = 0; i < elemen; i++){
        //png[i] = new pangkat();
        System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        int nilai = sc19.nextInt();
        //png[i].nilai = nilai;
        System.out.println("Masukkan nilai pemangkat: ");
        int pangkat = sc19.nextInt();
        //png[i].pangkat = pangkat;
        png[i] = new pangkat(nilai, pangkat);
    }

    System.out.println("Pilih metode perhitungan yang ingin digunakan: ");
    System.out.println("1. Brute Force");
    System.out.println("2. Divide Qonquer");
    int pilihan = sc19.nextInt();

    switch(pilihan) {
        case 1:
            System.out.println("HASIL - BRUTE FORCE");
            for(int i = 0; i < elemen; i++){
            System.out.println
            ("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            break;
        case 2:
            System.out.println("HASIL - DIVIDE CONQUER");
            for(int i = 0; i < elemen; i++){
            System.out.println
            ("Hasil dari " + png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            break;
        default:
            System.out.println("Pilihan tidak valid");
        }
    }
}
```

percobaan 3
menghitung sum array dengan algoritma brute force dan divide conquer
dalam percobaan ini, kita akan mempraktekkan bagaimana proses divide, conquer, dan combine diterapkan pada studi kasus penjumlahan kuntungan suatu perusahaan dalam beebrapa bulan.
class sum
```java
package pertemuan5.Sum;
public class sum{
    int elemen;
    double keuntungan[], total;

    sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for(int i = 0; i < elemen; i++){
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        } else if(l < r){
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
```
class sum main
```java
package pertemuan5.Sum;
import java.util.Scanner;

public class mainSum{
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5,9)");
        System.out.println("Masukkan jumlah bulan: ");
        int elemen = sc19.nextInt();

        sum sm = new sum(elemen);
        System.out.println("==================================================");
        for(int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke- "+(i+1)+" = ");
            sm.keuntungan[i] = sc19.nextDouble();
        }
        System.out.println("==================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("==================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
```
contoh output
```
================================================
Program menghitung keuntungan total (satuan juta, misal 5,9)   
Masukkan jumlah bulan:
5
==================================================
Masukkan untung bulan ke- 1 = 
8,5
Masukkan untung bulan ke- 2 =
9,54
Masukkan untung bulan ke- 3 =
7,2
Masukkan untung bulan ke- 4 =
9,1
Masukkan untung bulan ke- 5 =
6
==================================================
Algoritma Brute Force
Total keuntungan perusahaan selama 5 bulan adalah = 40.339999999999996
==================================================
Algoritma Divide Conquer
Total keuntungan selama 5 bulan adalah = 40.34
```
pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
formulasi return lsum+rsum+arr[mid] pada method totalDC digunakan untk menggabungkan hasil perhitungan keuntungan dari sub masalah kiri(lsum), sub masalah kanan(rsum), dan sub masalah di bulan tengah keuntungan(arr[mid])
2. 2. Kenapa dibutuhkan variable mid pada method TotalDC()? untuk membagi rentang data keuntungan menjadi dua bagian sama besar
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program!
Package sumPerusahaan
class sumKeuntungan
```java
package pertemuan5.sumPerusahaan;

public class sumKeuntungan{
    int jumlahPerusahaan;
    sumPerusahaan[] perusahaan;

    public sumKeuntungan(int jumlahPerusahaan){
        this.jumlahPerusahaan = jumlahPerusahaan;
        this.perusahaan = new sumPerusahaan[jumlahPerusahaan];
    }

    double totalBF(double[][] arr){
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        return total;
    }

    double totalDC(double[][] arr, int l, int r){
        if (l == r) {
            return arr [l][0];
        } else if (l < r){
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid][0];
        }
        return 0;
    }
}
```
class sumPerusahaan
```java
package pertemuan5.sumPerusahaan;
public class sumPerusahaan{
    int elemen;
    double[] keuntungan;

    public sumPerusahaan(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }
}
```
class Main
```java
package pertemuan5.sumPerusahaan;
import java.util.Scanner;
public class sumPerusahaanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = scanner.nextInt();

        sumKeuntungan sumKeuntungan = new sumKeuntungan(jumlahPerusahaan);
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Masukkan jumlah bulan: ");
            int elemen = scanner.nextInt();
            sumKeuntungan.perusahaan[i] = new sumPerusahaan(elemen);

            for (int j = 0; j < elemen; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " (dalam juta (contoh 3,5)): ");
                sumKeuntungan.perusahaan[i].keuntungan[j] = scanner.nextDouble();
            }
        }

        System.out.println("==================================================");
        System.out.println("Algoritma Brute Force");
        double[][] keuntunganBF = new double[jumlahPerusahaan][];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            keuntunganBF[i] = sumKeuntungan.perusahaan[i].keuntungan;
        }
        System.out.println("Total keuntungan semua perusahaan dengan metode Brute Force: "
                + sumKeuntungan.totalBF(keuntunganBF));
        System.out.println("==================================================");

        System.out.println("Algoritma Divide Conquer");
        double[][] keuntunganDC = new double[jumlahPerusahaan][];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            keuntunganDC[i] = sumKeuntungan.perusahaan[i].keuntungan;
        }
        System.out.println("Total keuntungan semua perusahaan dengan metode Divide Conquer: "
                + sumKeuntungan.totalDC(keuntunganDC, 0, jumlahPerusahaan - 1));
        System.out.println("==================================================");

        scanner.close();
    }
}
```
contoh output
```
Masukkan jumlah perusahaan: 
2
Perusahaan ke-1
Masukkan jumlah bulan:
4
Masukkan untung bulan ke-1 (dalam juta (contoh 3,5)):
6,5
Masukkan untung bulan ke-2 (dalam juta (contoh 3,5)):
7,8
Masukkan untung bulan ke-3 (dalam juta (contoh 3,5)):
9,7
Masukkan untung bulan ke-4 (dalam juta (contoh 3,5)):
6
Perusahaan ke-2
Masukkan jumlah bulan:
2
Masukkan untung bulan ke-1 (dalam juta (contoh 3,5)):
6
Masukkan untung bulan ke-2 (dalam juta (contoh 3,5)):
5,7
==================================================
Algoritma Brute Force
Total keuntungan semua perusahaan dengan metode Brute Force: 41.7
==================================================
Algoritma Divide Conquer
Total keuntungan semua perusahaan dengan metode Divide Conquer: 12.5
==================================================
```

Latihan Praktikum
membuat showroom daftar mobil dan tentukan
a) top_acceleration tertinggi menggunakan Divide and Conquer!
b) top_acceleration terendah menggunakan Divide and Conquer!
c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force!

class showroomMobil
```java
package pertemuan5.LatihanPraktikum;

import javax.print.DocFlavor.STRING;

public class showroomMobil{
    private String merk;
    private String tipe;
    private int tahun;
    private int topAcceleration;
    private int topPower;

    public showroomMobil(String merk, String tipe, int tahun, int topAcceleration, int topPower){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }    

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getTopAcceleration(){
        return topAcceleration;
    }

    public void setTopAcceleration(int topAcceleration){
        this.topAcceleration = topAcceleration;
    }

    public int getTopPower(){
        return topPower;
    }

    public void setTopPower(int topPower){
        this.topPower = topPower;
    }

    public String toString(){
        return "Mobil{" +
        "merk='" + merk + '\'' +
        ", tipe='" + tipe + '\'' +
        ", tahun=" + tahun +
        ", topAcceleration=" + topAcceleration +
        ", topPower=" + topPower +
        '}';
    }
}
```
class main
``` java
package pertemuan5.LatihanPraktikum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<showroomMobil> mobilList = new ArrayList<>();

        mobilList.add(new showroomMobil("BMW", "M2 Coupe", 2016, 6816, 728));
        mobilList.add(new showroomMobil("Ford", "Fiesta ST", 2014, 3921, 575));
        mobilList.add(new showroomMobil("Nissan", "370Z", 2009, 4360, 657));
        mobilList.add(new showroomMobil("Subaru", "BRZ", 2014, 4058, 609));
        mobilList.add(new showroomMobil("Subaru", "Impreza WRX STI", 2013, 6255, 703));
        mobilList.add(new showroomMobil("Toyota", "AE86 Trueno", 1986, 3700, 553));
        mobilList.add(new showroomMobil("Toyota", "86/GT86", 2014, 4180, 609));
        mobilList.add(new showroomMobil("Volkswagen", "Golf GTI", 2014, 4180, 631));

        // Mencari top acceleration tertinggi menggunakan Divide and Conquer
        int topAccelerationTertinggi = findTopAccelerationTertinggi(mobilList);
        System.out.println("Top acceleration tertinggi: " + topAccelerationTertinggi);

        // Mencari top acceleration terendah menggunakan Divide and Conquer
        int topAccelerationTerendah = findTopAccelerationTerendah(mobilList);
        System.out.println("Top acceleration terendah: " + topAccelerationTerendah);

        // Mencari rata-rata top power menggunakan Brute Force
        int rataRataTopPower = findRataRataTopPower(mobilList);
        System.out.println("Rata-rata top power: " + rataRataTopPower);
    }

    private static int findTopAccelerationTertinggi(List<showroomMobil> mobilList) {
        if (mobilList.size() == 1) {
            return mobilList.get(0).getTopAcceleration();
        }

        int mid = mobilList.size() / 2;
        int kiri = findTopAccelerationTertinggi(mobilList.subList(0, mid));
        int kanan = findTopAccelerationTertinggi(mobilList.subList(mid, mobilList.size()));
        
        return Math.max(kiri, kanan);
    }

    private static int findTopAccelerationTerendah(List<showroomMobil> mobilList) {
        if (mobilList.size() == 1) {
            return mobilList.get(0).getTopAcceleration();
        }

        int mid = mobilList.size() / 2;
        int kiri = findTopAccelerationTerendah(mobilList.subList(0, mid));
        int kanan = findTopAccelerationTerendah(mobilList.subList(mid, mobilList.size()));
        
        return Math.min(kiri, kanan);
    }

    private static int findRataRataTopPower(List<showroomMobil> mobilList) {
        int totalPower = 0;
        for (showroomMobil mobil : mobilList) {
            totalPower += mobil.getTopPower();
        }
        return totalPower / mobilList.size();
    }
}
```