JOBSHEET II

Nama: Muhammad Alif Ferbiansyah
Nim: 2341720025

Percobaan 1

```public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
```
Pertanyaan
1. Sebutkan dua karakteristik class atau object!
Encapsulation (Inkapsulasi): Menggabungkan data dan metode terkait dalam satu kesatuan.
Inheritance (Pewarisan): Kemampuan suatu class untuk mewarisi sifat dan ciri dari class lain.
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class 
Buku? Sebutkan apa saja atributnya!
Ada 5 atribut yaitu judul, pengarang, halaman, stok, harga
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! 
Memiliki 4 method yaitu tampilInformasi(), terjual(int), restock(int), gantiHarga(int)
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut 
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
```java
public void terjual(int jml) {
  if (stok > 0) {
    if (jml <= stok) {
      stok -= jml;
    } else {
      System.out.println("Stok tidak cukup!");
    }
  } else {
    System.out.println("Stok buku habis!");
  }
}
```
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
Method restock(int) memiliki satu parameter int untuk menentukan jumlah buku yang ingin ditambahkan. Hal ini memungkinkan pengguna untuk menentukan berapa banyak stok yang ingin di restock.
6. Commit dan push kode program ke Github

Percobaan 2
```java
public class BukuMain19 {
    public static void main(String []args){
        Buku19 bk1 =new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga =71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    }
}
```
Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! 
```java
Buku19 bk1 =new Buku19();
```
Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek? 
Atribut: 
object.namaAtribut: Contohnya, bk1.judul untuk mengakses atribut judul dari object bk1.
Method: 
object.namaMethod(parameter); Contohnya, bk1.tampilInformasi() untuk memanggil method tampilInformasi() dari object bk1.
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
Perbedaan output pada pemanggilan pertama dan kedua tampilInformasi() disebabkan oleh perubahan nilai atribut stok dan harga setelah method terjual() dan gantiHarga() dipanggil.
Pemanggilan pertama: Menampilkan nilai awal atribut stok dan harga.
Pemanggilan kedua: Menampilkan nilai stok yang berkurang setelah terjual() dan nilai harga yang berubah setelah gantiHarga().
Percobaan 3
```java
public class BukuMain19 {
    public static void main(String []args){
        Buku19 bk1 =new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga =71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
```

Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk 
mendeklarasikan konstruktor berparameter!

```java
public Buku19(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
```
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut? pada baris tersebut melakukan instansi objek baru yang bernama bk2 dengan memberikan nilai ke parameter konstruktor
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian! Hasilnya eror karena saat konstruktor dihapus, tidak ada cara untuk membuat objek baru dari class Buku19 tanpa memberikan nilai awal untuk semua atribut.
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses 
secara berurutan? Jelaskan alasannya! tidak harus berurutan karena urutan akses method tidak memengaruhi logika program.
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor 
berparameter dari class Buku!
```java
Buku19 bk3 = new Buku19("Muhammad Alif Febriansyah", "Alif", 30, 20, 10000);
        bk3.terjual(10);
        bk3.tampilInformasi();
```
6. Commit dan push kode program ke Github

