package id.ac.unpas.pp2_c_233040111.modul4.latihan;

// Subclass (Kelas Anak)
// Kucing "adalah seekor" Hewan, jadi Kucing /extends/ Hewan
public class Kucing extends Hewan {
    // Constructor
    public Kucing(String nama) {
        // 'super(nama)' memanggil constructor dari superclass (Hewan)
        super(nama);
    }
}
