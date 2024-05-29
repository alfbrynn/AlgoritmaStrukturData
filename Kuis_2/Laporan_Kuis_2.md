<div style="text-align: center;">

# Laporan Kuis 2
# Single Linked List

<img src="https://spmb.polinema.ac.id/devel/asset/images/polinema_logo.png" alt="Logo Universitas" style="width: 200px;"/>

## Disusun oleh:
- **Nama:** Muhammad Alif Febriansyah
- **NIM:** 2341720025
- **Kelas:** TI-1B

## Jurusan
Teknologi Informasi

## Politeknik Negeri Malang
2023/2024

</div>

### Class
class Node.java
```java
class Node {
    private String nama;
    private int pertandinganDimainkan;
    private int kemenangan;
    private int kekalahan;
    private int poin;
    private Node next;

    public Node(String nama) {
        this.nama = nama;
        this.pertandinganDimainkan = 0;
        this.kemenangan = 0;
        this.kekalahan = 0;
        this.poin = 0;
        this.next = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPertandinganDimainkan() {
        return pertandinganDimainkan;
    }

    public void setPertandinganDimainkan(int pertandinganDimainkan) {
        this.pertandinganDimainkan = pertandinganDimainkan;
    }

    public int getKemenangan() {
        return kemenangan;
    }

    public void setKemenangan(int kemenangan) {
        this.kemenangan = kemenangan;
    }

    public int getKekalahan() {
        return kekalahan;
    }

    public void setKekalahan(int kekalahan) {
        this.kekalahan = kekalahan;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // method addMatchResults digunakan untuk memperbarui statistik tim setelah selesai pertandingan
    public void addMatchResults(int menang, int kalah) {
        this.kemenangan += menang;
        this.kekalahan += kalah;
        this.pertandinganDimainkan += menang + kalah;
        this.poin += (menang * 2 + kalah * 1);
    }
}
```
class LinkedList.java
```java
class LinkedList {
    private Node head;

    // construktor
    public LinkedList() {
        this.head = null;
    }

    // method untuk menambahkan node baru pada linked list
    public void insert(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    // method untuk memperbarui hasil pertandingan antar tim
    public void addMatchResults(String namaTim1, int skorTim1, String namaTim2, int skorTim2) {
        Node tim1 = null, tim2 = null;
        Node temp = head;

        while (temp != null) {
            if (temp.getNama().equals(namaTim1)) {
                tim1 = temp;
            }
            if (temp.getNama().equals(namaTim2)) {
                tim2 = temp;
            }
            temp = temp.getNext();
        }

        if (tim1 != null && tim2 != null) {
            if (skorTim1 > skorTim2) {
                tim1.addMatchResults(1, 0);
                tim2.addMatchResults(0, 1);
            } else {
                tim1.addMatchResults(0, 1);
                tim2.addMatchResults(1, 0);
            }
        }
    }

    // method bubbleshort digunakan untuk mengurutkan linked list berdasarkan poin setiap tim dalam urutan descending
    public void sort() {
        if (head == null || head.getNext() == null) return;

        Node current = head;
        Node index;
        int tempPoin;
        int tempKemenangan;
        int tempKekalahan;
        int tempPertandinganDimainkan;
        String tempNama;

        while (current != null) {
            index = current.getNext();
            while (index != null) {
                if (current.getPoin() < index.getPoin()) {
                    tempNama = current.getNama();
                    tempPertandinganDimainkan = current.getPertandinganDimainkan();
                    tempKemenangan = current.getKemenangan();
                    tempKekalahan = current.getKekalahan();
                    tempPoin = current.getPoin();

                    current.setNama(index.getNama());
                    current.setPe  rtandinganDimainkan(index.getPertandinganDimainkan());
                    current.setKemenangan(index.getKemenangan());
                    current.setKekalahan(index.getKekalahan());
                    current.setPoin(index.getPoin());

                    index.setNama(tempNama);
                    index.setPertandinganDimainkan(tempPertandinganDimainkan);
                    index.setKemenangan(tempKemenangan);
                    index.setKekalahan(tempKekalahan);
                    index.setPoin(tempPoin);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }

    // method untuk mencetak tabel
    public void printTable() {
        sort();
        Node temp = head;
        int rank = 1;
        System.out.println("\t== Klasemen Indonesian Basket Ball League 2024 ==");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-35s %-15s %-6s %-6s %-6s\n",
                "Peringkat", "Nama Tim", "Pertandingan", "Menang", "Kalah", "Poin");
        System.out.println("----------------------------------------------------------------------------------");
        while (temp != null) {
            System.out.printf("%-10d %-35s %-15d %-6d %-6d %-6d\n",
                    rank, temp.getNama(), temp.getPertandinganDimainkan(),
                    temp.getKemenangan(), temp.getKekalahan(), temp.getPoin());
            temp = temp.getNext();
            rank++;
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}
```
class Main.java
```java
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
```
contoh output
```
        == Klasemen Indonesian Basket Ball League 2024 ==
----------------------------------------------------------------------------------
Peringkat  Nama Tim                            Pertandingan    Menang Kalah  Poin  
----------------------------------------------------------------------------------
1          Bali United Basketball              3               3      0      6     
2          Bima Perkasa Jogja                  3               3      0      6     
3          Prawira Harum Bandung               3               2      1      5     
4          RANS Simba Bogor                    3               2      1      5     
5          Amartha Hangtuah Jakarta            3               2      1      5     
6          Pelita Jaya Jakarta                 3               2      1      5     
7          Pacific Caesar Surabaya             3               2      1      5     
8          Borneo Hornbills                    3               1      2      4     
9          Dewa United Banten                  3               1      2      4     
10         Rajawali Medan                      3               1      2      4     
11         Tangerang Hawks Basketball Club     3               1      2      4     
12         Satria Muda Pertamina Jakarta       3               1      2      4     
13         Satya Wacana Salatiga               3               0      3      3     
14         Kesatria Bengawan Solo              3               0      3      3     
----------------------------------------------------------------------------------
```