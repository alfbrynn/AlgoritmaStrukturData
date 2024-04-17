Laporan Uts Algoritma Struktur Data

```java
public class Data_19 {
    private int nilai;

    public Data_19(int nilai) {
        this.nilai = nilai;
    }

    public int ambilNilai() {
        return nilai;
    }

}

```java
public class PengurutanDanPencarian_19 {
    Data_19[] data;

    public PengurutanDanPencarian_19(Data_19[] initialData) {
        this.data = initialData;  
    }

    void selectionSortAsc() {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].ambilNilai() < data[minIndex].ambilNilai()) {
                    minIndex = j;
                }
            }
            Data_19 temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    void selectionSortDesc() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].ambilNilai() > data[maxIndex].ambilNilai()) {
                    maxIndex = j;
                }
            }
            Data_19 temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    int sequentialSearch(int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].ambilNilai() == key) {
                return i;
            }
        }
        return -1;  // key tidak ditemukan
    }

    int binarySearch(int key, boolean ascending) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid].ambilNilai() == key) {
                return mid;
            } else if ((data[mid].ambilNilai() < key && ascending) || (data[mid].ambilNilai() > key && !ascending)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // key tidak ditemukan
    }

    void CetakArray() {
        for (Data_19 value : data) {
            System.out.print(value.ambilNilai() + " ");
        }
        System.out.println();
    }
}

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);

        // Pengisian data ke dalam array of objek
        Data_19[] arrayData = new Data_19[17];
        arrayData[0] = new Data_19(22);
        arrayData[1] = new Data_19(27);
        arrayData[2] = new Data_19(0);
        arrayData[3] = new Data_19(27);
        arrayData[4] = new Data_19(37);
        arrayData[5] = new Data_19(2);
        arrayData[6] = new Data_19(22);
        arrayData[7] = new Data_19(14);
        arrayData[8] = new Data_19(47);
        arrayData[9] = new Data_19(50);
        arrayData[10] = new Data_19(48);
        arrayData[11] = new Data_19(37);
        arrayData[12] = new Data_19(9);
        arrayData[13] = new Data_19(41);
        arrayData[14] = new Data_19(45);
        arrayData[15] = new Data_19(41);
        arrayData[16] = new Data_19(44);

        PengurutanDanPencarian_19 sortingSearching = new PengurutanDanPencarian_19(arrayData);

        System.out.println("========= Pencarian dan Pengurutan Data =========");
        System.out.println("Program ini akan mencari sebuah nilai yang Anda masukkan dalam array.");

        System.out.print("Masukkan angka yang ingin Anda cari(salah satu dari : 22, 27, 0, 27, 37, 2, 22, 14, 47, 50, 48, 37, 9, 41, 45, 41, 44): ");
        int key = sc19.nextInt();

        int indexBeforeSort = sortingSearching.sequentialSearch(key);
        String resultBeforeSort = (indexBeforeSort != -1) ? "ditemukan pada index " + indexBeforeSort : "tidak ditemukan";

        sortingSearching.selectionSortAsc();
        int indexAfterSortAsc = sortingSearching.binarySearch(key, true);
        String resultAfterSortAsc = (indexAfterSortAsc != -1) ? "ditemukan pada index " + indexAfterSortAsc : "tidak ditemukan";

        sortingSearching.selectionSortDesc();
        int indexAfterSortDesc = sortingSearching.binarySearch(key, false);
        String resultAfterSortDesc = (indexAfterSortDesc != -1) ? "ditemukan pada index " + indexAfterSortDesc : "tidak ditemukan";
        
        System.out.println("\n======== Nilai dalam Array ========");
        sortingSearching.selectionSortAsc(); 
        System.out.print("Data Setelah pengurutan Ascending: ");
        sortingSearching.CetakArray(); 
        sortingSearching.selectionSortDesc(); 
        System.out.print("Data Setelah pengurutan Descending: ");
        sortingSearching.CetakArray(); 

        System.out.println("\n========= Hasil Pencarian =========");
        System.out.println("Sebelum pengurutan: " + resultBeforeSort);
        System.out.println("Setelah pengurutan Ascending: " + resultAfterSortAsc);
        System.out.println("Setelah pengurutan Descending: " + resultAfterSortDesc);

        System.out.println("\nTerima kasih telah menggunakan program ini!");
    }
}
```

contoh output
```java
========= Pencarian dan Pengurutan Data =========
Program ini akan mencari sebuah nilai yang Anda masukkan dalam array.
Masukkan angka yang ingin Anda cari(salah satu dari : 22, 27, 0, 27, 37, 2, 22, 14, 47, 50, 48, 37, 9, 41, 45, 41, 44): 44

======== Nilai dalam Array ========
Data Setelah pengurutan Ascending: 0 2 9 14 22 22 27 27 37 37 41 41 44 45 47 48 50
Data Setelah pengurutan Descending: 50 48 47 45 44 41 41 37 37 27 27 22 22 14 9 2 0 

========= Hasil Pencarian =========
Sebelum pengurutan: ditemukan pada index 16
Setelah pengurutan Ascending: ditemukan pada index 12
Setelah pengurutan Descending: ditemukan pada index 4

Terima kasih telah menggunakan program ini!

