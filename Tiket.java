public class Tiket {
    private String namaPembeli;
    private Kursi kursi;

    public Tiket(String namaPembeli, Kursi kursi) {
        this.namaPembeli = namaPembeli;
        this.kursi = kursi;
    }

    public void tampilkanTiket() {
        System.out.println("\n--- DETAIL TIKET ---");
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Kode Kursi: " + kursi.getKode());
        System.out.println("Zona: " + kursi.getZona());
        System.out.printf("Harga Satuan: Rp %.2f%n", kursi.getHarga());
        System.out.println("--------------------\n");
    }
}