package pertemuan1_PengenalanJFC;

import javax.swing.*;

public class HelloWorldSwing {
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello, Haidar!");
		frame.getContentPane().add(label);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
