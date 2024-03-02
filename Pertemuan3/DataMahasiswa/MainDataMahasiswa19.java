package Pertemuan3.DataMahasiswa;
import java.util.Scanner;

public class MainDataMahasiswa19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa = 3;

        DataMahasiswa19 dataMhs = new DataMahasiswa19(jumlahMahasiswa);

        for(int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            dataMhs.inputDataMahasiswa(sc, i);
        }

        dataMhs.tampilDataMahasiswa();
    }
}
