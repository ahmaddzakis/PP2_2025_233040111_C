package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;
import java.awt.*;

public class Tugas1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Tugas BorderLayout");
                frame.setSize(400,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new BorderLayout());

                JLabel label = new JLabel("Label ada di Atas (NORTH)");
                JButton buttonW = new JButton("WEST");
                JButton buttonE = new JButton("EAST");
                JButton buttonC = new JButton("CENTER");

                buttonW.addActionListener(e -> {
                   label.setText("Tombol di WEST diklik!");
                });

                buttonE.addActionListener(e -> {
                    label.setText("Tombol di EAST diklik!");
                });

                buttonC.addActionListener(e -> {
                    label.setText("Tombol di CENTER diklik!");
                });

                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonW, BorderLayout.WEST);
                frame.add(buttonE, BorderLayout.EAST);
                frame.add(buttonC, BorderLayout.CENTER);

                frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);

                frame.setVisible(true);
            }
        });
    }
}
