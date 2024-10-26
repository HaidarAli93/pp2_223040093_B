/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_KomponenGUILanjutan;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Haida
 */
public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jlist Example");
        
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        
        JList<String> list = new JList<>(items);
        
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedItem = list.getSelectedValue();
                    System.out.println("Selected: " + selectedItem);
                }
            }
        });
        
        JScrollPane scrollPane = new JScrollPane(list);
        
        frame.setLayout(null);
        scrollPane.setBounds(50, 50, 150, 100);
        frame.add(scrollPane);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}