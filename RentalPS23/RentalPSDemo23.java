package RentalPS23;

public class RentalPSDemo23 {
    public static void main(String[] args) {
        // Membuat instance dari RentalPS
        RentalPS23 rental = new RentalPS23("Rental Game XYZ", "Jalan Raya No. 10");

        // Membuat beberapa DaftarPS
        DaftarPS23 ps1 = new DaftarPS23("PlayStation 5", 50.0);
        DaftarPS23 ps2 = new DaftarPS23("Xbox Series X", 60.0);

        // Menambahkan game ke daftar PS
        ps1.tambahGame(new Game23("FIFA 24", "Sport"));
        ps1.tambahGame(new Game23("God of War", "Action"));

        ps2.tambahGame(new Game23("Halo Infinite", "Shooter"));
        ps2.tambahGame(new Game23("Forza Horizon 5", "Racing"));

        // Menambahkan DaftarPS ke RentalPS
        rental.tambahPS(ps1);
        rental.tambahPS(ps2);

        // Menampilkan semua PS di Rental
        rental.tampilkanPS();

        // Mencari dan menampilkan informasi PS tertentu
        System.out.println("Informasi PS yang dicari:");
        DaftarPS23 psDicari = rental.cariPS("PlayStation 5");
        if (psDicari != null) {
            System.out.println(psDicari.getInfo());
        } else {
            System.out.println("PS tidak ditemukan.");
        }
    }
}
