package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;

public class ContohGridLayout {
    public static void main(String[] args) {
        // 1. Buat Frame
        JFrame frame = new JFrame("Contoh Grid Layout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 2. Atur Layout Frame menjadi GridLayout 3 baris, 2 kolom
        // Kita juga bisa menambahkan jarak (gap) antar sel
        frame.setLayout(new GridLayout(3,2,5,5));
        // 3 baris, 2 kolom, 5px h-gap, 5px v-gap

        // 3. Tambahkan 6 Komponen (3 * 2 = 6)
        frame.add(new JLabel("Label 1 : "));
        frame.add(new JTextField());
        frame.add(new JLabel("Label 2 : "));
        frame.add(new JPasswordField());
        frame.add( new JButton("Login"));
        frame.add(new JButton("Batal"));
    }
}
