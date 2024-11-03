/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_TugasStudiKasus;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Haida
 */
public class DaftarPelanggan extends App {
    public DaftarPelanggan() {
        // Definisikan panel untuk form, serta batasan GridBag yg ada didalamnya
        super.formPanel = new JPanel();
        super.formPanel.setSize(500, 500);
        super.formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Definisikan Berbagai komponen JFrame yang akan ditampilkan
        JLabel judulHal = new JLabel("Register", JLabel.CENTER);
        JLabel lUsrnm = new JLabel("Nama: ");
        JTextField tfUsrnm = new JTextField();
        JLabel lPw = new JLabel("Password: ");
        JPasswordField pfPw = new JPasswordField();
        JLabel lConfPw = new JLabel("Konfirmasi Password: ");
        JPasswordField pfConfPw = new JPasswordField();
        JLabel lGender = new JLabel("Jenis Kelamin: ", JLabel.CENTER);
        JRadioButton rbLK = new JRadioButton("Laki-Laki");
        JRadioButton rbPR = new JRadioButton("Perempuan");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLK);
        bg.add(rbPR);
        JLabel lUmur = new JLabel("Umur: ");
        JSlider slUmur = new JSlider(0, 50, 0);
        slUmur.setPaintLabels(true);
        slUmur.setPaintTrack(true);
        slUmur.setPaintTicks(true);
        slUmur.setMajorTickSpacing(10);
        slUmur.setMinorTickSpacing(5);
        JLabel lmethodBayar = new JLabel("Pilih Metode Pembayaran: ");
        String[] arOpsiBayar = { "Tunai", "Non-tunai" };
        JComboBox<String> cbMethodBayar = new JComboBox<>(arOpsiBayar);
        JLabel lBhs = new JLabel("Pilih Bahasa Anda: ", JLabel.CENTER);
        String[] arBhs = { "Bahasa Indonesia", "Bahasa Inggris" };
        JList lsBhs = new JList<>(arBhs);
        JScrollPane spBhs = new JScrollPane(lsBhs);
        JLabel lDesc = new JLabel("Deskripsikan diri anda: ", JLabel.CENTER);
        JTextArea taDesc = new JTextArea();
        JCheckBox cbSk = new JCheckBox("Saya menyetujui syarat & ketentuan yang berlaku.");
        JButton bSubmit = new JButton("Daftar");
        lOutput = new JLabel("", JLabel.CENTER);
        
        // Definisikan tata letak komponen tadi di dalam formPanel menggunakan obj gbc,
        // serta masukkan komponen-komponen tsb ke dalam formPanel.
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        formPanel.add(judulHal, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 0;
        gbc.ipadx = 0;
        gbc.gridwidth = 1;
        formPanel.add(lUsrnm, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 100;
        formPanel.add(tfUsrnm, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 0;
        formPanel.add(lPw, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 100;
        formPanel.add(pfPw, gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.ipadx = 0;
        formPanel.add(lConfPw, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.ipadx = 100;
        formPanel.add(pfConfPw, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 0;
        gbc.gridwidth = 2;
        formPanel.add(lGender, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        formPanel.add(rbLK, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        formPanel.add(rbPR, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        formPanel.add(lUmur, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        formPanel.add(slUmur, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        formPanel.add(lmethodBayar, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 7;
        formPanel.add(cbMethodBayar, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        formPanel.add(lBhs, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.ipady = 0;
        formPanel.add(spBhs, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.ipady = 0;
        formPanel.add(lDesc, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.ipady = 20;
        formPanel.add(taDesc, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.ipady = 0;
        formPanel.add(cbSk, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.ipadx = 10;
        formPanel.add(bSubmit, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 14;
        lOutput.setText("");
        formPanel.add(lOutput, gbc);

        bSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) e.getSource();

                // Returns the root component for the current component tree
                JFrame frame = (JFrame) SwingUtilities.getRoot(component);
                
                String nama = tfUsrnm.getText();
                int umur = slUmur.getValue();
                String gender = rbLK.isSelected() ? rbLK.getText() : rbPR.isSelected() ? rbPR.getText() : "";
                String metodeBayar = cbMethodBayar.getSelectedItem().toString();
                String desc = taDesc.getText();
                DaftarPelanggan.this.insertData(nama, umur, gender, metodeBayar, desc);
                
                lOutput.setText("Selamat! Anda telah terdaftar!");
                frame.remove(formPanel);
                frame.add(lOutput);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
    
    public void insertData(String nama, int umur, String gender, String metodeBayar, String desc) {
        int newDataIndex = 0;
        if (data == null) {
            newDataIndex = 0;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i][0] == null) {
                    newDataIndex = i;
                    break;
                }
            }
        }
        data[newDataIndex][0] = newDataIndex;
        data[newDataIndex][1] = nama;
        data[newDataIndex][2] = umur;
        data[newDataIndex][3] = gender;
        data[newDataIndex][4] = metodeBayar;
        data[newDataIndex][5] = desc;
    }
}
