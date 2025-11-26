package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class ProgramBank {
    public static void main(String[] args) {
        RekeningBank rekeningAhmad = new RekeningBank("Ahmad Dzaki", "12345", 100000);

        rekeningAhmad.cekSaldo();
        rekeningAhmad.simpanUang(50000);
        rekeningAhmad.tarikTunai(20000);
        rekeningAhmad.tarikTunai(200000);

        // Error test
        // rekeningAhmad.saldo = 100000;

    }
}
