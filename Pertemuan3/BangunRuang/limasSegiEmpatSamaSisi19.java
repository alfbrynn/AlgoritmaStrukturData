package Pertemuan3.BangunRuang;
public class limasSegiEmpatSamaSisi19{
    private int sisiAlas;
    private int tinggi;

    public limasSegiEmpatSamaSisi19(int sisiAlas, int tinggi){
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan(){
        int luasAlas = sisiAlas * sisiAlas;
        int luasSegitigaSisi = (sisiAlas * tinggi) / 2;
        return luasAlas + 4 * luasSegitigaSisi;
    }

    public double hitungVolume(){
        double luasAlas = sisiAlas * sisiAlas;
        return (1.0 / 3) * luasAlas * tinggi;
    }
}