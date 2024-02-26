import java.util.Scanner;

public class NilaiMahasiswa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        boolean isValid = true; 

        System.out.print("Masukkan nilai tugas (0-100): ");
        nilaiTugas = input.nextDouble();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai kuis (0-100): ");
        nilaiKuis = input.nextDouble();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai UTS (0-100): ");
        nilaiUTS = input.nextDouble();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            isValid = false;
        }

        System.out.print("Masukkan nilai UAS (0-100): ");
        nilaiUAS = input.nextDouble();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            isValid = false;
        }

        if (!isValid) {
            System.out.println("\n-----------------------------------------");
            System.out.println("Nilai tidak valid.");
            System.out.println("Silakan masukkan nilai antara 0-100.");
        } else {
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) ? "LULUS" : "TIDAK LULUS";

            System.out.println("\n-----------------------------------------");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        }

        input.close();
    }
}
