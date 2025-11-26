import javax.swing.*;
import java.awt.*;

public class Latihan1_GPT {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // Bagian atas: layar kalkulator (JTextField)
        JTextField layar = new JTextField();
//        layar.setEditable(false);
//        layar.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(layar, BorderLayout.NORTH);

        // Bagian tengah: tombol-tombol angka dan operator
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 grid

        // Membuat array tombol
        String[] tombol = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Tambahkan tombol ke panel
        for (String t : tombol) {
            JButton btn = new JButton(t);
            panelTombol.add(btn);
        }

        frame.add(panelTombol, BorderLayout.CENTER);

        // Tampilkan frame
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
