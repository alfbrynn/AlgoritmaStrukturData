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