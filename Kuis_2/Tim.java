public class Tim {
    private String nama;
    private int pertandinganDimainkan;
    private int kemenangan;
    private int kekalahan;
    private int poin;
    private double rasioSkor;
    private Tim next;

    public Tim(String nama) {
        this.nama = nama;
        this.pertandinganDimainkan = 0;
        this.kemenangan = 0;
        this.kekalahan = 0;
        this.poin = 0;
        this.rasioSkor = 0.0;
        this.next = null;
    }

    public String getNama() {
        return nama;
    }

    public int getPertandinganDimainkan() {
        return pertandinganDimainkan;
    }

    public int getKemenangan() {
        return kemenangan;
    }

    public int getKekalahan() {
        return kekalahan;
    }

    public int getPoin() {
        return poin;
    }

    public double getRasioSkor() {
        return rasioSkor;
    }

    public Tim getNext() {
        return next;
    }

    public void setNext(Tim next) {
        this.next = next;
    }

    public void addMatchResults(int menang, int kalah) {
        this.kemenangan += menang;
        this.kekalahan += kalah;
        this.pertandinganDimainkan += 30; // Total pertandingan yang dimainkan adalah 30
        this.poin += (menang * 2 + kalah * 1);
        this.rasioSkor = (double) this.kemenangan / this.kekalahan;
    }
}
