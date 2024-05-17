package Pertemuan_3.ArrayBalok;
public class ArrayBalok19 {
    public static void main(String[] args) {
        //int panjang = 100;
        //int lebar = 30;
        //int tinggi = 12;

        Balok19[] blArray = new Balok19[3];

        //for (int i = 0; i < 3; i++){
         //   blArray[i] = new Balok19(panjang, lebar, tinggi);
        //}
        
        blArray[0] = new Balok19(100, 30, 12);
        blArray[1] = new Balok19(120, 40, 15);
        blArray[2] = new Balok19(210, 50, 25);

        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}