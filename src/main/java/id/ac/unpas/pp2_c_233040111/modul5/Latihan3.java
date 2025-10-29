package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Latihan3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Label dan Tombol");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 1. Atur Layout Manager
                // Flowlayout akan menyusun komponen dari kiri ke kanan.
                frame.setLayout(new FlowLayout());

                // 2. Buat komponen GUI
                JLabel label = new JLabel("Teks Awal");
                JButton button = new JButton("Klik saya!");

                /* 3. Tambahkan aksi (ActionListener) ke tombol
                   Penambahan ini menggunakan lambda untuk mempersingkat
                   penggunaan anonymous inner class */

                button.addActionListener(e -> {
                    // Aksi ini akan mengubah teks pada label
                    label.setText("Tombol berhasil  diklik!");
                });

                /* 4. Tambahkan komponen ke frame
                    Karena kit menggunakan FlowLayout,
                    keduanya akan tampil berdampingan */
                frame.add(label);
                frame.add(button);

                frame.setVisible(true);
            }
        });
    }
}
