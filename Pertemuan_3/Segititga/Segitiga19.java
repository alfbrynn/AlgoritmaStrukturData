package Pertemuan_3.Segititga;
public class Segitiga19{
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga19(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}