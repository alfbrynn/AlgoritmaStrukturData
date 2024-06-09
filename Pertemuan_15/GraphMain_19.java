package Pertemuan_15;
import java.util.Scanner;
/**
 * GraphMain_19
 */
public class GraphMain_19 {

    public static void main(String[] args) throws Exception {
        Scanner sc19 = new Scanner(System.in);
        Graph_19 gedung = new Graph_19(6);

        gedung.addBuildingName(0, "A");
        gedung.addBuildingName(1, "B");
        gedung.addBuildingName(2, "C");
        gedung.addBuildingName(3, "D");
        gedung.addBuildingName(4, "E");
        gedung.addBuildingName(5, "F");
        
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        // GraphMatriks_19 gdg = new GraphMatriks_19(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();

        while (true) {
            System.out.print("Masukkan gedung asal: ");
            char asalChar = sc19.next().charAt(0);
            System.out.print("Masukkan gedung tujuan: ");
            char tujuanChar = sc19.next().charAt(0);

            int asal = asalChar - 'A';
            int tujuan = tujuanChar - 'A';

            String namaAsal = gedung.getBuildingName(asal);
            String namaTujuan = gedung.getBuildingName(tujuan);

            if (namaAsal == null || namaTujuan == null) {
                System.out.println("Gedung tidak ditemukan");
                continue;
            }

            if (gedung.isConnected(asal, tujuan)) {
                System.out.println("Gedung " + namaAsal + " dan " + namaTujuan + " bertetangga");
            } else {
                System.out.println("Gedung " + namaAsal + " dan " + namaTujuan + " tidak bertetangga");
            }
        }
    }
}