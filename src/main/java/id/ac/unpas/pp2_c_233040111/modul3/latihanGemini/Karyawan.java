package id.ac.unpas.pp2_c_233040111.modul3.latihanGemini;

public class Karyawan {
    String nama;
    String jabatan;
    float gaji;

    // Buat Constructor
    public Karyawan(String nama, String jabatan, float gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Buat Method
    public void cetakSlipGaji() {
        System.out.println("Nama: " + this.nama + ", Jabatan: " + this.jabatan + ", Gaji: Rp" + this.gaji);
    }
}
