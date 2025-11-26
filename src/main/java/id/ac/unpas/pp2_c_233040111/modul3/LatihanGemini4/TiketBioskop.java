package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini4;

public class TiketBioskop {
    String jenisFilm;
    int umurPenonton;

    public TiketBioskop(String jenisFilm, int umurPenonton) {
        this.jenisFilm = jenisFilm;
        this.umurPenonton = umurPenonton;
    }

    public int hitungHarga() {
        int harga = 0;
        if (this.jenisFilm.equalsIgnoreCase("Reguler")) {
            harga = 50000;
        } else if (this.jenisFilm.equalsIgnoreCase("Premiere")) {
            harga = 100000;
        } else {
            System.out.println("Jenis Film tidak tersedia");
            return 0;
        }

        if (this.umurPenonton < 10 || this.umurPenonton > 60) {
            System.out.println("Selamat anda mendapat diskon Rp10.000!");
            harga -= 10000;
        }
        return harga;
    }
}
