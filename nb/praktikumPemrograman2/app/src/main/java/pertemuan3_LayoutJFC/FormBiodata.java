/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_LayoutJFC;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Haida
 */
public class FormBiodata extends JFrame {
    public FormBiodata() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelJudul = new JLabel("Form Biodata", JLabel.CENTER);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setSize(300, 300);
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel labelNama = new JLabel("Nama: ");
        JTextField txtNama = new JTextField();
        JLabel labelNoHP = new JLabel("No HP: ");
        JTextField txtNoHP = new JTextField();
        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin: ");
        JRadioButton radioLK = new JRadioButton("Laki-Laki");
        JRadioButton radioPR = new JRadioButton("Perempuan");
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioLK);
        bg.add(radioPR);
        JCheckBox cekWarga = new JCheckBox("Warga Negara Asing");

        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(labelNama, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 20;
        formPanel.add(txtNama, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(labelNoHP, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(txtNoHP, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(labelJenisKelamin, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(radioLK, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(radioPR, gbc);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        formPanel.add(cekWarga, gbc);

        JButton btnSubmit = new JButton("Simpan");

        JTextArea txtOutput = new JTextArea();
        
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText();
                String noHP = txtNama.getText();
                String jenisKelamin = radioLK.isSelected()== true ? radioLK.getText(): radioPR.isSelected()== true ? radioPR.getText() : "";
                String wna = cekWarga.isSelected()== true ? "Benar" : "Salah";
                
                txtOutput.setText("");
                txtOutput.append("Nama: " + nama + "\n" +
                    "Nomor HP: " + noHP + "\n" +
                    "Jenis Kelamin: " + jenisKelamin + "\n" +
                    "Warga Negara Asing: " + wna);
            }
        });

        this.setLayout(new GridLayout(4, 1));
        this.add(labelJudul);
        this.add(formPanel);
        this.add(btnSubmit);
        this.add(txtOutput);

        this.setSize(500, 500);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                    FormBiodata h = new FormBiodata();
                    h.setVisible(true);
            }
        });
    }
}
