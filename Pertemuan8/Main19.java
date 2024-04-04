package Pertemuan8;
import java.io.StringReader;
import java.util.Scanner;
class Main19 {

    public static void main(String[] args) {
        // instansiasi objek bernama gudang dengan nilai parameternya 7
        // Gudang19 gudang = new Gudang19(7);
        // inputan jumlah kapasitas tumpukan
        Scanner sc19 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas yang di inginkan: ");
        int kapasitas = sc19.nextInt();
        Gudang19 gudang = new Gudang19(kapasitas);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. tambah barang");
            System.out.println("2. ambil barang");
            System.out.println("3. tampilkan tumpukan barang");
            // pertanyaan 4 percobaan 1 menambahkan tumpukan barang teratas
            System.out.println("4. tampilkan tumpukan barang teratas");
            System.out.println("5. lihat barang terbawah");
            System.out.println("6. cari barang");
            System.out.println("7. keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang19 barangBaru = new Barang19(kode, nama , kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                // untuk menampilkan barang teratas
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Cari berdasarkan.");
                    System.out.println("1. kode barang");
                    System.out.println("2. nama barang");
                    System.out.print("Pilih kriteria pencarian: ");
                    int kriteria = scanner.nextInt();
                    scanner.nextLine();
                    switch (kriteria) {
                        case 1:
                            System.out.print("Masukkan kode barang yang ingin dicari: ");
                            int kodeCari = scanner.nextInt();
                            gudang.cariBarang(kodeCari);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang yang dicari: ");
                            String namaCari = scanner.nextLine();
                            gudang.cariBarang(namaCari);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}