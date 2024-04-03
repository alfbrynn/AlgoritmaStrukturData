package Pertemuan8;
import java.io.StringReader;
import java.util.Scanner;
class Main19 {

    public static void main(String[] args) {
        // instansiasi objek bernama gudang dengan nilai parameternya 7
        Gudang19 gudang = new Gudang19(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. tambah barang");
            System.out.println("2. ambil barang");
            System.out.println("3. tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.println("Pilih operasi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori");
                    String kategori = scanner.nextLine();
                    Barang19 barangBaru = new Barang19(kode, nama , kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}