package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;
import java.awt.*;

public class test2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
            JFrame frame = new JFrame("Belajar sampe bisa !");
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(new BorderLayout());

            JLabel label = new JLabel("1");
            JButton button2 = new JButton("2");
            JButton button3 = new JButton("3");
            JButton button4 = new JButton("4");
            JButton button5 = new JButton("5");

            button2.addActionListener(e -> {
                label.setText("Clicked 2");
            });

            button3.addActionListener(e -> {
                label.setText("Clicked 3");
            });

            button4.addActionListener(e -> {
                label.setText("Clicked 4");
            });

            button5.addActionListener(e -> {
                label.setText("Clicked 5");
            });

            frame.add(label,BorderLayout.NORTH);
            frame.add(button2,BorderLayout.WEST);
            frame.add(button3, BorderLayout.SOUTH);
            frame.add(button4,BorderLayout.EAST);
            frame.add(button5,BorderLayout.CENTER);

           }
        });
    }
}
