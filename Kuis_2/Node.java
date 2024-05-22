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
