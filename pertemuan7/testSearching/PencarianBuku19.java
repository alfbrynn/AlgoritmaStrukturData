package pertemuan7.testSearching;

import java.util.ArrayList;

public class PencarianBuku19 {

    Buku19 listBk[] = new Buku19[5];
    int idx;

    // method tambah() untuk menambahkan objek dari class buku ke dalam atribut listBk
    void tambah(Buku19 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // method tampil untuk menampilkan semua data buku yang ada dalam class
    void tampil(){
        for (Buku19 m : listBk){ // listBk tidak mengunakan array
            m.tampilDataBuku();
        }
    }

    // method findSeqSearch 
    public int FindSeqSearch(String cari){
        int posisi = -1; // inisialisasi posisi dengan nilai default -1 yang menandakan tidak ditemukannya data
        for (int j=0; j<listBk.length; j++){
            // if (listBk[j].kodeBuku == cari){
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(String x, int pos){
        if (pos != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+ pos); // tambahkan +1 pada posisi untuk menyesuaikan dengan indeks array yang dimulai dari 0
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos){
        if (pos != -1){
            System.out.println("Kode buku \t: "+ x);
            System.out.println("Judul \t: "+listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: "+listBk[pos].pengarang);
            System.out.println("Stok \t: "+listBk[pos].stock);
        } else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    // pertanyaan 3
    // membuat method baru findBuku menggunakan konsep sequential search dengan tipe method dari findBuku yaitu Buku19
    // public Buku19 FindBuku(String kodeBuku){
    //     for (Buku19 buku : listBk){
    //         if (buku.kodeBuku == kodeBuku){
    //             return buku;
    //         }
    //     }
    //     return null; 
    // }

    public int findBinarySearch(String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            // if (cari == listBk[mid].kodeBuku){
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid; 
            // } else if (listBk[mid].kodeBuku > cari) {
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // Latihan Praktikum
    public int findJudulSequentialSearch(String cari){
    ArrayList<Integer> positions = new ArrayList<>();
    for (int j = 0; j < listBk.length; j++){
        if (listBk[j].judulBuku.equalsIgnoreCase(cari)){
            positions.add(j);
        }
    }
    if (positions.isEmpty()){
        return -1; // Tidak ditemukan
    } else {
        for (Integer position : positions) {
            System.out.println("Judul " + cari + " ditemukan pada indeks " + position);
            tampilData(cari, position);
        }
        return positions.get(0); // Mengembalikan indeks pertama
    }

    public void insertionSort() {
        for (int i = 1; i < listBk.length; i++) {
            Buku19 key = listBk[i];
            int j = i - 1;
            while (j >= 0 && listBk[j].judulBuku.compareToIgnoreCase(key.judulBuku) > 0) {
                listBk[j + 1] = listBk[j];
                j = j - 1;
            }
            listBk[j + 1] = key;
        }
    }

    public int findJudulBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                return mid;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cari) > 0) {
                return findJudulBinarySearch(cari, left, mid - 1);
            } else {
                return findJudulBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int posisi = data.findJudulSequentialSearch(cari);
    if (posisi != -1) {
        // Tampilkan pesan jika ada lebih dari satu hasil
        if (data.findJudulBinarySearch(cari, 0, jumBuku - 1) != -1) {
            System.out.println("Pencarian menghasilkan lebih dari satu hasil.");
    }
    } else {
        System.out.println("Judul " + cari + " tidak ditemukan.");
    }
}

}