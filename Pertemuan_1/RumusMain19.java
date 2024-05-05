import java.util.Scanner;

public class RumusMain19 {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int pilihan;

       do {
           System.out.println("Pilih rumus yang akan dihitung:");
           System.out.println("1. Kecepatan");
           System.out.println("2. Jarak");
           System.out.println("3. Waktu");
           System.out.println("4. Keluar");
           System.out.print("Masukkan pilihan Anda: ");
           pilihan = scanner.nextInt();

           switch (pilihan) {
               case 1:
                   Kecepatan19.kecepatanMenu(scanner);
                   break;
               case 2:
                   Jarak19.jarakMenu(scanner);
                   break;
               case 3:
                   Waktu19.waktuMenu(scanner);
                   break;
               case 4:
                   System.out.println("Terima kasih!");
                   break;
               default:
                   System.out.println("Pilihan tidak valid. Silakan coba lagi.");
           }
       } while (pilihan != 4);

       scanner.close();
   }
}
