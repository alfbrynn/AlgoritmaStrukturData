package Pertemuan3.BangunRuang;
public class Bola19{
    private int jariJari;

    public Bola19(int jariJari){
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungVolume(){
        return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
    }
}