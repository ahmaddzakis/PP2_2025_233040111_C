package id.ac.unpas.pp2_c_233040111.modul3;

public class PlaystationConstructor {
    String seri;
    String varian;
    int tahun;
    String lokasi;

    public PlaystationConstructor(String inputSeri, String inputVarian, int inpuTahun, String inputLokasi) {
        this.seri = inputSeri;
        this.varian = inputVarian;
        this.tahun = inpuTahun;
        this.lokasi = inputLokasi;
        System.out.println("Varian PS yang kamu beli adalah " + this.varian + " dengan kode seri " + this.seri + " tahun " +  this.tahun);
    }
}
