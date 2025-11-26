package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini5;

public class OjekOnline {
    int jarakTempuh;

    public OjekOnline(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public void cekTarif() {
        int harga = 0;

        if (this.jarakTempuh <= 4) {
            harga = 10000;
        } else {
            int sisaJarak = this.jarakTempuh - 4;
            int hargaTambahan = sisaJarak * 2000;
            harga = 10000 + hargaTambahan;
        }

        if (harga > 50000) {
            harga -= 5000;
            System.out.println("Selamat anda mendapat potongan harga sebanyak Rp5000");
        }
            System.out.println("Biaya yang harus anda bayar adalah Rp" + harga + " dengan jarak tempuh " + this.jarakTempuh + "km");
    }
}
