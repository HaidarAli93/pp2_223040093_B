package pertemuan2_KomponenDasarGUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class FormDaftarNasabah extends JFrame {
	public FormDaftarNasabah() {		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JLabel labelInputNama = new JLabel("Nama: ");
		labelInputNama.setBounds(15, 10, 350, 10);
		
		JTextField textFieldNama = new JTextField();
		textFieldNama.setBounds(15, 30, 350, 20);
		
		JLabel labelInputNoHP = new JLabel("Nomor HP: ");
		labelInputNoHP.setBounds(15, 60, 350, 10);
		
		JTextField textFieldNoHP = new JTextField();
		textFieldNoHP.setBounds(15, 80, 350, 20);
		
		JLabel labelRadio = new JLabel("Jenis Kelamin: ");
		labelRadio.setBounds(15, 110, 350, 10);
		
		JRadioButton radio1 = new JRadioButton("Laki-Laki");
		radio1.setBounds(15, 130, 350, 20);
		
		JRadioButton radio2 = new JRadioButton("Perempuan");
		radio2.setBounds(15, 160, 350, 20);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		
		JLabel labelList = new JLabel("Jenis Tabungan: ");
		labelList.setBounds(15, 190, 350, 10);
		
		String[] listJenisTabungan = {"Tabungan Biasa", "Tabungan Pelajar", 
				"Tabungan Haji", "Tabungan Mitra Usaha"};
		JList<String> list = new JList<>(listJenisTabungan);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(15, 210, 350, 80);
		
		JLabel labelPw = new JLabel("Password: ");
		labelPw.setBounds(15, 300, 350, 10);
		
		JPasswordField pw = new JPasswordField();
		pw.setBounds(15, 320, 350, 20);
		
		JLabel labelKonfirPw = new JLabel("Konfirmasi Password: ");
		labelKonfirPw.setBounds(15, 350, 350, 10);
		
		JPasswordField konfirPw = new JPasswordField();
		konfirPw.setBounds(15, 370, 350, 20);
		
		JLabel labelSlider = new JLabel("Frekuensi Transaksi per Bulan: ");
		labelSlider.setBounds(15, 400, 350, 10);
		
		JSlider slider = new JSlider(0, 100, 50);
		slider.setPaintLabels(true);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setBounds(15, 420, 350, 40);
		
		JLabel labelSpinTglLahir = new JLabel("Tanggal Lahir: ");
		labelSpinTglLahir.setBounds(15, 470, 350, 10);
		
		JSpinner spinTgl = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
		spinTgl.setName("tgl");
		spinTgl.setBounds(15, 490, 50, 20);
		
		String bulan[] = {"Des", "Nov", "Okt", "Sep", "Agu", "Jul", "Jun", 
				"Mei", "Apr", "Mar", "Feb", "Jan"};
		JSpinner spinBulan = new JSpinner(new SpinnerListModel(bulan));
		spinBulan.setName("bln");
		spinBulan.setValue(bulan[11]);
		spinBulan.setBounds(70, 490, 50, 20);
		
		JSpinner spinTahun = new JSpinner();
		spinTahun.setName("thn");
		spinTahun.setValue(2024);
		spinTahun.setBounds(125, 490, 50, 20);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem menuReset = new JMenuItem("Reset");
		JMenuItem menuExit = new JMenuItem("Exit");
		
		JButton submitButton = new JButton("Simpan");
		submitButton.setBounds(15, 520, 100, 30);
		
		JTextArea txtOutput = new JTextArea("");
		txtOutput.setBounds(370, 10, 350, 150);
		
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = textFieldNama.getText();
				String noHP = textFieldNoHP.getText();
				String jenisKelamin = "";
				String konfirmasiPw = pw.getText().equals(konfirPw.getText()) ? "Sesuai" : "Tidak Sesuai";
				String jenisTabungan = list.isSelectionEmpty() ? "" : list.getSelectedValue();
				int frekuensiTransaksi = slider.getValue();
				String tglLahir = spinTgl.getValue() + " " + spinBulan.getValue() + " " + spinTahun.getValue();
				
				if (radio1.isSelected()) {
					jenisKelamin = radio1.getText();
				}
				if (radio2.isSelected()) {
					jenisKelamin = radio2.getText();
				}
				
				txtOutput.setText("");
				txtOutput.append("Nama			: " + nama);
				txtOutput.append("\nNomor HP			: " + noHP);
				txtOutput.append("\nJenis Kelamin			: " + jenisKelamin);
				txtOutput.append("\nJenis Tabungan		: " + jenisTabungan);
				txtOutput.append("\nkonfirmasi Password		: " + konfirmasiPw);
				txtOutput.append("\nFrekuensi Transaksi Per Bulan	: " + frekuensiTransaksi);
				txtOutput.append("\nTgl Lahir			: " + tglLahir);
				txtOutput.append("\n======================================");
			}
		});
		
		menuReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Component[] things = {textFieldNama, textFieldNoHP, 
						radio1, radio2, scrollPane, pw, konfirPw, 
						slider, spinTgl, spinBulan, spinTahun, txtOutput};
				for (Component thing : things) {
					if (thing instanceof JTextField) {
						((JTextField) thing).setText("");
					} else if (thing instanceof JTextArea) {
						((JTextArea) thing).setText("");
					} else if (thing instanceof JRadioButton) {
						bg.clearSelection();
					} else if (thing instanceof JScrollPane) {
						list.clearSelection();;
					} else if (thing instanceof JPasswordField) {
						((JPasswordField) thing).setText("");
					} else if (thing instanceof JSlider) {
						((JSlider) thing).setValue(50);
					} else if (thing instanceof JSpinner) {
						switch (((JSpinner) thing).getName()) {
							case "tgl":
								((JSpinner) thing).setValue(1);
								break;
							case "bln":
								((JSpinner) thing).setValue(bulan[11]);
								break;
							case "thn":
								((JSpinner) thing).setValue(2024);
								break;
						}
					}
				}
			}
		});
		
		menuExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("halo");
				System.exit(0);
			}
		});
		

		this.setJMenuBar(menuBar);
		menuBar.add(menuFile);
		menuFile.add(menuReset);
		menuFile.add(menuExit);
		this.add(labelInputNama);
		this.add(textFieldNama);
		this.add(labelInputNoHP);
		this.add(textFieldNoHP);
		this.add(labelRadio);
		this.add(radio1);
		this.add(radio2);
		this.add(labelList);
		this.add(scrollPane);
		this.add(labelPw);
		this.add(pw);
		this.add(labelKonfirPw);
		this.add(konfirPw);
		this.add(labelSlider);
		this.add(slider);
		this.add(labelSpinTglLahir);
		this.add(spinTgl);
		this.add(spinBulan);
		this.add(spinTahun);
		this.add(submitButton);
		this.add(txtOutput);
		
		this.setSize(800, 650);
		this.setLayout(null);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FormDaftarNasabah form = new FormDaftarNasabah();
				form.setVisible(true);
			}
		});
	}
}
