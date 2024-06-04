import java.util.Scanner;

public class Main_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList vaccineQueue = new DoubleLinkedList();

        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("        PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("Nomor Antrian: ");
                    int queueNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Nama Penerima: ");
                    String name = scanner.nextLine();
                    vaccineQueue.addPerson(queueNumber, name);
                    break;
                case 2:
                    Node removedPerson = vaccineQueue.removePerson();
                    if (removedPerson != null) {
                        System.out.println(removedPerson.name + " telah selesai divaksinasi.");
                    } else {
                        System.out.println("Antrian kosong, tidak ada data yang dapat dihapus.");
                    }
                    break;
                case 3:
                    System.out.println("Daftar Penerima Vaksin:");
                    vaccineQueue.printQueue();
                    System.out.println("Jumlah antrian tersisa: " + vaccineQueue.getQueueSize());
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}