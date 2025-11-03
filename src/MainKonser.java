import java.util.Scanner;

public class MainKonser {
    public static void main(String[] args) {

        DenahTempatDuduk denah = new DenahTempatDuduk(3, 4);

        double hargaVIP = 500000.0;
        double hargaRegular = 300000.0;
        double hargaTribune = 150000.0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                String zona;
                double harga;
                if (i == 0) {
                    zona = "VIP";
                    harga = hargaVIP;
                } else if (i == 1) {
                    zona = "Regular";
                    harga = hargaRegular;
                } else {
                    zona = "Tribune";
                    harga = hargaTribune;
                }
                denah.setKursi(i, j, new Kursi(i, j, zona, harga));
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean lanjutkanPemesanan = true;

        System.out.println("SIMULASI SISTEM TIKET KONSER INTERAKTIF 🎶");
        System.out.println("=========================================");

        while (lanjutkanPemesanan) {
            denah.tampilkanDenah();

            System.out.println("\n--- Input Pemesanan Tiket ---");
            System.out.print("Masukkan Nama Pembeli (atau ketik 'selesai' untuk keluar): ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            int baris = -1;
            while (baris < 0 || baris >= 3) {
                System.out.print("Pilih Baris Kursi (0-2): ");
                if (scanner.hasNextInt()) {
                    baris = scanner.nextInt();
                } else {
                    System.out.println("Input tidak valid. Masukkan angka.");
                    scanner.next();
                }
            }

            int kolom = -1;
            while (kolom < 0 || kolom >= 4) {
                System.out.print("Pilih Kolom Kursi (0-3): ");
                if (scanner.hasNextInt()) {
                    kolom = scanner.nextInt();
                } else {
                    System.out.println("Input tidak valid. Masukkan angka.");
                    scanner.next();
                }
            }
            scanner.nextLine();

            Kursi kursiDipilih = denah.pesanKursi(baris, kolom);
            if (kursiDipilih != null) {
                Tiket tiket = new Tiket(nama, kursiDipilih);
                tiket.tampilkanTiket();
            }

            System.out.println("Tekan ENTER untuk melanjutkan pemesanan...");
            scanner.nextLine();
        }

        System.out.println("\n=== SIMULASI SELESAI ===");
        denah.tampilkanDenah();
        System.out.printf("Total Harga Semua Kursi yang Dipesan: Rp %.2f%n", denah.hitungTotalHarga());

        scanner.close();
    }
}
