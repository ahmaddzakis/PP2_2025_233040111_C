package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class SimulasiKejahatan {
    public static void main(String[] args) {
        // Buat objek
        Korban korban1 = new Korban("Budi", 10000);
        Maling maling1 = new Maling("Roni");

        // Panggil method
        maling1.mencuri(korban1);
        korban1.getUang();
        System.out.println("-----------------");
        maling1.mencuri(korban1);
        korban1.getUang();
    }
}
