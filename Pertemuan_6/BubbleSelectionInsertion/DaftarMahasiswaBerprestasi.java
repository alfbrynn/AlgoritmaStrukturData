package Pertemuan_6.BubbleSelectionInsertion;

import java.util.List;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------");
        }
    }

    // method bubble sort
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    // dibawah ini adalah proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    // method selection (percobaan 2 menggunakan selection)
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // method insertionSort (percobaan 3 mengunakan sorting insertion secara ascending)
    // void insertionSort(){
    //     for(int i=1; i<listMhs.length; i++){
    //         Mahasiswa tmp = listMhs[i];
    //         int j = i;
    //         while (j>0 && listMhs[j-1].ipk>tmp.ipk){
    //             listMhs[j] = listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = tmp;
    //     }
    // }

    // method insertionSort (percobaan 3 mengunakan sorting insertion secara descending)
    void insertionSort(){
        for(int i=1; i<listMhs.length; i++){
            Mahasiswa tmp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk<tmp.ipk){ // Mengubah ">" menjadi "<"
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
    
}