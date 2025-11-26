package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini4;

public class MainTiketBioskop {
    public static void main(String[] args) {
        TiketBioskop tiketA = new TiketBioskop("Reguler", 9);
        TiketBioskop tiketB = new TiketBioskop("Premiere", 70);
        TiketBioskop tiketC = new TiketBioskop("Classic", 90);

        int totalBayar = tiketA.hitungHarga();
        System.out.println("Total Bayar: " + totalBayar);

        int totalBayarB = tiketB.hitungHarga();
        System.out.println("Total Bayar: " + totalBayarB);

        tiketC.hitungHarga();
    }
}
