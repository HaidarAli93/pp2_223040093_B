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
public class App extends JFrame {
    protected static JLabel lOutput;
    protected JPanel formPanel;
    protected static Object[][] data = new Object[5][6];
    private JPanel curPanel;
    public App() {
        // Tampilkan tomobol exit di pojok kanan atas
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Definisikan menubar dan isinya
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuNav = new JMenu("Navigate");
        JMenuItem menuExit = new JMenuItem("Exit");
        JMenuItem menuReg = new JMenuItem("Register");
        JMenuItem menuLogin = new JMenuItem("Login");
        JMenuItem menuProfiles = new JMenuItem("Daftar User");
        
        // Definisikan judul halaman
        JLabel lJudul = new JLabel("Home Page", JLabel.CENTER);
        
        // Masukkan menu yang telah didefiniskan kedalam app
        this.setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuNav);
        menuFile.add(menuExit);
        menuNav.add(menuReg);
        menuNav.add(menuLogin);
        menuNav.add(menuProfiles);
        
        this.add(lJudul);
        
        this.setSize(600, 600);
        this.setLayout(new GridLayout(1, 1));
        
        menuReg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (curPanel != null) {
                    App.this.remove(curPanel);
                }
                DaftarPelanggan reg = new DaftarPelanggan();
                curPanel = reg.formPanel;
                
                App.this.removeLOutput();
                App.this.remove(lJudul);
                App.this.add(curPanel);
                App.this.revalidate();
                App.this.repaint();
            }
        });
        
        menuLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (curPanel != null) {
                    App.this.remove(curPanel);
                }
                LoginPelanggan login = new LoginPelanggan();
                curPanel = login.formPanel;
                
                App.this.removeLOutput();
                App.this.remove(lJudul);
                App.this.add(curPanel);
                App.this.revalidate();
                App.this.repaint();
            }
        });
        
        menuProfiles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (curPanel != null) {
                    App.this.remove(curPanel);
                }
                ListPelanggan list = new ListPelanggan();
                curPanel = list.formPanel;
                
                App.this.removeLOutput();
                App.this.remove(lJudul);
                App.this.add(curPanel);
                App.this.revalidate();
                App.this.repaint();
            }
        });
        
        menuExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void removeLOutput() {
        if (DaftarPelanggan.lOutput != null || LoginPelanggan.lOutput != null) {
            this.remove(DaftarPelanggan.lOutput);
            this.remove(LoginPelanggan.lOutput);
        }
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });
    }
}
