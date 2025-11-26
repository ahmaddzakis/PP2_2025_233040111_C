package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class ProgramBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Laptop", 5000000, 10);
        Barang barang2 = new Barang("Smartwatch", 450000,50);

        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
    }
}
