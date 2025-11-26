package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class Korban {
    // Atribut
    public String nama;
    public int uang;

    // Constructor
    public Korban(String nama, int uang) {
        this.nama = nama;
        this.uang = uang;
    }

    // Getter :
    public String getNama() {
        System.out.println("Nama Korban: " + this.nama);
        return nama;
    }

    public int getUang() {
        System.out.println("Uang Korban: " + this.uang);
        return uang;
    }
}
