package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramUtama {
    // 'main' adalah titik awal program Java dieksekusi
    public static void main(String[] args) {
        // === Membuat Objek (Instantion) ===
        // Kita menggunakan kata kunci 'new'

        // Membuat objek mobilBudi dari kelas Mobil
        Mobil mobilBudi = new Mobil();

        // Mengatur atribut untuk objek mobilBudi
        mobilBudi.merek = "トヨタ";
        mobilBudi.warna = "あか";
        mobilBudi.tahun = 2020;

        // Membuat objek mobilAni dari kelas Mobil
        Mobil mobilAni = new Mobil();

        // Mengatur atribut untuk objek mobilAni
        mobilAni.merek = "ホンダ";
        mobilAni.warna = "青山";
        mobilAni.tahun = 2022;

        // === Mengakses atribut objek ===
        // Di Java, kita menggunakan System.out.println(); untuk mencetak
        System.out.println("Mobil Budi adalah " + mobilBudi.merek + " berwarna " + mobilBudi.warna + ".");
        // Output: Mobil Budi adalah トヨタ berwarna あか.

        System.out.println("Mobil Ani adalah " + mobilAni.merek + " tahun " + mobilAni.tahun + ".");
        // Output: Mobil Ani adalah ホンダ tahun 2022.

        // === Memanggil Method ===
        // Objek mobilBudi memanggil method deskripsi()
        mobilBudi.deskripsi();
        // Output: Ini adalah mobil トヨタ あか tahun 2020.

        // Objek mobilAni memanggil method klakson()
        mobilAni.klakson();
        // Output: Mobil ホンダ berbunyi: Beep beep!

    }
}
