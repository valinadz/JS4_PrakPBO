package RentalPS23;

public class Game23 {
    private String namaGame;
    private String genre;

    public Game23(String namaGame, String genre) {
        this.namaGame = namaGame;
        this.genre = genre;
    }

    public String getInfo() {
        return "\tNama Game : " + namaGame + "\n" +
               "\tGenre     : " + genre + "\n";
    }

    // Getter dan Setter
    public String getNamaGame() {
        return namaGame;
    }

    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
