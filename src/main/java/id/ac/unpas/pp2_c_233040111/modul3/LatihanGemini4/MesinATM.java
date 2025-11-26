package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini4;

public class MesinATM {
    double saldo;
    String pin;

    public MesinATM() {
        this.saldo = 1000000;
        this.pin = "1234";
    }

    public double getSaldo() {
        System.out.println("Saldo: " + this.saldo);
        return saldo;
    }

    public void tarikTunai(double jumlah, String inputPin) {
        if (inputPin.equals("1234")) {
            if (jumlah > 0) {
//                System.out.println("Jumlah Penarikan Sebanyak Rp" + jumlah + " berhasil.");
                if (this.saldo >= jumlah) {
                    this.saldo -= jumlah;
                    System.out.println("Penarikan Berhasil.");
                    System.out.println("Sisa saldo: " + this.saldo);
                } else {
                    System.out.println("Saldo tidak mencukupi!");
                }
            } else {
                System.out.println("Jumlah Penarikan tidak Valid!");
            }
        } else {
            System.out.println("Pin salah!");
        }

    }
}
