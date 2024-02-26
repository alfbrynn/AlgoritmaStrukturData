import java.util.Scanner;

public class Waktu19 {

   public static void waktuMenu(Scanner scanner) {
       System.out.print("Masukkan kecepatan (v): ");
       double v = scanner.nextDouble();
       System.out.print("Masukkan jarak (s): ");
       double s = scanner.nextDouble();
       double hasil = waktu(v, s);
       System.out.printf("Hasil waktu (t) adalah: %.2f\n", hasil);
   }

   public static double waktu(double v, double s) {
       return s / v;
   }
}
