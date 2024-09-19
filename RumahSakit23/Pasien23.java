import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien23 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi23> riwayatKonsultasi23;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pasien23(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi23 = new ArrayList<>();
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";

        if (!riwayatKonsultasi23.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi23 konsultasi23 : riwayatKonsultasi23) {
                info += konsultasi23.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai23 dokter, Pegawai23 perawat) {
        Konsultasi23 konsultasi23 = new Konsultasi23(tanggal, dokter, perawat);
        riwayatKonsultasi23.add(konsultasi23);
    }
}
