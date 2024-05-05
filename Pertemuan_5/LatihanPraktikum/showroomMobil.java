package pertemuan5.LatihanPraktikum;

import javax.print.DocFlavor.STRING;

public class showroomMobil{
    private String merk;
    private String tipe;
    private int tahun;
    private int topAcceleration;
    private int topPower;

    public showroomMobil(String merk, String tipe, int tahun, int topAcceleration, int topPower){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }    

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getTopAcceleration(){
        return topAcceleration;
    }

    public void setTopAcceleration(int topAcceleration){
        this.topAcceleration = topAcceleration;
    }

    public int getTopPower(){
        return topPower;
    }

    public void setTopPower(int topPower){
        this.topPower = topPower;
    }

    public String toString(){
        return "Mobil{" +
        "merk='" + merk + '\'' +
        ", tipe='" + tipe + '\'' +
        ", tahun=" + tahun +
        ", topAcceleration=" + topAcceleration +
        ", topPower=" + topPower +
        '}';
    }
}