package id.ac.unpas.pp2_c_233040111.modul3;

public class ProgramUtamaRB {
    public static void main(String[] args) {
        // === Membuat Objek ===
        RekeningBank rekeningBudi = new RekeningBank("12345", "Budi Santoso", 50000);

        // === Interaksi yang benar (via Method) ===
        rekeningBudi.getSaldo();
        // Output: Saldo Anda saat ini: Rp50000.0

        rekeningBudi.setor(20000);
        // Output: Setoran Rp20000.0 berhasil.
        // Output: Saldo anda saat ini: Rp70000.0.

        rekeningBudi.tarik(100000); // Mencoba tarik lebih besar dari saldo
        // Output: Saldo tidak mencukupi! Saldo anda Rp70000.0.

        rekeningBudi.tarik(10000);
        // Output: Penarikan saldo Rp10000.0 berhasil.
        // Output: Saldo anda saat ini Rp60000.0.

        // === Interaksi yang salah (mencoba akses private atribut) ===
        // System.out.println(rekeningBudi.saldo);
        // Ini akan ERROR saat kompilasi!
        // Pesan error: "saldo has private access in RekeningBank"
        // Ini membuktikan enkapsulasi BERHASIL. Data saldo terlindungi

        // rekeningBudi.saldo = 999999999;
        // Ini juga akan error saat kompilasi

        rekeningBudi.getSaldo(); // Saldo tetap 60000.0
        // Output: Saldo Anda saat ini: Rp60000.0
    }
}
