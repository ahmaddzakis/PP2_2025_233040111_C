package id.ac.unpas.pp2_c_233040111.modul7.Tugas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManajemenNilaiSiswaApp4 extends JFrame {
    private JTextField txtNama;
    private JTextField txtNilai;
    private JComboBox<String> cmbMatkul;
    private JTable tableData;
    private DefaultTableModel tableModel;
    private JTabbedPane tabbedPane;

    // Method untuk membuat desain Tab Input
    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(5,2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        // Komponen Nama
        panel.add(new JLabel("Nama Siswa: "));
        txtNama = new JTextField();
        panel.add(txtNama);

        // Komponen Mata Pelajaran (ComboBox)
        panel.add(new JLabel("Mata Pelajaran: "));
        String[] matkul = {"Matematika Dasar", "Bahasa Indonesia", "Algoritma dan Pemograman I", "Praktikum Pemograman II"};
        cmbMatkul = new JComboBox<>(matkul);
        panel.add(cmbMatkul);

        // Komponen Nilai
        panel.add(new JLabel("Nilai (0 - 100): "));
        txtNilai = new JTextField();
        panel.add(txtNilai);

        // Tombol Simpan
        JButton btnSimpan = new JButton("Simpan Data");
        panel.add(new JLabel("")); // Placeholder kosong agar tombol berada di kanan
        panel.add(btnSimpan);

        // Tugas 4: Menambahkan tombol Reset
        JButton btnReset = new JButton("Reset Input");
        panel.add(new JLabel("")); // Placeholder kosong agar tombol berada di kanan
        panel.add(btnReset);

        // Event Handling Tombol Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int konfirmasi = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin?", "Reset Input",  javax.swing.JOptionPane.YES_NO_OPTION);

                if (konfirmasi == JOptionPane.YES_OPTION) {
                    txtNama.setText("");
                    txtNilai.setText("");
                    cmbMatkul.setSelectedIndex(0); // Mengembalikan combo box ke pilihan pertama
                }
            }
        });

        // Event Handling Tombol Simpan
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesSimpan();
            }
        });
        return panel;
    }

    // Method untuk membuat desain Tab Tabel
    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Setup Model Tabel (Kolom)
        String[] kolom = {"Nama Siswa", "Mata Pelajaran", "Nilai", "Grade"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableData = new JTable(tableModel);

        // Membungkus tabel dengan ScrollPane (agar bisa discroll jika data banyak)
        JScrollPane scrollPane = new JScrollPane(tableData);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Tugas 2: Panel tombol hapus
        JPanel panelBawah = new JPanel(new  FlowLayout(FlowLayout.RIGHT));
        JButton btnHapus = new JButton("Hapus Data");
        panelBawah.add(btnHapus);
        panel.add(panelBawah, BorderLayout.SOUTH);

        // Event tombol hapus
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indeks = tableData.getSelectedRow();
                if (indeks > -1) {
                    // Tampilkan dialog konfirmasi
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION);

                    // Hanya hapus JIKA user menekan YES
                    if (konfirmasi == JOptionPane.YES_OPTION) {
                        tableModel.removeRow(indeks);
                    }
                    // Jika user pilih NO atau Close, tidak terjadi apa-apa
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin dihapus.");
                }
            }
        });
        return panel;
    }

    // Logika Validasi Penyimpanan Data
    private void prosesSimpan() {
        // 1. Ambil data dari input
        String nama = txtNama.getText();
        String matkul = (String) cmbMatkul.getSelectedItem();
        String strNilai = txtNilai.getText();

        // 2. VALIDASI INPUT
        // Validasi 1: Cek apakah nama kosong
        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Error Validasi",JOptionPane.ERROR_MESSAGE);
            return; // Hentikan Proses
        }

        // Tugas 3: Validasi minimal 3 huruf ketika input nama
        if (nama.trim().length() < 3) {
            JOptionPane.showMessageDialog(this,"Nama minimal harus 3 huruf.", "Error Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validasi 2: Cek apakah nilai berupa angka dan dalam range valid
        int nilai;
        try {
            nilai = Integer.parseInt(strNilai);
            if (nilai < 0 || nilai > 100) {
                JOptionPane.showMessageDialog(this, "Nilai antara 0 - 100!", "Error Validasi",JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!", "Error Validasi",JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Logika Bisnis (Menentukan Grade)
        // Tugas 1: Mengubah ke switch case
        String grade;
        switch (nilai / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "AB";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "BC";
                break;
            case 4:
                grade = "C";
                break;
            case 3:
                grade = "D";
                break;
            default:
                grade = "E";
        }

        // 4. Masukkan ke Tabel (Update Model)
        Object[] dataBaris = {nama, matkul, nilai, grade};
        tableModel.addRow(dataBaris);

        // 5. Reset Form dan Pindah Tab
        txtNama.setText("");
        txtNilai.setText("");
        cmbMatkul.setSelectedIndex(0);

        JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan!");
        tabbedPane.setSelectedIndex(1); // Otomatis pindah ke tab tabel
    }

    public ManajemenNilaiSiswaApp4() {
        // 1. Konfigurasi Frame Utama
        setTitle("Aplikasi Manajemen Nilai Siswa");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Posisi di tengah layar
        setResizable(false);


        // 2. Inisialisasi TabbedPane
        tabbedPane = new JTabbedPane();

        // 3. Membuat Panel untuk Tab 1 (Form Input)
        JPanel panelInput = createInputPanel();
        tabbedPane.addTab("Input Data", panelInput);

        // 4. Membuat Panel untuk Tab 2 (Tabel Data)
        JPanel panelTable = createTablePanel();
        tabbedPane.addTab("Daftar Nilai", panelTable);

        // Menambahkan TabbedPane ke Frame
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManajemenNilaiSiswaApp4().setVisible(true);
        });
    }
}
