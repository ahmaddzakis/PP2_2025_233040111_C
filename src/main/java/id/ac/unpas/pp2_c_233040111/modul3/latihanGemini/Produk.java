package id.ac.unpas.pp2_c_233040111.modul3.latihanGemini;

public class Produk {
    public String namaBarang;
    public long harga;
    private int stok;

    // Constructor Produk
    public Produk(String namaBarang, long harga, int stokAwal) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stokAwal;
    }

    // Buat Method Getter dan Setter
    public String getInfoProduk() {
        System.out.println("Nama Barang: " + this.namaBarang);
        System.out.println("Harga: Rp" + this.harga);
        return this.namaBarang + this.harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stokBaru) {
        if (stokBaru >= 0) {
            this.stok = stokBaru;
            System.out.println("Stok berhasil diubah menjadi: " + this.stok);
        } else {
            System.out.println("Error: Stok tidak valid.");
        }
    }
}
