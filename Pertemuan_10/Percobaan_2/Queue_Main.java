package Pertemuan_10.Percobaan_2;

import java.util.Scanner;

public class Queue_Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua atrian");
        System.out.println("5. Keluar");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc19.nextInt();

        Queue Q = new Queue(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc19.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sa.nextLine();
                    System.out.print("Nama : ");
                    String nama = sa.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sa.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc19.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc19.nextDouble();
                    Nasabah19 nb = new Nasabah19(norek, nama, alamat, umur, saldo);
                    Q.enqueue(nb);
                    break;
                case 2:
                    Nasabah19 data = Q.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}