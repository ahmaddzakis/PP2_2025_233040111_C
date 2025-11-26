package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;

public class ContohFlowLayout {
    public static void main(String[] args) {
        // 1. Membuat Frame (Window)
        JFrame frame = new  JFrame("Contoh FLowLayout");
        frame.setSize(700,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2.  Buat Panel (Container)
        // JPanel secara default sudah menggunakan FlowLayout
        JPanel panel = new JPanel();
        // Anda juga bisa mengaturnya secara eksplisit:
         panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        // CENTER, LEFT, atau RIGHT

        // 3. Buat dan tambahkan komponen
        panel.add(new JButton("Tombol 1"));
        panel.add(new JButton("Tombol 2"));
        panel.add(new JButton("Tombol Tiga"));
        panel.add(new JButton("Tombol Empat Panjang"));
        panel.add(new JButton("Tombol 5"));

        // 4. Tambahkan panel ke frame
        frame.add(panel);

        // 5. Tampilkan Frame
        frame.setVisible(true);
    }
}
