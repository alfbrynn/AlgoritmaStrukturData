package pertemuan6.hotel;
public class Hotel {

    private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public byte getBintang() {
        return bintang;
    }

    public void setBintang(byte bintang) {
        this.bintang = bintang;
    }

    public String toString() {
        return "Hotel{" +
                "nama='" + nama + '\'' +
                ", kota='" + kota + '\'' +
                ", harga=" + harga +
                ", bintang=" + bintang +
                '}';
    }
}
