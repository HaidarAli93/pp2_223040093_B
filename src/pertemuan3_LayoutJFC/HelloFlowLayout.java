package pertemuan3_LayoutJFC;

import java.awt.FlowLayout;
import javax.swing.*;

public class HelloFlowLayout extends JFrame{
	public HelloFlowLayout() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		this.setLayout(new FlowLayout());
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		
		this.setSize(500, 400);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HelloFlowLayout h = new HelloFlowLayout();
				h.setVisible(true);
			}
		});
	}
}
