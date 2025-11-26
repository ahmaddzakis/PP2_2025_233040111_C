package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class RekeningBank {
    String namaPemilik;
    String nomorRekening;
    private int saldo;

    public RekeningBank(String namaPemilik, String nomorRekening, int saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public int cekSaldo() {
        System.out.println("Saldo anda saat ini: Rp" + this.saldo);
        return this.saldo;
    }

    public void simpanUang(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah saldo yang anda masukkan tidak valid!");
        } else {
            this.saldo += jumlah;
            System.out.println("Saldo berhasil ditambahkan sebanyak: Rp" + jumlah);
            this.cekSaldo();
        }
    }

    public void tarikTunai(int jumlah) {
        if (jumlah <= this.saldo) {
            this.saldo -= jumlah;
            System.out.println("Saldo anda berhasil diambil sebanyak: Rp" + jumlah);
            System.out.println("Sisa saldo anda saat ini: Rp" + this.saldo);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }
}
