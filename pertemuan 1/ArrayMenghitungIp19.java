import java.util.Scanner;

public class ArrayMenghitungIp19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan nama mata kuliah
        String[] namaMatKul = {
            "Pancasila",
            "KTI",
            "CTPS",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Daspro",
            "Praktikum Daspro",
            "K3"
        };

        int[] nilaiAngka = new int[namaMatKul.length];

        double[] bobotNilai = new double[namaMatKul.length];

        double totalSKS = 0;
        double totalNilaiBobot = 0;
        for (int i = 0; i < namaMatKul.length; i++) {
            System.out.print("Masukkan nilai " + namaMatKul[i] + ": ");
            nilaiAngka[i] = input.nextInt();

            bobotNilai[i] = konversiNilaiAngka(nilaiAngka[i]);

            totalSKS++;
            totalNilaiBobot += bobotNilai[i];
        }

        double ipkSemester = totalNilaiBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("---------------------");
        System.out.printf("| %-20s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Bobot Nilai");
        System.out.println("---------------------");
        for (int i = 0; i < namaMatKul.length; i++) {
            System.out.printf("| %-20s | %-10d | %-10.2f |\n", namaMatKul[i], nilaiAngka[i], bobotNilai[i]);
        }
        System.out.println("---------------------");
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Total Nilai Bobot: " + totalNilaiBobot);
        System.out.printf("IP Semester: %.2f\n", ipkSemester);
    }

    private static double konversiNilaiAngka(int nilaiAngka) {
        double bobotNilai;
        if (nilaiAngka >= 85) {
            bobotNilai = 4.0;
        } else if (nilaiAngka >= 80) {
            bobotNilai = 3.5;
        } else if (nilaiAngka >= 75) {
            bobotNilai = 3.0;
        } else if (nilaiAngka >= 70) {
            bobotNilai = 2.5;
        } else if (nilaiAngka >= 65) {
            bobotNilai = 2.0;
        } else if (nilaiAngka >= 55) {
            bobotNilai = 1.5;
        } else {
            bobotNilai = 0.0;
        }
        return bobotNilai;
    }
}
