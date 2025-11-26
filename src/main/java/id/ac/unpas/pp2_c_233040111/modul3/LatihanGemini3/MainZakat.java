package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class MainZakat {
    public static void main(String[] args) {
        Penduduk pakAli = new Penduduk("Pak Ali", "Dagang Sembako", 10000000);
        AmilZakat panitia = new AmilZakat("Pak Ustadz Yusuf");

        int tagihanZakat = panitia.hitungZakat(pakAli);

        // 3. Cetak Hasilnya
        System.out.println("Nama Wajib Zakat: " + pakAli.nama);
        System.out.println("Penghasilan: Rp" + pakAli.penghasilan);
        System.out.println("Zakat yang harus dibayar: Rp" + tagihanZakat);
    }
}