Latihan Praktikum
Soal
1. Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(), 
hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:
o Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan 
perkalian antara harga dengan jumlah buku yang terjual
o Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan berikut:
▪ Jika harga total lebih dari 150000, maka harga didiskon sebesar 12%
▪ Jika harga total antara 75000 sampai 150000, maka harga didiskon sebesar 5%
▪ Jika harga total kurang dari 75000, maka harga tidak didiskon
o Method hitungHargaBayar() digunakan untuk menghitung harga total setelah dikurangi 
diskon
Class diagram Buku setelah penambahan ketiga method tersebut adalah sebagai berikut.
Buku
judul: String
pengarang: String
halaman: int
stok: int
harga: int
tampilInformasi(): void
terjual(jml: int): void
restock(n: int): void
gantiHarga(hrg: int): int
hitungHargaTotal(): int
hitungDiskon(): int
hitungHargaBayar(): int 
Buku
```java
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    //void terjual(int jml) {
    //    stok -= jml;
    //}

    public void terjual(int jml) {
        if (stok > 0) {
          if (jml <= stok) {
            stok -= jml;
          } else {
            System.out.println("Jumlah yang terjual melebihi stok");
          }
        } else {
          System.out.println("Stok buku habis");
        }
      }
      
    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku19() {

    }

    public Buku19(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public int hitungHargaTotal(int jml) {
        return jml * harga;
    }

    public int hitungDiskon(int total) {
        int diskon = 0;
        if (total > 150000) {
            diskon = total * 12 /100;
        } else if (total >= 75000) {
            diskon = total * 5 / 100;
        }
        return diskon;
    }

    public int hitungHargaBayar(int total, int diskon) {
        return total - diskon;
    }
}
```
Buku Main
```java
public class BukuMain19 {
    public static void main(String []args){
        Buku19 bk1 =new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga =71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku19 bk3 = new Buku19("Muhammad Alif Febriansyah", "Alif", 30, 20, 10000);
        bk3.terjual(10);
        bk3.tampilInformasi();

        Buku19 buku = new Buku19("Laskar Pelangi", "Andrea Hirata", 529, 10, 85000);

        int jmlTerjual = 5;
        int totalHarga = buku.hitungHargaTotal(jmlTerjual);
        int diskon = buku.hitungDiskon(totalHarga);
        int hargaBayar = buku.hitungHargaBayar(totalHarga, diskon);

        System.out.println("Jumlah terjual: " + jmlTerjual);
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);

    }
}
```
contoh output
```
judul: Today Ends Tomorrow Comes
Pengarang: Denanda Pratiwi
Jumlah halaman: 198
Sisa stok: 13
Harga: Rp 71000
judul: Today Ends Tomorrow Comes
Pengarang: Denanda Pratiwi
Jumlah halaman: 198
Sisa stok: 8
Harga: Rp 60000
judul: Self Reward
Pengarang: Maheera Ayesha
Jumlah halaman: 160
Sisa stok: 18
judul: Muhammad Alif Febriansyah
Pengarang: Alif
Jumlah halaman: 30
Sisa stok: 10
Harga: Rp 10000
Jumlah terjual: 5
Total harga: Rp 425000
Diskon: Rp 51000
Harga bayar: Rp 374000
```
2. Buat program berdasarkan class diagram berikut ini!
Dragon
x: int
y: int
width: int
height: int
moveLeft(): void
moveRight(): void
moveUp(): void
moveDown(): void
printPosition(): void
detectCollision(x: int, y: int): void
Penjelasan dari atribut dan method pada class Dragon tersebut adalah sebagai berikut:
• Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari dragon, sedangkan 
atribut y untuk posisi koordinat y (vertikal)
• Atribut width digunakan untuk menyimpan lebar dari area permainan, sedangkan height
untuk menyimpan panjang area
• Method moveLeft() digunakan untuk mengubah posisi dragon ke kiri (koordinat x akan 
berkurang 1), sedangkan moveRight() untuk bergerak ke kanan (koordinat x akan bertambah 
1). Perlu diperhatikan bahwa koordinat x tidak boleh lebih kecil dari 0 atau lebih besar dari 
nilai width. Jika koordinat x < 0 atau x > width maka panggil method detectCollision()
• Method moveUp() digunakan untuk mengubah posisi dragon ke atas (koordinat y akan 
berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 
1). Perlu diperhatikan bahwa koordinat y tidak boleh lebih kecil dari 0 atau lebih besar dari 
nilai height. Jika koordinat y < 0 atau y > height maka panggil method detectCollision()
• Method detectCollision() akan mencetak pesan “Game Over” apabila dragon menyentuh 
ujung area permainan
Dragon
```java
public class Dragon19 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon19(int width, int height) {
        this.width = width;
        this.height = height;
        x = width / 2;
        y = height / 2;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width - 1) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height - 1) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}
```
Main Dragon
```java
public class MainDragon19 {
    public static void main(String[] args) {
        Dragon19 dragon = new Dragon19(12, 20); 
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveDown();
    }
}
```
contoh output
```
Position: (4, 5)
Position: (4, 4)
Position: (5, 4)
Position: (5, 5)
```