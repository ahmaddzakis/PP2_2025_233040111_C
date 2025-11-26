package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class Medic {
    String nama;
    int stokMedkit;

    public Medic(String nama) {
        this.nama = nama;
        this.stokMedkit = 3;
    }

    public void obati(Survivor pasien) {
        if (this.stokMedkit > 0) {
            this.stokMedkit -= 1;
            pasien.darah += 20;
            System.out.println(this.nama + " mengobati " + pasien.nama + "! Darah bertambah jadi " + pasien.darah);
            System.out.println("Sisa stok Medkit: " +  this.stokMedkit);
        } else {
            System.out.println("Maaf, Medkit habis! " + pasien.nama + " tidak tertolong.");
        }
    }
}
