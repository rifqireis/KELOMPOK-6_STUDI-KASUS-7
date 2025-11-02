    public class DenahTempatDuduk {

    private Kursi[][] layout; 

    public DenahTempatDuduk(int baris, int kolom) {
        this.layout = new Kursi[baris][kolom];
    }

    public void setKursi(int baris, int kolom, Kursi kursi) {
        layout[baris][kolom] = kursi;
    }

    public void tampilkanDenah() {
        System.out.println("\n=== DENAH TEMPAT DUDUK KONSER ===");
        System.out.print("  |");
        for (int j = 0; j < layout[0].length; j++) {
            System.out.print(" " + j + " |");
        }
        System.out.println();
        System.out.print("--+");
        for (int j = 0; j < layout[0].length; j++) {
            System.out.print("---+");
        }
        System.out.println();

        for (int i = 0; i < layout.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < layout[i].length; j++) {
                String simbol = layout[i][j].isDipesan() ? " X " : " O ";
                System.out.print(simbol + "|");
            }
            System.out.println("  (Zona " + layout[i][0].getZona() + ")");
        }
        System.out.println("----------------------------------");
        System.out.println("Keterangan: O = Kosong, X = Terisi");
    }

    public Kursi pesanKursi(int baris, int kolom) {
        if (baris < 0 || baris >= layout.length || kolom < 0 || kolom >= layout[0].length) {
            System.out.println("Pemesanan Gagal! Posisi kursi (" + baris + ", " + kolom + ") tidak valid.");
            return null;
        }

        Kursi kursiDipilih = layout[baris][kolom];

        if (kursiDipilih.isDipesan()) {
           System.out.println("Pemesanan Gagal! Kursi (" + baris + ", " + kolom + ") sudah terisi.");
            return null; 
        }

        if (kursiDipilih.pesanKursi()) {
            System.out.println("Kursi berhasil dipesan!");
            return kursiDipilih;
        }
        return null;
    }

    public double hitungTotalHarga(Kursi kursi) {
        return kursi.getHarga();
    }
}
  