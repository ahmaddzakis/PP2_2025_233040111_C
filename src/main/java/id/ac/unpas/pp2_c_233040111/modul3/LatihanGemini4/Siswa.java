package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini4;

public class Siswa {
    String nama;
    int nilai;

    public Siswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public void cekKelulusan() {
        if (this.nilai >= 75) {
            System.out.println("Selamat " + this.nama + ", Anda Lulus!");
        } else {
            System.out.println("Maaf " + this.nama + ", Anda Belum Lulus.");
        }
    }
}
