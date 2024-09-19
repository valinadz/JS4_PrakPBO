package RentalPS23;

import java.util.ArrayList;

public class DaftarPS23 {
    private String tipePS;
    private boolean status;
    private double hargaPerJam;
    private ArrayList<Game23> daftarGame;

    public DaftarPS23(String tipePS, double hargaPerJam) {
        this.tipePS = tipePS;
        this.hargaPerJam = hargaPerJam;
        this.daftarGame = new ArrayList<>();
        this.status = true; // status default aktif
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipePS() {
        return tipePS;
    }

    public double getHargaPerJam() {
        return hargaPerJam;
    }

    public double getHargaFinal(boolean perJam) {
        return perJam ? hargaPerJam : hargaPerJam * 1.5; // contoh harga final jika tidak per jam
    }

    public void tambahGame(Game23 game) {
        daftarGame.add(game);
    }

    public void tampilkanGames() {
        String info = "Daftar Game:\n";
        for (Game23 game : daftarGame) {
            info += game.getInfo();
        }
        System.out.println(info);
    }

    public String getInfo() {
        String info = "";
        info += "Tipe PS      : " + tipePS + "\n";
        info += "Status       : " + (status ? "Aktif" : "Tidak Aktif") + "\n";
        info += "Harga per Jam: " + hargaPerJam + "\n";
        info += "Daftar Game:\n";
        for (Game23 game : daftarGame) {
            info += game.getInfo();
        }
        return info + "\n";
    }
}
