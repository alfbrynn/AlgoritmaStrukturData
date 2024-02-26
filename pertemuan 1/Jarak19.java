import java.util.Scanner;

public class Jarak19 {

   public static void jarakMenu(Scanner scanner) {
       System.out.print("Masukkan kecepatan (v): ");
       double v = scanner.nextDouble();
       System.out.print("Masukkan waktu (t): ");
       double t = scanner.nextDouble();
       double hasil = jarak(v, t);
       System.out.printf("Hasil jarak (s) adalah: %.2f\n", hasil);
   }

   public static double jarak(double v, double t) {
       return v * t;
   }
}
