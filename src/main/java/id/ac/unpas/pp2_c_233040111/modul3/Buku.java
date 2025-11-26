package id.ac.unpas.pp2_c_233040111.modul3;

public class Buku {
    // Buat Atributtes dengan visibilitas
    public String judul;
    public String penulis;
    private int jumlahHalaman;

    // Buat Constructor
    public Buku(String judul, String penulis, int jumlahHalamanAwal) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalamanAwal;
    }

    // Buat method getter bernama getInfoBuku()
    public String getInfoBuku() {
        System.out.println("Judul Buku: " + this.judul);
        System.out.println("Nama Penulis: " + this.penulis);
        return this.judul + this.penulis;
    }

    // Buat method getter bernama getHalaman()
    public int getHalaman() {
        System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
        return this.jumlahHalaman;
    }

    // Buat method setter bernama setHalaman(int halamanBaru)
    public void setHalaman(int halamanBaru) {
        if (halamanBaru > 0) {
            this.jumlahHalaman = halamanBaru;
            System.out.println("Halaman baru diubah menjadi: " + this.jumlahHalaman);
            this.getHalaman();
        } else {
            System.out.println("Error: jumlah halaman harus lebih besar dari 0!");
        }
    }
}
