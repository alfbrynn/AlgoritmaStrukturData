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
}