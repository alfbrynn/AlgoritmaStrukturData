JOBSHEET 1
KONSEP DASAR PEMROGRAMAN

Muhammad ALif Febriansyah_2341720025

Praktikum
1. Pemilihan
Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai 
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan 
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan diluar rentang tersebut maka 
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya 
lakukan konversi nilai dengan ketentuan sebagai berikut:
Jika Nilai Huruf yang didapatkan adalah A,B+,B+C+,C maka LULUS, jika nilai huruf D dan E 
maka TIDAK LULUS.
• Input dari program berupa komponen nilai tugas,kuis, UTS, UAS
• Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
• Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan 
LULUS/TIDAK LULUS
```java
import java.util.Scanner;

public class NilaiMahasiswa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        boolean isValid = true; 

        System.out.print("Masukkan nilai tugas (0-100): ");
        nilaiTugas = input.nextDouble();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai kuis (0-100): ");
        nilaiKuis = input.nextDouble();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai UTS (0-100): ");
        nilaiUTS = input.nextDouble();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai UAS (0-100): ");
        nilaiUAS = input.nextDouble();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            isValid = false;
        }

        if (!isValid) {
            System.out.println("\n-----------------------------------------");
            System.out.println("Nilai tidak valid.");
            System.out.println("Silakan masukkan nilai antara 0-100.");
        } else {
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) ? "LULUS" : "TIDAK LULUS";

            System.out.println("\n-----------------------------------------");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        }

        input.close();
    }
}
```
contoh output
```
Masukkan nilai tugas (0-100): 43
Masukkan nilai kuis (0-100): 45
Masukkan nilai UTS (0-100): 65
Masukkan nilai UAS (0-100): 77

-----------------------------------------
Nilai Akhir: 67.9
Nilai Huruf: B
Keterangan: LULUS
```
2. Perulangan 
Soal
Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n kecuali 
angka 6 dan 10, angka ganjil dicetak dengan asterik “*”, angka genap dicetak sesuai bilangan 
aslinya, dengan n = 2 digit terakhir NIM anda. 
*bila n<10 maka tambahkan 10 (n+=10)
Contoh:
Input NIM: 2341720102 maka n=12
OUTPUT : * 2 * 4 * * 8 * * 12
Contoh 2:
Input NIM: 2341720113 maka n=13
OUTPUT : * 2 * 4 * * 8 * * 12
```java
import java.util.Scanner;

public class PerulanganNimMahasiswa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = input.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2)); 
        if (n < 10) {
            n += 10; 
        }

        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) { 
                if (i % 2 == 0) { 
                    System.out.print(i + " ");
                } else { 
                    System.out.print("* ");
                }
            }
        }

        input.close();
    }
}
```
contoh output
```
Input NIM: 2341720102
OUTPUT: * 2 * 4 * * 8 * * 12 
Input NIM: 2341720025
OUTPUT: * 2 * 4 * * 8 * * 12 * 14 * 16 * 18 * 20 * 22 * 24 * 
```

