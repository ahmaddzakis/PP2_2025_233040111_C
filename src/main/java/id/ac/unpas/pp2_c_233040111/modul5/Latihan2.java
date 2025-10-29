package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;
import java.awt.event.*;

public class Latihan2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Latihan 2");
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton button = new JButton("Teks di tombol");
                frame.add(button);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Tombol diklik");
                    }
                });

                frame.setVisible(true);
            }
        });
    }
}
