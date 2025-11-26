package id.ac.unpas.pp2_c_233040111.modul3;

public class MobilConstructor {
    String merek;
    String warna;
    int tahun;

    // === Ini adalah Constructor ===
    // Namanya SAMA DENGAN NAMA KELAS
    // Tidak memiliki tipe return (bahkan tidak 'void')
    // Dipanggil otomatis saat 'new MobilConstructor(...)' dieksekusi
    public MobilConstructor(String inputMerek, String inputWarna, int inputTahun) {
        // 'this.merek' adalah atribut milik objek
        // 'inputMerek' adalah parameter yang dilempar saat pembuatan
        this.merek = inputMerek;
        this.warna = inputWarna;
        this.tahun = inputTahun;
        System.out.println("Tahun Mobil ini adalah " + this.tahun + "!");
    }
}
