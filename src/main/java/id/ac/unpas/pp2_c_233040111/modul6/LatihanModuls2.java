package id.ac.unpas.pp2_c_233040111.modul6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LatihanModuls2 {
    public static void main(String[] args) {
        // 1. Membuat Frame
        JFrame frame = new JFrame("Latihan Membuat 'Form'");
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);

        // 2.Buat Komponen
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,5,10));
        panel.setBackground(Color.DARK_GRAY);
        panel.setPreferredSize(new Dimension(200,200));


        JLabel labelJ = new JLabel("SIGN UP");
        labelJ.setFont(new Font("Arial", Font.BOLD, 18));
        labelJ.setHorizontalAlignment(JLabel.CENTER);
        frame.add(labelJ, BorderLayout.NORTH);

        JLabel labelN = new JLabel("Nama : ");
        labelN.setFont(new Font("Times New Roman",Font.BOLD,30));
        labelN.setForeground(Color.WHITE);
        labelN.setHorizontalAlignment(JLabel.CENTER);
        panel.add(labelN);

        JTextField textN = new JTextField();
        textN.setFont(new Font("Times New Roman",Font.BOLD,20));
        textN.setHorizontalAlignment(JTextField.CENTER);
        panel.add(textN);

        JLabel labelP = new JLabel("Password : ");
        labelP.setFont(new Font("Times New Roman",Font.BOLD,30));
        labelP.setForeground(Color.WHITE);
        labelP.setHorizontalAlignment(JLabel.CENTER);
        panel.add(labelP);

        JPasswordField password = new JPasswordField();
        password.setFont(new Font("Times New Roman",Font.BOLD,20));
        password.setHorizontalAlignment(JPasswordField.CENTER);
        panel.add(password);

        JButton batal = new JButton("Batal");
        batal.setFont(new Font("Times New Roman",Font.ITALIC,30));
        batal.setBackground(Color.RED);
        panel.add(batal);

        JButton signup = new JButton("Sign Up");
        signup.setFont(new Font("Times New Roman",Font.ITALIC,40));
        signup.setBackground(Color.CYAN);
        panel.add(signup);

        // 3. Buat EventListener dengan MouseAdapter dan ActionListener
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                batal.setText("Sudah Batal");
            }
        };

        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signup.setText("Berhasil");
            }
        };

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                batal.setFont(new Font("Arial",Font.BOLD,50));
            }

            public void mouseExited(MouseEvent e) {
                batal.setFont(new Font("Times New Roman",Font.ITALIC,30));
            }
        };

        // 4. Tambahkan ke layar :
        batal.addMouseListener(adapter);
        signup.addActionListener(listener2);
        batal.addActionListener(listener);
        frame.add(panel, BorderLayout.CENTER);
    }
}
