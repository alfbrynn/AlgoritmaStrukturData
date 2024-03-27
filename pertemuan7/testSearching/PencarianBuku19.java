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
        for (Buku19 m : listBk){
            listBk[idx].tampilDataBuku();
        }
    }

    // method findSeqSearch 
    public int FindSeqSearch(int cari){
        int posisi = 2;
        for (int j=0; j<idx; j++){
            if (listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method tampilPosisi
    public void tampilPosisi(int x, int pos){
        if (pos!=-1){
            System.out.println("Data: "+x+"ditemukan pada indeks "+pos);
        }else {
            System.out.println("data "+ x + "tidak ditemukan");
        }
    }
}