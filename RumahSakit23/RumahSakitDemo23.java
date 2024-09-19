import java.time.LocalDate;

public class RumahSakitDemo23 {
    public static void main(String[] args) {
        Pegawai23 ani = new Pegawai23("1234", "dr. Ani");
        Pegawai23 bagus = new Pegawai23("4567", "dr. Bagus");

        Pegawai23 desi = new Pegawai23("1234", "Ns. Desi");
        Pegawai23 eka = new Pegawai23("4567", "Ns. Eka");

        Pasien23 pasien1 = new Pasien23("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien23 pasien2 = new Pasien23("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}