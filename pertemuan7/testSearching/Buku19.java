package pertemuan7.testSearching;
public class Buku19{
    // atribut class Buku19
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    // kontruktor Buku19 dengan parameter
    public Buku19(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    // method tampilDataBuku tipe void
    public void tampilDataBuku(){
        System.out.println("========================");
        System.out.println("Kode buku: "+kodeBuku);
        System.out.println("Judul buku: "+judulBuku);
        System.out.println("Tahun terbit: "+tahunTerbit);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Stock: "+stock);
    }
}