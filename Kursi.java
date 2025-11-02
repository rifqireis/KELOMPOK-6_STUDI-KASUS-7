public class Kursi {
    private String kode;
    private String zona;
    private double harga;
    private boolean dipesan;

    public Kursi(int baris, int kolom, String zona, double harga) {
        this.kode = "K-" + baris + kolom;
        this.zona = zona;
        this.harga = harga;
        this.dipesan = false;
    }

    public boolean pesanKursi() {
        if (!dipesan) {
            this.dipesan = true;
            return true;
        }
        return false; 
    }

    public String getKode() { 
        return kode; 
    }

    public String getZona() { 
        return zona; 
    }

    public double getHarga() { 
        return harga; 
    }

    public boolean isDipesan() { 
        return dipesan; 
    }
}