3. Array
Soal
Buatlah program untuk menghitung IP Semester dari matakuliah yang Anda tempuh 
semester lalu. Formula untuk menghitung IP semester sebagai berikut : 
𝐼𝑃 𝑆𝑒𝑚𝑒𝑠𝑡𝑒𝑟 =
∑𝑖(𝑁𝑖𝑙𝑎𝑖 𝑆𝑒𝑡𝑎𝑟𝑎𝑖 ∗ 𝑏𝑜𝑏𝑜𝑡 𝑆𝐾𝑆𝑖)
∑ 𝑆𝐾𝑆
Nilai setara didapatkan dari tabel konversi berikut ini : 
Input dari program berupa nama matakuliah, bobot SKS, serta nilai huruf dari matakuliah 
tersebut
```java
import java.util.Scanner;

public class ArrayMenghitungIp19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan nama mata kuliah
        String[] namaMatKul = {
            "Pancasila",
            "KTI",
            "CTPS",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Daspro",
            "Praktikum Daspro",
            "K3"
        };

        int[] nilaiAngka = new int[namaMatKul.length];

        double[] bobotNilai = new double[namaMatKul.length];

        double totalSKS = 0;
        double totalNilaiBobot = 0;
        for (int i = 0; i < namaMatKul.length; i++) {
            System.out.print("Masukkan nilai " + namaMatKul[i] + ": ");
            nilaiAngka[i] = input.nextInt();

            bobotNilai[i] = konversiNilaiAngka(nilaiAngka[i]);

            totalSKS++;
            totalNilaiBobot += bobotNilai[i];
        }

        double ipkSemester = totalNilaiBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("---------------------");
        System.out.printf("| %-20s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Bobot Nilai");
        System.out.println("---------------------");
        for (int i = 0; i < namaMatKul.length; i++) {
            System.out.printf("| %-20s | %-10d | %-10.2f |\n", namaMatKul[i], nilaiAngka[i], bobotNilai[i]);
        }
        System.out.println("---------------------");
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Total Nilai Bobot: " + totalNilaiBobot);
        System.out.printf("IP Semester: %.2f\n", ipkSemester);
    }

    private static double konversiNilaiAngka(int nilaiAngka) {
        double bobotNilai;
        if (nilaiAngka >= 85) {
            bobotNilai = 4.0;
        } else if (nilaiAngka >= 80) {
            bobotNilai = 3.5;
        } else if (nilaiAngka >= 75) {
            bobotNilai = 3.0;
        } else if (nilaiAngka >= 70) {
            bobotNilai = 2.5;
        } else if (nilaiAngka >= 65) {
            bobotNilai = 2.0;
        } else if (nilaiAngka >= 55) {
            bobotNilai = 1.5;
        } else {
            bobotNilai = 0.0;
        }
        return bobotNilai;
    }
}

```
contoh output
```
Masukkan nilai Pancasila: 87
Masukkan nilai KTI: 89
Masukkan nilai CTPS: 87
Masukkan nilai Matematika Dasar: 67
Masukkan nilai Bahasa Inggris: 78
Masukkan nilai Daspro: 98
Masukkan nilai Praktikum Daspro: 76
Masukkan nilai K3: 45

Hasil Konversi Nilai
---------------------
| Mata Kuliah          | Nilai Angka | Bobot Nilai |
---------------------
| Pancasila            | 87         | 4,00       |
| KTI                  | 89         | 4,00       |
| CTPS                 | 87         | 4,00       |
| Matematika Dasar     | 67         | 2,00       |
| Bahasa Inggris       | 78         | 3,00       |
| Daspro               | 98         | 4,00       |
| Praktikum Daspro     | 76         | 3,00       |
| K3                   | 45         | 0,00       |
---------------------
Total SKS: 8.0
Total Nilai Bobot: 24.0
IP Semester: 3,00
```

Fungsi 
Soal
RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bunga[] bunga yang dijual selalu dicatat dengan rincian seperti berikut ini:
Baris = Cabang Toko, Kolom = Stock bunga pada hari x
 Aglonema Keladi Alocasia Mawar 
