package Pertemuan_3.Segititga;
public class SegitigaMain19{
    public static void main(String[] args) {
        Segitiga19[] sgArray = new Segitiga19[4];
        
        sgArray[0] = new Segitiga19(10, 4);
        sgArray[1] = new Segitiga19(20, 10);
        sgArray[2] = new Segitiga19(15, 6);
        sgArray[3] = new Segitiga19(25, 10);

        for(int i = 0; i < 4; i++){
            System.out.println("Luas segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Keliling segitiga " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}