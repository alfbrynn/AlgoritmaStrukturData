public class FungsiRoyalGarden19 {
    private static final double HargaAglonema = 75000;
    private static final double HargaKeladi = 50000;
    private static final double HargaAlocasia = 60000;
    private static final double HargaMawar = 10000;

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 11, 10, 7},
            {15, 9, 0, 12, 5},
            {9, 0, 15, 6, 12}, 
            {2, 5, 0, 0, 9},
            {5, 0, 0, 0, 6}
        };

        for (int i = 0; i < stok.length; i++) {
            double TotalPendapatan = hitungTotalPendapatan(stok[i]);
            System.out.println("Pendapatan Cabang Royal Garden " + (i + 1) + " : " + TotalPendapatan);
            System.out.println("Jumlah stok Cabang Royal Garden " + (i + 1) + ":");
            printstok(stok[i]);
        }

        reducestok(stok, 1, 1); // Cabang 2, Aglonema
        reducestok(stok, 2, 2); // Cabang 3, Keladi
        reducestok(stok, 3, 0); // Cabang 4, Alocasia
        reducestok(stok, 4, 3); // Cabang 5, Mawar

        System.out.println("\nSetelah pengurangan stok karena bunga mati: ");
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Jumlah stok Cabang Royal Garden " + (i + 1) + " : ");
            printstok(stok[i]);
        }
    }

    private static double hitungTotalPendapatan(int[] branchstok) {
        double TotalPendapatan = 0;
        int[] stok = branchstok.clone();
        for (int i = 0; i < stok.length; i++) {
            if (stok[i] > 0) {
                switch (i) {
                    case 0:
                        TotalPendapatan += stok[i] * HargaAglonema;
                        break;
                    case 1:
                        TotalPendapatan += stok[i] * HargaKeladi;
                        break;
                    case 2:
                        TotalPendapatan += stok[i] * HargaAlocasia;
                        break;
                    case 3:
                        TotalPendapatan += stok[i] * HargaMawar;
                        break;
                }
                stok[i] = 0;
            }
        }
        return TotalPendapatan;
    }

    private static void printstok(int[] stok) {
        System.out.println("Aglonema: " + stok[0]);
        System.out.println("Keladi: " + stok[1]);
        System.out.println("Alocasia: " + stok[2]);
        System.out.println("Mawar: " + stok[3]);
        System.out.println();
    }

    private static void reducestok(int[][] stok, int branchIndex, int flowerIndex) {
        if (branchIndex >= 1 && branchIndex <= stok.length && flowerIndex >= 0 && flowerIndex < stok[branchIndex - 1].length) {
            int reduction = 0;
            switch (flowerIndex) {
                case 0:
                    reduction = 1; 
                    break;
                case 1:
                    reduction = 2; 
                    break;
                case 2:
                    reduction = 0; 
                    break;
                case 3:
                    reduction = 5; 
                    break;
            }
            stok[branchIndex - 1][flowerIndex] -= reduction;
        }
    }
}
