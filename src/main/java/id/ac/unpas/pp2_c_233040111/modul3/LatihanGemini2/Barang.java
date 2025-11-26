package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class Barang {
    String namaBarang;
    int harga;
    int stok;

    public Barang(String namaBarang, int harga, int stok) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Produk: " + this.namaBarang + ", Harga: Rp" + this.harga + ", Stok: " + this.stok + " pcs");
    }


}
