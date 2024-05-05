public class BukuMain19 {
    public static void main(String []args){
        Buku19 bk1 =new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga =71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku19 bk3 = new Buku19("Muhammad Alif Febriansyah", "Alif", 30, 20, 10000);
        bk3.terjual(10);
        bk3.tampilInformasi();

        Buku19 buku = new Buku19("Laskar Pelangi", "Andrea Hirata", 529, 10, 85000);

        int jmlTerjual = 5;
        int totalHarga = buku.hitungHargaTotal(jmlTerjual);
        int diskon = buku.hitungDiskon(totalHarga);
        int hargaBayar = buku.hitungHargaBayar(totalHarga, diskon);

        System.out.println("Jumlah terjual: " + jmlTerjual);
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);

    }
}