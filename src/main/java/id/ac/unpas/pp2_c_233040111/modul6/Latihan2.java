package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatihanAjah {
    public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Konversi Celcius ke Fahrenheit");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Buat Layout dengan GridLayout
        frame.setLayout(new GridLayout(3, 3, 5, 5));

        // 3. Buat Komponen - Komponennya
        JLabel labelC = new JLabel("Celcius : ");
        JTextField textC = new JTextField();
        JLabel labelF = new JLabel("Fahrenheit : ");
        JLabel kosongan = new JLabel("");
        JButton buttonK = new JButton("Konversi");
        JLabel hasil = new JLabel("");

        // 4. Menampilkan ke layar
        frame.add(labelC);
        frame.add(textC);
        frame.add(labelF);
        frame.add(hasil);
        frame.add(kosongan);
        frame.add(buttonK);

        // 5. Tambahkan EventListener untuk tombol "Konversi"
        buttonK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil teks dari JTextField dan ubah ke double
                    double c = Double.parseDouble(textC.getText());

                    // Konversi ke Fahrenheit
                    double f = (c * 9 / 5 ) + 32;

                    // Tampilkan hasil di JLabel "hasil"
                    hasil.setText(String.format(f + "°F"));
                } catch (NumberFormatException ex) {
                    // Jika input bukan angka
                    JOptionPane.showMessageDialog(frame,"Masukkan data yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        // 6. Tampilkan Frame
        frame.setVisible(true);
    }
}
