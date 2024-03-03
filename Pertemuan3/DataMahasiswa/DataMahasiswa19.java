package Pertemuan3.DataMahasiswa;

import java.util.Scanner;

public class DataMahasiswa19 {
    private String[] nama;
    private String[] nim;
    private char[] jenisKelamin;
    private double[] Ipk;

    public DataMahasiswa19(int jumlahMahasiswa){
        nama = new String[jumlahMahasiswa];
        nim = new String[jumlahMahasiswa];
        jenisKelamin = new char[jumlahMahasiswa];
        Ipk = new double[jumlahMahasiswa];
    }

    public void inputDataMahasiswa(Scanner sc, int i){
        System.out.print("Masukkan nama: ");
        nama[i] = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim[i] = sc.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenisKelamin[i] = sc.nextLine().charAt(0);
        System.out.print("Masukkan Ipk: ");
        Ipk[i] = sc.nextDouble();
        sc.nextLine();
    }

    public void tampilDataMahasiswa(){
        for(int i = 0; i < nama.length; i++){
            System.out.println("Data mahasiswa ke- " + (i + 1));
            System.out.println("nama: " + nama[i]);
            System.out.println("nim: " + nim[i]);
            System.out.println("jenis kelamin: " + jenisKelamin[i]);
            System.out.println("nilai IPK: " + Ipk[i]);
        }
    }
}