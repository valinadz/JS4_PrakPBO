package RentalPS23;

import java.util.ArrayList;

public class RentalPS23 {
    private String namaRental;
    private String lokasi;
    private ArrayList<DaftarPS23> daftarPS;

    public RentalPS23(String namaRental, String lokasi) {
        this.namaRental = namaRental;
        this.lokasi = lokasi;
        this.daftarPS = new ArrayList<>();
    }

    public void tambahPS(DaftarPS23 ps) {
        daftarPS.add(ps);
    }

    public DaftarPS23 cariPS(String tipePS) {
        for (DaftarPS23 ps : daftarPS) {
            if (ps.getTipePS().equalsIgnoreCase(tipePS)) {
                return ps;
            }
        }
        return null; // jika tidak ditemukan
    }

    public void tampilkanPS() {
        String info = "Informasi Rental:\n";
        for (DaftarPS23 ps : daftarPS) {
            info += ps.getInfo();
        }
        System.out.println(info);
    }

    // Getter dan Setter
    public String getNamaRental() {
        return namaRental;
    }

    public void setNamaRental(String namaRental) {
        this.namaRental = namaRental;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}