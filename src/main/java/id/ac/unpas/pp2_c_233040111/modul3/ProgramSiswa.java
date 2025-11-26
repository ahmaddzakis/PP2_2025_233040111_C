package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramSiswa {
    public static void main(String[] args) {
        // Memanggil dan membuat isi dari Konstruktor Objek 1
        Siswa sigit = new Siswa("Sigit Astiandoko", "12 MIPA", 233040200);

        // Memanggil dan membuat isi dari Konstruktor Objek 2
        Siswa dede = new Siswa("Dede Setiawan", "12 MIPA", 233040100);

        // Memanggil method
        dede.infoSiswa();
        sigit.infoSiswa();
    }
}
