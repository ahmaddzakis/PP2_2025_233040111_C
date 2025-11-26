package id.ac.unpas.pp2_c_233040111.modul3;

public class RekeningBank {
    public String noRekening;
    public String namaPemilik;
    // '__saldo' di Phyton -> 'private double saldo' di Java
    // Atribut ini PRIVATE, hanya bisa diakses oleh method di DALAM kelas ini
    private double saldo;

    // Constructor
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    // === Getter ===
    // Method public untuk 'melihat' saldo
    public double getSaldo() {
        System.out.println("Saldo anda saat ini: Rp" + this.saldo);
        return this.saldo;
    }

    // === Method public untuk memodifikasi saldo ===
    public void setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Setoran Rp" + jumlah + " berhasil.");
            this.getSaldo(); // Memanggil method internal
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid.");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo tidak mencukupi! Saldo anda " + this.saldo + ".");
        } else {
            this.saldo -= jumlah;
            System.out.println("Penarikan Rp" + jumlah + " berhasil.");
            this.getSaldo();
        }
    }
}
