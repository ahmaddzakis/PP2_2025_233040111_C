package id.ac.unpas.pp2_c_233040111.modul4.latihan;

public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing("Milo");

        // 'anggora' bisa memanggil method makan()
        // walaupun method itu didefinisikan di kelas Hewan.
        // Ini adalah pewarisan!
        anggora.makan(); // Output: Milo sedang makan.
        anggora.bersuara(); // Output: Hewan ini bersuara...
    }
}
