/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_KomponenGUILanjutan;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Haida
 */
public class ComboBoxModelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBoxModel Example");
        
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Item 1");
        comboBoxModel.addElement("Item 2");
        comboBoxModel.addElement("Item 3");
        comboBoxModel.addElement("Item 4");
        
        JComboBox<String> comboBox = new JComboBox<>(comboBoxModel);
        
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selectedItem);
            }
        });
        
        frame.setLayout(null);
        comboBox.setBounds(50, 50, 150, 20);
        frame.add(comboBox);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
