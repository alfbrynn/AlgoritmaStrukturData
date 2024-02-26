import java.util.Scanner;

public class Kecepatan19 {

   public static void kecepatanMenu(Scanner scanner) {
       System.out.print("Masukkan jarak (s): ");
       double s = scanner.nextDouble();
       System.out.print("Masukkan waktu (t): ");
       double t = scanner.nextDouble();
       double hasil = kecepatan(s, t);
       System.out.printf("Hasil kecepatan (v) adalah: %.2f\n", hasil);
   }

   public static double kecepatan(double s, double t) {
       return s / t;
   }
}
