public class Tim {
    String nama;
    int poin;
    int gameDiMainkan;
    int gameKandang;
    int gameTandang;

    public Tim(String nama) {
        this.nama = nama;
        this.poin = 0;
        this.gameDiMainkan = 0;
        this.gameKandang = 0;
        this.gameTandang = 0;
    }

    public void addWin(boolean kandangGame) {
        this.poin += 2;
        this.gameDiMainkan += 1;
        if (kandangGame) {
            this.gameKandang += 1;
        } else {
            this.gameTandang += 1;
        }
    }

    public String getnama() {
        return nama;
    }

    public void printDetails() {
        System.out.println("Tim{nama='" + nama + "', poin=" + poin + ", gameDiMainkan=" + gameDiMainkan +
                ", gameKandang=" + gameKandang + ", gameTandang=" + gameTandang + '}');
    }
}
