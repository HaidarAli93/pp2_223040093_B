/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_KomponenGUILanjutan;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Haida
 */
public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        
        String[] columnNames = {"ID", "Name", "Age" };
        Object[][] data = {
            { 1, "John", 25 },
            { 2, "Anna", 30 },
            { 3, "Mike", 25 }
        };
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        
        JTable table = new JTable(model);
        
        JScrollPane scrollPane = new JScrollPane(table);
        
        frame.add(scrollPane);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
