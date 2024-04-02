package pertemuan7.testSearching;

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
    public int FindSeqSearch(int cari){
        int posisi = -1; // inisialisasi posisi dengan nilai default -1 yang menandakan tidak ditemukannya data
        for (int j=0; j<listBk.length; j++){
            if (listBk[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data: "+ x +"ditemukan pada indeks "+ pos); // tambahkan +1 pada posisi untuk menyesuaikan dengan indeks array yang dimulai dari 0
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
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
    public Buku19 FindBuku(int kodeBuku){
        for (Buku19 buku : listBk){
            if (buku.kodeBuku == kodeBuku){
                return buku;
            }
        }
        return null; 
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku){
                return mid; 
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}