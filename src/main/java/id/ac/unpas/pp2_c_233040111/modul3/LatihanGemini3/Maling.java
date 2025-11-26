package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class Maling {
    // Atribut
    public String nama;
    public int uangHasilCurian;

    // Constructor
    public Maling(String nama) {
        this.nama = nama;
        this.uangHasilCurian = 0;
    }

    // Method
    public void mencuri(Korban target) {
        int jumlahYgDicuri = 5000;
        if (target.uang >= jumlahYgDicuri) {
            target.uang -= jumlahYgDicuri;
            this.uangHasilCurian += jumlahYgDicuri;
            System.out.println("Berhasil mencuri Rp" + jumlahYgDicuri + " dari " + target.nama);
        } else {
            System.out.println("Gagal mencuri! Target miskin.");
        }
    }

    //
}
