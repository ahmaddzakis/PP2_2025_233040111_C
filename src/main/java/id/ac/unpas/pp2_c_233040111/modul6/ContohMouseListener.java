package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContohMouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 1. Buat Komponen (Event Souurce)
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200,200));

        // 2. Buat EventListener (Menggunakan MouseAdapter)
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Saat mouse masuk, ubah warna menjadi biru
                panel.setBackground(Color.CYAN);
            }

            public void mouseExited(MouseEvent e) {
                // Saat mouse keluar, kembalikan warna
                panel.setBackground(Color.LIGHT_GRAY);
            }

            public void mouseClicked(MouseEvent e) {
                // Saat diklik, tampilkan koordinat klik
                System.out.println("Mouse diklik di : x = " + e.getX() + ", y = " + e.getY());
            }
        };

        // 3. Daftarkan Listener ke Source
        panel.addMouseListener(adapter);
        frame.add(panel);
    }
}
