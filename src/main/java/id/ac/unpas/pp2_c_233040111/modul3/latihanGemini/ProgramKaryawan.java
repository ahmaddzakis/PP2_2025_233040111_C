package id.ac.unpas.pp2_c_233040111.modul3.latihanGemini;

public class ProgramKaryawan {
    public static void main(String[] args) {
        // Buat Objek
        Karyawan karyawan1 = new Karyawan("Ahmad Dzaki", "Game Developer", 5000000);
        Karyawan karyawan2 = new Karyawan("Hikmal Maulana", "Game Developer", 5000000);

        karyawan1.cetakSlipGaji();
        karyawan2.cetakSlipGaji();
    }
}
