package pertemuan6.BubbleSelectionInsertion;

public class Mahasiswa{
    String nama;
    int thnMsk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMsk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun masuk: "+thnMsk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}