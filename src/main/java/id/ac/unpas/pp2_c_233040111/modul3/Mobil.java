package id.ac.unpas.pp2_c_233040111.modul3;

    // Ini adalah definisi kelas (Class)
    // Kita menggunakan kata kunci 'public class' diikuti nama kelas
    // Di Java, nama file biasanya harus sama dengan nama kelas public (misal: Mobil.java)
public class Mobil {
        // Ini adalah 'attributes' atau properti (fields)
        // Kita deklarasikan tipe datanya
        String merek;
        String warna;
        int tahun;

        // === Mendefinisikan method ===

        // 'void' berarti method ini tidak mengembalikan nilai
        // 'this' merujuk ke objek yang memanggil method ini
        // (misalnya, mobilBudi atau mobilAni)
        public void deskripsi() {
            // 'this' bisa juga tidak ditulis jika tidak ada nama variabel yang bentrok
            System.out.println("Ini adalah mobil " + this.merek + " " + this.warna + " " + " tahun " + this.tahun + ".");
        }

        public void klakson() {
            System.out.println("Mobil " + this.merek + " berbunyi: Beep beep!");
        }
}
