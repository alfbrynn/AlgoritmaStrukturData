package Pertemuan3.BangunRuang;

public class Kerucut19{
    private int jariJari;
    private int tinggi;

    public Kerucut19(int jariJari, int tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan(){
        return Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));
    }

    public double hitungVolume(){
        return (1.0/3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}