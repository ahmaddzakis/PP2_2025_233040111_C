package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;

public class Latihan1 {
    public static void main(String[] args) {
        // Menjalankan kode GUI di Event Dispatch Thread (EDT)
        // Ini adalah praktik terbaik untuk menghindari masalah thread
        // Akan dijelaskan lebih detail nanti

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // 1. Buat objek JFrame
                JFrame frame =  new JFrame("Jendela Pertamaku");

                // 2. Atur ukuran Jendela (lebar 400, tinggi 300)
                frame.setSize(400,300);

                // 3, Atur aksi saat tomol close (X) ditekan
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 4. Buat Jendela terlihat
                frame.setVisible(true);

                // 5. Menampilkan teks
                JLabel label = new JLabel("Teks yang ingin ditampilkan");
                frame.add(label);
            }
        });
    }
}
