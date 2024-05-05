package pertemuan5.sumPerusahaan;

public class sumKeuntungan{
    int jumlahPerusahaan;
    sumPerusahaan[] perusahaan;

    public sumKeuntungan(int jumlahPerusahaan){
        this.jumlahPerusahaan = jumlahPerusahaan;
        this.perusahaan = new sumPerusahaan[jumlahPerusahaan];
    }

    double totalBF(double[][] arr){
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        return total;
    }

    double totalDC(double[][] arr, int l, int r){
        if (l == r) {
            return arr [l][0];
        } else if (l < r){
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid][0];
        }
        return 0;
    }
}