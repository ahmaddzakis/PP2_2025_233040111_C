package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini5;

public class UserAccount {
    String username;
    String password;

    public UserAccount(String username) {
        this.username = username;
        this.password = "1234";
    }

    public void login(String inputPassword) {
        if (inputPassword.equals(this.password)) {
            System.out.println("Login Berhasil! " + "Selamat datang " + this.username);
        } else {
            System.out.println("Password salah, coba lagi!");
        }
    }
}
