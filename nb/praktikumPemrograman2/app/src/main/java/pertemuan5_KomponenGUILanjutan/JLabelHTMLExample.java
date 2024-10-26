/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_KomponenGUILanjutan;

import javax.swing.*;
/**
 *
 * @author Haida
 */
public class JLabelHTMLExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel HTML Example");
        
        JLabel label = new JLabel("<html><b>Bold Text</b>, <i>Italic Text</i>,"
                + " and <u>Underlined Text</u></html>");
        
        frame.add(label);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
