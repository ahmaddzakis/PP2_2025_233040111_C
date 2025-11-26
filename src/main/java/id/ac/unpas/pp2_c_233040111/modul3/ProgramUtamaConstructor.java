package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramUtamaConstructor {
    public static void main(String[] args) {
        // === Membuat Objek dengan Constructor ===
        // Sekarang kita harus memberikan argumen saat membuat objek
        // Argumen ini akan diterima oleh parameter constructor
        MobilConstructor mobilBudi = new MobilConstructor("Toyota", "Merah", 2020);
        // Output: Tahun Mobil ini adalah 2020!

        MobilConstructor mobilAni = new MobilConstructor("Honda", "Hitam", 2022);
        // Output: Tahun Mobil ini adalah 2022!
    }
}
