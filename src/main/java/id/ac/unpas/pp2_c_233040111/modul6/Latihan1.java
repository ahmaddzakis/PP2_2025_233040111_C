package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;

public class Latihan1 {
    public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 2. Buat Layar di bagian atas menggunakan JTextField
        JTextField layar = new JTextField();
        frame.add(layar, BorderLayout.NORTH);
        layar.setFont(new Font("Arial", Font.ITALIC, 18));
        layar.setHorizontalAlignment(JTextField.CENTER);

        // 3. Buat panel untuk tombol dengan GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));

        // 4. Tambahkan tombol
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));

        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));

        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));

        // 5. Tambahkan panel ke frame di bagian CENTER
        frame.add(panel, BorderLayout.CENTER);
    }
}
