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
public class WindowListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowListener Example");
        
        JLabel label = new JLabel("Lakukan operasi pada jendela");
        label.setBounds(50, 50, 300, 30);
        
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                    label.setText("Window Opened.");
            }

            public void windowClosing(WindowEvent e) {
                    label.setText("Window Closing.");
            }

            public void windowClosed(WindowEvent e) {
                    label.setText("Window Closed.");
            }

            public void windowIconified(WindowEvent e) {
                    label.setText("Window Minimized.");
            }

            public void windowDeiconified(WindowEvent e) {
                    label.setText("Window Restored.");
            }

            public void windowActivated(WindowEvent e) {
                    label.setText("Window Activated.");
            }

            public void windowDeactivated(WindowEvent e) {
                    label.setText("Window Deactivated.");
            }
        });
        
        frame.add(label);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
