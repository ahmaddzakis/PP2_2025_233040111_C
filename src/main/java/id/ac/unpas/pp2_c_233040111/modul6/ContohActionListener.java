package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContohActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh ActionListener");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        // 1. Buat Komponen (Event source dan komponen lain)
        JLabel label = new JLabel("Halo, klik tombol di bawah!");
        JButton button = new JButton("Klik saya!");

        // 2. Buat Event Listener
        // Kita menggunakan "anonymous inner class" di sini
        ActionListener listener = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              // 3. Logika yang dieksekusi saat event terjadi
              label.setText("Tombol telah diklik !");
          }
        };

        // 4. Daftarkan listener ke source
        button.addActionListener(listener);

        // 5. Tambahkan komponen ke frame
        frame.add(label);
        frame.add(button);
    }
}
