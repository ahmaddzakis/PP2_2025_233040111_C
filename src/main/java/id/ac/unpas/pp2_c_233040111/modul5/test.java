package id.ac.unpas.pp2_c_233040111.modul5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               JFrame frame = new JFrame("hai");
               frame.setSize(400,400);
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);

               frame.setLayout(new BorderLayout());

               JLabel label = new JLabel("Label (SOUTH)");
               JButton button1 = new JButton("Button Center");
               JButton button2 = new JButton("Button Left");
               JButton button3 = new JButton("Button Right");
               JButton button4 = new JButton("Button Up");

               button1.addActionListener(e -> {
                  label.setText("Button (CENTER) di klik !");
               });

               button2.addActionListener(e -> {
                  label.setText("Button (LEFT) di klik !");
               });

               button3.addActionListener(e -> {
                  label.setText("Button (RIGHT) di klik !");
               });

               button4.addActionListener(e -> {
                  label.setText("Button (UP) di klik !");
               });


               frame.add(label, BorderLayout.SOUTH);
               frame.add(button1, BorderLayout.CENTER);
               frame.add(button2, BorderLayout.WEST);
               frame.add(button3, BorderLayout.EAST);
               frame.add(button4, BorderLayout.NORTH);

//               frame.add(new JButton("NORTH"), BorderLayout.NORTH);

           }
        });
    }
}
