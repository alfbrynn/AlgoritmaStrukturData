public class Main_IBL {
    public static void main(String[] args) {
        LinkedList klasemen = new LinkedList();

        // Inisialisasi 16 tim IBL
        String[] namaTim = {
            "Prawira Harum Bandung", "Satria Muda Pertamina Jakarta", "Pelita Jaya Bakrie Jakarta", 
            "Dewa United Banten", "RANS PIK Basketball", "Bima Perkasa Jogja", 
            "Bali United Basketball", "Bumi Borneo Basketball", "Tangerang Hawks", 
            "Indonesia Patriots", "RJ Amartha Hangtuah Jakarta", "EVOS Thunder Basketball Bogor", 
            "West Bandits Solo", "Mountain Gold Timika", "Elang Pacific Caesar Surabaya", 
            "Satya Wacana Salatiga"
        };

        // Menambahkan tim-tim ke dalam linked list
        for (String nama : namaTim) {
            Tim tim = new Tim(nama);
            klasemen.insert(tim);
        }

        // Menambahkan hasil pertandingan
        klasemen.addMatchResults("Prawira Harum Bandung", 27, 3);
        klasemen.addMatchResults("Satria Muda Pertamina Jakarta", 27, 3);
        klasemen.addMatchResults("Pelita Jaya Bakrie Jakarta", 27, 3);
        klasemen.addMatchResults("Dewa United Banten", 20, 10);
        klasemen.addMatchResults("RANS PIK Basketball", 19, 11);
        klasemen.addMatchResults("Bima Perkasa Jogja", 18, 12);
        klasemen.addMatchResults("Bali United Basketball", 15, 15);
        klasemen.addMatchResults("Bumi Borneo Basketball", 15, 15);
        klasemen.addMatchResults("Tangerang Hawks", 13, 17);
        klasemen.addMatchResults("Indonesia Patriots", 12, 18);
        klasemen.addMatchResults("RJ Amartha Hangtuah Jakarta", 12, 18);
        klasemen.addMatchResults("EVOS Thunder Basketball Bogor", 11, 19);
        klasemen.addMatchResults("West Bandits Solo", 8, 22);
        klasemen.addMatchResults("Mountain Gold Timika", 6, 24);
        klasemen.addMatchResults("Elang Pacific Caesar Surabaya", 6, 24);
        klasemen.addMatchResults("Satya Wacana Salatiga", 6, 24);

        // Menampilkan klasemen
        klasemen.printTable();
    }
}
