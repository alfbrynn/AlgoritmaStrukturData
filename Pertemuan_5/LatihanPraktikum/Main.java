package Pertemuan_5.LatihanPraktikum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<showroomMobil> mobilList = new ArrayList<>();

        mobilList.add(new showroomMobil("BMW", "M2 Coupe", 2016, 6816, 728));
        mobilList.add(new showroomMobil("Ford", "Fiesta ST", 2014, 3921, 575));
        mobilList.add(new showroomMobil("Nissan", "370Z", 2009, 4360, 657));
        mobilList.add(new showroomMobil("Subaru", "BRZ", 2014, 4058, 609));
        mobilList.add(new showroomMobil("Subaru", "Impreza WRX STI", 2013, 6255, 703));
        mobilList.add(new showroomMobil("Toyota", "AE86 Trueno", 1986, 3700, 553));
        mobilList.add(new showroomMobil("Toyota", "86/GT86", 2014, 4180, 609));
        mobilList.add(new showroomMobil("Volkswagen", "Golf GTI", 2014, 4180, 631));

        // Mencari top acceleration tertinggi menggunakan Divide and Conquer
        int topAccelerationTertinggi = findTopAccelerationTertinggi(mobilList);
        System.out.println("Top acceleration tertinggi: " + topAccelerationTertinggi);

        // Mencari top acceleration terendah menggunakan Divide and Conquer
        int topAccelerationTerendah = findTopAccelerationTerendah(mobilList);
        System.out.println("Top acceleration terendah: " + topAccelerationTerendah);

        // Mencari rata-rata top power menggunakan Brute Force
        int rataRataTopPower = findRataRataTopPower(mobilList);
        System.out.println("Rata-rata top power: " + rataRataTopPower);
    }

    private static int findTopAccelerationTertinggi(List<showroomMobil> mobilList) {
        if (mobilList.size() == 1) {
            return mobilList.get(0).getTopAcceleration();
        }

        int mid = mobilList.size() / 2;
        int kiri = findTopAccelerationTertinggi(mobilList.subList(0, mid));
        int kanan = findTopAccelerationTertinggi(mobilList.subList(mid, mobilList.size()));
        
        return Math.max(kiri, kanan);
    }

    private static int findTopAccelerationTerendah(List<showroomMobil> mobilList) {
        if (mobilList.size() == 1) {
            return mobilList.get(0).getTopAcceleration();
        }

        int mid = mobilList.size() / 2;
        int kiri = findTopAccelerationTerendah(mobilList.subList(0, mid));
        int kanan = findTopAccelerationTerendah(mobilList.subList(mid, mobilList.size()));
        
        return Math.min(kiri, kanan);
    }

    private static int findRataRataTopPower(List<showroomMobil> mobilList) {
        int totalPower = 0;
        for (showroomMobil mobil : mobilList) {
            totalPower += mobil.getTopPower();
        }
        return totalPower / mobilList.size();
    }
}