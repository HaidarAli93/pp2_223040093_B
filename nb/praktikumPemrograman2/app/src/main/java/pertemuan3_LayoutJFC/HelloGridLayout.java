/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_LayoutJFC;

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

/**
 *
 * @author Haida
 */
public class HelloGridLayout extends JFrame implements ActionListener {
    private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	
	private JButton[] btns;
	
	public HelloGridLayout() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnA = new JButton("");
		btnB = new JButton("");
		btnC = new JButton("");
		btnD = new JButton("");
		btnE = new JButton("");
		btnF = new JButton("");
		btnG = new JButton("");
		btnH = new JButton("");
		btnI = new JButton("");
		
		btns = new JButton[9];
		btns[0] = btnA;
		btns[1] = btnB;
		btns[2] = btnC;
		btns[3] = btnD;
		btns[4] = btnE;
		btns[5] = btnF;
		btns[6] = btnG;
		btns[7] = btnH;
		btns[8] = btnI;
		
		btnA.addActionListener(this);
		btnB.addActionListener(this);
		btnC.addActionListener(this);
		btnD.addActionListener(this);
		btnE.addActionListener(this);
		btnF.addActionListener(this);
		btnG.addActionListener(this);
		btnH.addActionListener(this);
		btnI.addActionListener(this);
		
		this.add(btnA);
		this.add(btnB);
		this.add(btnC);
		this.add(btnD);
		this.add(btnE);
		this.add(btnF);
		this.add(btnG);
		this.add(btnH);
		this.add(btnI);
		
		this.setLayout(new GridLayout(3, 3));
		this.setSize(300, 300);
	}

	public void actionPerformed(ActionEvent e) {
		for (var i = 0; i < btns.length; i++) {
			if (btns[i].getText().equals("")) {
				btns[i].setText("X");
			} else {
				btns[i].setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HelloGridLayout h = new HelloGridLayout();
				h.setVisible(true);
			}
		});
	}
}
