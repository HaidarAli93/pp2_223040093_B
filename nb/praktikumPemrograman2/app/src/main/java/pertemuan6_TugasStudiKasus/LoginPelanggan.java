/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_TugasStudiKasus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Haida
 */
public class LoginPelanggan extends App {
    public LoginPelanggan() {
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
        JButton bSubmit = new JButton("Daftar");
        JLabel lOutput = new JLabel("", JLabel.CENTER);
        
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
        
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.ipadx = 10;
        gbc.gridwidth = 2;
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
                if (!cekLogin(tfUsrnm.getText(), String.valueOf(pfPw.getPassword()))) {
                    lOutput.setText("Login gagal!");
                } else {
                    lOutput.setText("Selamat! Anda telah masuk!");
                    frame.remove(formPanel);
                    frame.add(lOutput);
                }
                
                frame.revalidate();
                frame.repaint();
            }
        });
    }
    
    private boolean cekLogin(String username, String password) {
        boolean output = false;
        for (int i = 0; i < data.length; i++) {
            data[i][1] = data[i][1] == null ? "" : data[i][1];
            if (data[i][1].equals(username) && "".equals(password)) {
                output = true;
                break;
            }
        }
        return output;
    }
}
