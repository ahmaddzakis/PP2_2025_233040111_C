package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramBuku {
    public static void main(String[] args) {
        // Buat Objek
        Buku selfImprovement = new Buku("Atomic Habits", "James Clear", 324);

        // Menampilkan Info buku
        selfImprovement.getInfoBuku();

        // Memampilkan Halaman
        selfImprovement.getHalaman();

        // Mengubah jumlah halaman jadi 300
        selfImprovement.setHalaman(300);

        // Mengubah jumlah halaman jadi -50 / dikurang 50
        selfImprovement.setHalaman(-50);

        // Mencoba akses jumlahHalaman secara langsung dari luar kelas (Pembuktian ERROR kompilasi)
         // selfImprovement.jumlahHalaman = 100;
    }
}
