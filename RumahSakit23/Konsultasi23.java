import java.time.LocalDate;

public class Konsultasi23 {
    private LocalDate tanggal;
    private Pegawai23 dokter;
    private Pegawai23 perawat;

    public Konsultasi23(LocalDate tanggal, Pegawai23 dokter, Pegawai23 perawat) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.perawat = perawat;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai23 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai23 dokter) {
        this.dokter = dokter;
    }

    public Pegawai23 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai23 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";

        return info;
    }
}
