package id.ac.unpas.pp2_c_233040111.modul3;

public class Siswa {
    String nama;
    String kelas;
    int nis;

    // Buat Konstruktor
    public Siswa(String nama, String kelas, int nis) {
        this.nama = nama;
        this.kelas = kelas;
        this.nis = nis;
    }

    // Buat Method infoSiswa()
    public void infoSiswa() {
        System.out.println("Nama: " + this.nama + ", " + "Kelas: " + this.kelas + ", " + "Nomor Induk Siswa(NIS): " + this.nis + ".");
    }
}
