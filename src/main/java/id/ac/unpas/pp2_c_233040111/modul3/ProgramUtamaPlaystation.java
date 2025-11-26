package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramUtamaPlaystation {
    public static void main(String[] args) {
        // Membuat Objek PS4 & PS5
        // Membuat objek ps4 dari kelas Playstation
        Playstation ps4 = new Playstation();

        // Mengisi Value Atribut kelas Playstation di objek ps4
        ps4.seri = "7ACH20";
        ps4.varian = "PS4 Pro";
        ps4.tahun = 2020;
        ps4.lokasi = "Kota Bandung";

        // Membuat objek ps5 dari kelas Playstation
        Playstation ps5 = new Playstation();

        // Mengisi Value Atribut kelas Playstation di objek ps5
        ps5.seri = "9AXB22";
        ps5.varian = "PS5 Slim";
        ps5.tahun = 2022;
        ps5.lokasi = "Kabupaten Bandung";

        // Mengakses Atribut dari masing-masing objek
        // PS4
        System.out.println("Playstation milikmu adalah " + ps4.varian + " dengan kode seri " + ps4.seri + " tahun " + ps4.tahun);

        // PS5
        System.out.println("--------------- PEMISAH ---------------");
        System.out.println("Rincian barang yang kamu beli : ");
        System.out.println("Varian : " + ps5.varian);
        System.out.println("Seri : " + ps5.seri);
        System.out.println("Tahun : " + ps5.tahun);

        // Mengakses method dari kelas Playstation
        ps4.tempat();
        ps5.tempat();
    }
}
