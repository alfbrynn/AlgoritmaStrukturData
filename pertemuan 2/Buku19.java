//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    //void terjual(int jml) {
    //    stok -= jml;
    //}

    public void terjual(int jml) {
        if (stok > 0) {
          if (jml <= stok) {
            stok -= jml;
          } else {
            System.out.println("Jumlah yang terjual melebihi stok");
          }
        } else {
          System.out.println("Stok buku habis");
        }
      }
      
    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku19() {

    }

    public Buku19(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public int hitungHargaTotal(int jml) {
        return jml * harga;
    }

    public int hitungDiskon(int total) {
        int diskon = 0;
        if (total > 150000) {
            diskon = total * 12 /100;
        } else if (total >= 75000) {
            diskon = total * 5 / 100;
        }
        return diskon;
    }

    public int hitungHargaBayar(int total, int diskon) {
        return total - diskon;
    }
}