package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class AmilZakat {
    String namaAmil;

    public AmilZakat(String namaAmil) {
        this.namaAmil = namaAmil;
    }

    public int hitungZakat(Penduduk warga) {
        int hasilZakat = (int) (warga.penghasilan * 2.5 / 100);
        return hasilZakat;
    }
}
