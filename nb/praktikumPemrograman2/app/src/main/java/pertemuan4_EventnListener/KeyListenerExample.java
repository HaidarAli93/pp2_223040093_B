/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_EventnListener;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Haida
 */
public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        
        JLabel label = new JLabel("Tekan tombol pada keyboard");
        label.setBounds(50, 50, 300, 30);
        
        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);
        
        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });
        
        frame.add(label);
        frame.add(textField);
        
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
