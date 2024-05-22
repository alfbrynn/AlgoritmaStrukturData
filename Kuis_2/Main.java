public class Main {
    public static void main(String[] args) {
        LinkedList klasemen = new LinkedList();

        // Inisialisasi 14 tim IBL
        String[] namaTim = {
            "Pelita Jaya Jakarta", "Dewa United Banten", "Kesatria Bengawan Solo", 
            "Bali United Basketball", "Rajawali Medan", "Prawira Harum Bandung", 
            "RANS Simba Bogor", "Satria Muda Pertamina Jakarta", "Borneo Hornbills", 
            "Amartha Hangtuah Jakarta", "Satya Wacana Salatiga", "Bima Perkasa Jogja", 
            "Tangerang Hawks Basketball Club", "Pacific Caesar Surabaya"
        };

        // Menambahkan tim-tim ke dalam linked list
        for (String nama : namaTim) {
            Node tim = new Node(nama);
            klasemen.insert(tim);
        }

        // Memasukkan hasil pertandingan
        klasemen.addMatchResults("Pelita Jaya Jakarta", 80, "Dewa United Banten", 75);
        klasemen.addMatchResults("Kesatria Bengawan Solo", 78, "Bali United Basketball", 88);
        klasemen.addMatchResults("Rajawali Medan", 85, "Prawira Harum Bandung", 89);
        klasemen.addMatchResults("RANS Simba Bogor", 90, "Satria Muda Pertamina Jakarta", 95);
        klasemen.addMatchResults("Borneo Hornbills", 77, "Amartha Hangtuah Jakarta", 80);
        klasemen.addMatchResults("Satya Wacana Salatiga", 60, "Bima Perkasa Jogja", 70);
        klasemen.addMatchResults("Tangerang Hawks Basketball Club", 65, "Pacific Caesar Surabaya", 68);
        // Pertandingan ke 2
        klasemen.addMatchResults("Pelita Jaya Jakarta", 80, "Dewa United Banten", 85);
        klasemen.addMatchResults("Kesatria Bengawan Solo", 88, "Bali United Basketball", 88);
        klasemen.addMatchResults("Rajawali Medan", 95, "Prawira Harum Bandung", 89);
        klasemen.addMatchResults("RANS Simba Bogor", 90, "Satria Muda Pertamina Jakarta", 82);
        klasemen.addMatchResults("Borneo Hornbills", 97, "Amartha Hangtuah Jakarta", 80);
        klasemen.addMatchResults("Satya Wacana Salatiga", 60, "Bima Perkasa Jogja", 70);
        klasemen.addMatchResults("Tangerang Hawks Basketball Club", 69, "Pacific Caesar Surabaya", 68);
        // Pertandingan 3
        klasemen.addMatchResults("Pelita Jaya Jakarta", 82, "Dewa United Banten", 75);
        klasemen.addMatchResults("Kesatria Bengawan Solo", 88, "Bali United Basketball", 88);
        klasemen.addMatchResults("Rajawali Medan", 85, "Prawira Harum Bandung", 99);
        klasemen.addMatchResults("RANS Simba Bogor", 90, "Satria Muda Pertamina Jakarta", 85);
        klasemen.addMatchResults("Borneo Hornbills", 77, "Amartha Hangtuah Jakarta", 80);
        klasemen.addMatchResults("Satya Wacana Salatiga", 68, "Bima Perkasa Jogja", 70);
        klasemen.addMatchResults("Tangerang Hawks Basketball Club", 65, "Pacific Caesar Surabaya", 78);
        // Menampilkan klasemen
        klasemen.printTable();
    }
}
