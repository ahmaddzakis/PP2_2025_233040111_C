package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;

public class ContohBorderLayout {
    public static void main(String[] args) {
        // 1. Membuat Frame Window
        JFrame frame = new JFrame("Contoh Border Layout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 2. Buat dan tambahkan komponen ke 5 wilayah
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);
    }
}
