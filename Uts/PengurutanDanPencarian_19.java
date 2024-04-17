public class PengurutanDanPencarian_19 {
    Data_19[] data;

    public PengurutanDanPencarian_19(Data_19[] initialData) {
        this.data = initialData;  
    }

    void selectionSortAsc() {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].ambilNilai() < data[minIndex].ambilNilai()) {
                    minIndex = j;
                }
            }
            Data_19 temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    void selectionSortDesc() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].ambilNilai() > data[maxIndex].ambilNilai()) {
                    maxIndex = j;
                }
            }
            Data_19 temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    int sequentialSearch(int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].ambilNilai() == key) {
                return i;
            }
        }
        return -1;  // key tidak ditemukan
    }

    int binarySearch(int key, boolean ascending) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid].ambilNilai() == key) {
                return mid;
            } else if ((data[mid].ambilNilai() < key && ascending) || (data[mid].ambilNilai() > key && !ascending)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // key tidak ditemukan
    }

    void CetakArray() {
        for (Data_19 value : data) {
            System.out.print(value.ambilNilai() + " ");
        }
        System.out.println();
    }
}