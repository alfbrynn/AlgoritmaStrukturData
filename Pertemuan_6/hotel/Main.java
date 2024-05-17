package Pertemuan_6.hotel;
public class Main {

    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        hotelService.tambah(new Hotel("Hotel A", "Malang", 100000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Surabaya", 200000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel C", "Jakarta", 300000, (byte) 3));

        System.out.println("Sebelum Sorting:");
        hotelService.tampilAll();

        System.out.println("\nSetelah Sorting Harga (Bubble Sort):");
        hotelService.bubbleSortHarga();
        hotelService.tampilAll();

        System.out.println("\nSetelah Sorting Bintang (Selection Sort):");
        hotelService.selectionSortBintang();
        hotelService.tampilAll();
    }
}
