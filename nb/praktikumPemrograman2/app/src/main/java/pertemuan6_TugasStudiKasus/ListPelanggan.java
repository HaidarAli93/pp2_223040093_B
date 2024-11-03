/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6_TugasStudiKasus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Haida
 */
public class ListPelanggan extends App {
    public ListPelanggan() {
        super.formPanel = new JPanel();
        super.formPanel = new JPanel();
        super.formPanel.setSize(500, 500);
        super.formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        String[] columnNames = { "ID", "Nama", "Umur", "Gender", "Metode Bayar", "Deskripsi" };
        
        DefaultTableModel model = new DefaultTableModel(super.data, columnNames);
        
        JLabel judulHal = new JLabel("Daftar Pelanggan", JLabel.CENTER);
        JTable tData = new JTable(model);
        JScrollPane spData = new JScrollPane(tData);
        JButton bAdd = new JButton("Tambah Data");
        JButton bRm = new JButton("Hapus Data");
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        formPanel.add(judulHal, gbc);
        
        gbc.ipady = 50;
        gbc.ipadx = 50;
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(spData, gbc);
        
        gbc.ipady = 0;
        gbc.ipadx = 25;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        formPanel.add(bAdd, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(bRm, gbc);
        
        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] newRow = {"", "", "", "", "", ""};
                model.addRow(newRow);
            }
        });
        
        bRm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tData.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });
    }
}
