package pertemuan3_LayoutJFC;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloBorderLayout extends JFrame {
	public HelloBorderLayout() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelTanya = new JLabel("Apa nama Ibukota Indonesia?");
		JLabel labelHasil = new JLabel("Jawab pertanyaan diatas!");
		
		JButton btnA = new JButton("Jakarta");
		JButton btnB = new JButton("Bandung");
		JButton btnC = new JButton("Surabaya");
		
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelHasil.setText("Jawaban Anda Benar!");
			}
		});
		
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelHasil.setText("Jawaban Anda Salah!");
			}
		});
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelHasil.setText("Jawaban Anda Salah!");
			}
		});
		
		this.add(labelTanya, BorderLayout.NORTH);
		this.add(labelHasil, BorderLayout.SOUTH);
		this.add(btnA, BorderLayout.WEST);
		this.add(btnB, BorderLayout.CENTER);
		this.add(btnC, BorderLayout.EAST);
		
		this.setSize(400, 200);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HelloBorderLayout h = new HelloBorderLayout();
				h.setVisible(true);
			}
		});
	}
}