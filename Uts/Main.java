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