RoyalGarden 1 10 5 15 7
RoyalGarden 2 6 11 9 12
RoyalGarden 3 2 10 10 5
RoyalGarden 4 5 7 12 9
Rincian Harga Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000.
1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis 
terjual.
2. Buatlah fungsi untuk mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden 
4. Jika terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati. 
Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.
```java
public class FungsiRoyalGarden19 {
    private static final double HargaAglonema = 75000;
    private static final double HargaKeladi = 50000;
    private static final double HargaAlocasia = 60000;
    private static final double HargaMawar = 10000;

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 11, 10, 7},
            {15, 9, 0, 12, 5},
            {9, 0, 15, 6, 12}, 
            {2, 5, 0, 0, 9},
            {5, 0, 0, 0, 6}
        };

        for (int i = 0; i < stok.length; i++) {
            double TotalPendapatan = hitungTotalPendapatan(stok[i]);
            System.out.println("Pendapatan Cabang Royal Garden " + (i + 1) + " : " + TotalPendapatan);
            System.out.println("Jumlah stok Cabang Royal Garden " + (i + 1) + ":");
            printstok(stok[i]);
        }

        reducestok(stok, 1, 1); 
        reducestok(stok, 2, 2); 
        reducestok(stok, 3, 0); 
        reducestok(stok, 4, 3);

        System.out.println("\nSetelah pengurangan stok karena bunga mati: ");
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Jumlah stok Cabang Royal Garden " + (i + 1) + " : ");
            printstok(stok[i]);
        }
    }

    private static double hitungTotalPendapatan(int[] branchstok) {
        double TotalPendapatan = 0;
        int[] stok = branchstok.clone();
        for (int i = 0; i < stok.length; i++) {
            if (stok[i] > 0) {
                switch (i) {
                    case 0:
                        TotalPendapatan += stok[i] * HargaAglonema;
                        break;
                    case 1:
                        TotalPendapatan += stok[i] * HargaKeladi;
                        break;
                    case 2:
                        TotalPendapatan += stok[i] * HargaAlocasia;
                        break;
                    case 3:
                        TotalPendapatan += stok[i] * HargaMawar;
                        break;
                }
                stok[i] = 0;
            }
        }
        return TotalPendapatan;
    }

    private static void printstok(int[] stok) {
        System.out.println("Aglonema: " + stok[0]);
        System.out.println("Keladi: " + stok[1]);
        System.out.println("Alocasia: " + stok[2]);
        System.out.println("Mawar: " + stok[3]);
        System.out.println();
    }

    private static void reducestok(int[][] stok, int branchIndex, int flowerIndex) {
        if (branchIndex >= 1 && branchIndex <= stok.length && flowerIndex >= 0 && flowerIndex < stok[branchIndex - 1].length) {
            int reduction = 0;
            switch (flowerIndex) {
                case 0:
                    reduction = 1; 
                    break;
                case 1:
                    reduction = 2; 
                    break;
                case 2:
                    reduction = 0; 
                    break;
                case 3:
                    reduction = 5; 
                    break;
            }
            stok[branchIndex - 1][flowerIndex] -= reduction;
        }
    }
}
```
output
```
Pendapatan Cabang Royal Garden 1 : 1760000.0
Jumlah stok Cabang Royal Garden 1:
Aglonema: 10
Keladi: 5
Alocasia: 11
Mawar: 10

Pendapatan Cabang Royal Garden 2 : 1695000.0
Jumlah stok Cabang Royal Garden 2:
Aglonema: 15
Keladi: 9
Alocasia: 0
Mawar: 12

Pendapatan Cabang Royal Garden 3 : 1635000.0
Jumlah stok Cabang Royal Garden 3:
Aglonema: 9
Keladi: 0
Alocasia: 15
Mawar: 6

Pendapatan Cabang Royal Garden 4 : 400000.0
Jumlah stok Cabang Royal Garden 4:
Aglonema: 2
Keladi: 5
Alocasia: 0
Mawar: 0

Pendapatan Cabang Royal Garden 5 : 375000.0
Jumlah stok Cabang Royal Garden 5:
Aglonema: 5
Keladi: 0
Alocasia: 0
Mawar: 0


Setelah pengurangan stok karena bunga mati:
Jumlah stok Cabang Royal Garden 1 :
Aglonema: 10
Keladi: 3
Alocasia: 11
Mawar: 10

Jumlah stok Cabang Royal Garden 2 :
Aglonema: 15
Keladi: 9
Alocasia: 0
Mawar: 12

Jumlah stok Cabang Royal Garden 3 :
Aglonema: 8
Keladi: 0
Alocasia: 15
Mawar: 6

Jumlah stok Cabang Royal Garden 4 :
Aglonema: 2
Keladi: 5
Alocasia: 0
Mawar: -5

Jumlah stok Cabang Royal Garden 5 :
Aglonema: 5
Keladi: 0
Alocasia: 0
Mawar: 0
```
Tugas 1
Soal
Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array 
pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array 
dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. 
Ilustrasi tampilan array tersebut adalah sebagai berikut :
 
Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan 
nama kota dari kode plat nomor tersebut.
```java
import java.util.Scanner;

public class KodePlatMobil19 {
   public static void main(String[] args) {
       char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
       char[][] KOTA = {
           {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
           {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
           {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
           {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
           {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
           {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
           {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
           {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
           {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
           {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
       };

       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan kode plat mobil: ");
       char input = scanner.next().toUpperCase().charAt(0);
       scanner.close();

       int index = -1;
       for (int i = 0; i < KODE.length; i++) {
           if (KODE[i] == input) {
               index = i;
               break;
           }
       }

       if (index != -1) {
           System.out.println("Kota: " + String.valueOf(KOTA[index]));
       } else {
           System.out.println("Kode plat mobil tidak ditemukan.");
       }
   }
}
```
```
output
Masukkan kode plat mobil: N
Kota: MALANG
Masukkan kode plat mobil: D
Kota: BANDUNG
```
tugas 2
soal
Buat program untuk menghitung rumus kecepatan, jarak, dan waktu
Berikut adalah persamaan untuk menghitung rumus tersebut :
Rumus Kecepatan
𝑣 =
𝑠
𝑡
Rumus Jarak
𝑠 = 𝑣.𝑡
Rumus Waktu
𝑡 =
𝑠
𝑣
Keterangan :
𝑣 = 𝑘𝑒𝑐𝑒𝑝𝑎𝑡𝑎𝑛
𝑠 = 𝑗𝑎𝑟𝑎𝑘
𝑡 = 𝑤𝑎𝑘𝑡𝑢
Jurusan Teknologi Informasi-Politeknik Negeri Malang
a. Menu (Untuk memilih rumus yang akan dihitung (kecepatan/jarak/waktu))
b. Menghitung hasil perhitungan Kecepatan
c. Menghitung hasil perhitungan Jarak
d. Menghitung hasil perhitungan Waktu
Panggil fungsi-fungsi tersebut pada fungsi main!
fungsi main
```java
import java.util.Scanner;

public class RumusMain19 {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int pilihan;

       do {
           System.out.println("Pilih rumus yang akan dihitung:");
           System.out.println("1. Kecepatan");
           System.out.println("2. Jarak");
           System.out.println("3. Waktu");
           System.out.println("4. Keluar");
           System.out.print("Masukkan pilihan Anda: ");
           pilihan = scanner.nextInt();

           switch (pilihan) {
               case 1:
                   Kecepatan19.kecepatanMenu(scanner);
                   break;
               case 2:
                   Jarak19.jarakMenu(scanner);
                   break;
               case 3:
                   Waktu19.waktuMenu(scanner);
                   break;
               case 4:
                   System.out.println("Terima kasih!");
                   break;
               default:
                   System.out.println("Pilihan tidak valid. Silakan coba lagi.");
           }
       } while (pilihan != 4);

       scanner.close();
   }
}
```
fungsi kecepatan
```java
import java.util.Scanner;

public class Kecepatan19 {

   public static void kecepatanMenu(Scanner scanner) {
       System.out.print("Masukkan jarak (s): ");
       double s = scanner.nextDouble();
       System.out.print("Masukkan waktu (t): ");
       double t = scanner.nextDouble();
       double hasil = kecepatan(s, t);
       System.out.printf("Hasil kecepatan (v) adalah: %.2f\n", hasil);
   }

   public static double kecepatan(double s, double t) {
       return s / t;
   }
}
```
fungsi jarak
```java
import java.util.Scanner;

public class Jarak19 {

   public static void jarakMenu(Scanner scanner) {
       System.out.print("Masukkan kecepatan (v): ");
       double v = scanner.nextDouble();
       System.out.print("Masukkan waktu (t): ");
       double t = scanner.nextDouble();
       double hasil = jarak(v, t);
       System.out.printf("Hasil jarak (s) adalah: %.2f\n", hasil);
   }

   public static double jarak(double v, double t) {
       return v * t;
   }
}
```
fungsi waktu
```java
import java.util.Scanner;

public class Waktu19 {

   public static void waktuMenu(Scanner scanner) {
       System.out.print("Masukkan kecepatan (v): ");
       double v = scanner.nextDouble();
       System.out.print("Masukkan jarak (s): ");
       double s = scanner.nextDouble();
       double hasil = waktu(v, s);
       System.out.printf("Hasil waktu (t) adalah: %.2f\n", hasil);
   }

   public static double waktu(double v, double s) {
       return s / v;
   }
}
```
contoh output
```
Pilih rumus yang akan dihitung:
1. Kecepatan
2. Jarak
3. Waktu
4. Keluar
Masukkan pilihan Anda: 1
Masukkan jarak (s): 23
Masukkan waktu (t): 43
Hasil kecepatan (v) adalah: 0,53
Pilih rumus yang akan dihitung:
1. Kecepatan
2. Jarak
3. Waktu
4. Keluar
Masukkan pilihan Anda: 4
Terima kasih!
```









