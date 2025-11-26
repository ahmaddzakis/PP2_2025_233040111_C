package id.ac.unpas.pp2_c_233040111.modul4.latihan;

// Superclass (Kelas Induk)
public class Hewan {
    String nama;

    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void bersuara() {
        System.out.println("Hewan ini bersuara...");
    }
}
