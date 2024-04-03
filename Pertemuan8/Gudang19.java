package Pertemuan8;

import java.security.PublicKey;

class Gudang19 {

    Barang19[] tumpukan;
    int size;
    int top;

    // konstruktor berparameter untuk melakukan inisialisasi kapasitas maksimum data barang
    public Gudang19(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang19[size];
        top = -1;
    }

    // method cekKosong untuk mengecek apakah tumpukan barang didalam gudang masih kosong
    public boolean cekKosong(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    // method ini untuk mengecek apakah tumpukan barang di dalam gudang sudah penuh
    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    // method ini untuk mempresentasikan push, method ini menerima parameter brg berupa objek barang
    public void tambahBarang(Barang19 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");        
        } else {
            System.out.println("Gagal! Tumpukan barang digundang sudah penuh");
        }
    }

    // method ini untuk mempresentasikan pop, method ini tidak menerima parameter karena barang yang diambil pasti pada posisi teratas
    public Barang19 ambilBarang(){
        if (!cekKosong()) {
            Barang19 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + "diambil dari Gudang.");
            // konversi kode barang ke biner
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    // method ini untuk merepresentasikan peek untuk dapat mengecek tumpukan barang di posisi top
    public Barang19 lihatBarangTeratas(){
        if (!cekKosong()) { // isEmpty di ubah menjadi cekKosong
            Barang19 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = 0; i <= top; i++){
                System.out.printf("Kode %d: %s (kategori %s)\n ", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i]. kategori);
            } 
        }else {
            System.out.println("Tumpukan barang kosong");
            
        }
    }

    // PERCOBAAN 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi19 stack = new StackKonversi19();
        while (kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}