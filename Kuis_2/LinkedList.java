public class LinkedList {
    private Tim head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Tim tim) {
        if (head == null) {
            head = tim;
        } else {
            Tim temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(tim);
        }
    }

    public void printTable() {
        Tim temp = head;
        int rank = 1;
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-30s %-15s %-15s %-15s %-10s\n",
                "Peringkat", "Nama Tim", "Pertandingan", "Menang", "Kalah", "Poin");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        while (temp != null) {
            System.out.printf("%-10d %-30s %-15d %-15d %-15d %-10d\n",
                    rank, temp.getNama(), temp.getPertandinganDimainkan(),
                    temp.getKemenangan(), temp.getKekalahan(), temp.getPoin());
            temp = temp.getNext();
            rank++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

    public void addMatchResults(String namaTim, int menang, int kalah) {
        Tim temp = head;
        while (temp != null) {
            if (temp.getNama().equals(namaTim)) {
                temp.addMatchResults(menang, kalah);
                break;
            }
            temp = temp.getNext();
        }
    }
}
