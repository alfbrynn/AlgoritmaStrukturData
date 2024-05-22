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
                    current.setPertandinganDimainkan(index.getPertandinganDimainkan());
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
