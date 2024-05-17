package Pertemuan_3.ArrayBalok;

public class Balok19 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok19(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}