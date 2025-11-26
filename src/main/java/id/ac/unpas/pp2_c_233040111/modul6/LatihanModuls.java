package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;

public class LatihanModuls {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LatihanModuls");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.setResizable(false);

        JTextField input = new JTextField();
        frame.add(input, BorderLayout.NORTH);
        input.setFont(new Font("Arial", Font.ITALIC, 18));
        input.setForeground(Color.RED);
        input.setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3,3,10,10));
        panel.setBackground(Color.CYAN);
        panel.setForeground(Color.RED);

        JRadioButton radioButton1 = new JRadioButton("xx");
        radioButton1.setBackground(Color.CYAN);
        panel.add(radioButton1);

        JCheckBox checkBox1 = new JCheckBox("xx");
        checkBox1.setBackground(Color.CYAN);
        panel.add(checkBox1);

        JButton button1 = new JButton("xx");
        button1.setBackground(Color.CYAN);
        panel.add(button1);

        JLabel label1 = new JLabel("xx");
        label1.setBackground(Color.CYAN);
        panel.add(label1);

        JButton button3 = new JButton("xx");
        button3.setBackground(Color.CYAN);
        panel.add(button3);

        JLabel label2 = new JLabel("xx");
        label2.setBackground(Color.CYAN);
        panel.add(label2);


//        panel.add(new JRadioButton("1"));
//        panel.add(new JRadioButton("2"));
//        panel.add(new JRadioButton("3"));
//        panel.add(new JRadioButton("4"));
//        panel.add(new JRadioButton("5"));
//        panel.add(new JRadioButton("6"));

        frame.add(panel, BorderLayout.CENTER);

    }
}