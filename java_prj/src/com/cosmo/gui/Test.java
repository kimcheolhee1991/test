package com.cosmo.gui;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class Test extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtID;
	private JTextField textField_1;
	private JPasswordField pw;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JButton btnNewButton;
	private JButton btnJoin;
	private JButton btnIdPwFind;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 258, 491);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setText("\uC544\uC774\uB514 :");
		textField.setBounds(32, 118, 56, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		txtID = new JTextField();
		txtID.setBounds(111, 118, 116, 21);
		panel.add(txtID);
		txtID.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\uBE44\uBC00\uBC88\uD638 :");
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(32, 162, 67, 21);
		panel.add(textField_1);
		
		pw = new JPasswordField();
		pw.setBounds(111, 162, 116, 21);
		panel.add(pw);
		
		rdbtnNewRadioButton = new JRadioButton("\uC544\uC774\uB514 \uC800\uC7A5");
		rdbtnNewRadioButton.setBounds(32, 210, 89, 23);
		panel.add(rdbtnNewRadioButton);
		
		radioButton = new JRadioButton("\uC790\uB3D9\uB85C\uADF8\uC778");
		radioButton.setBounds(138, 210, 89, 23);
		panel.add(radioButton);
		
		btnNewButton = new JButton("\uB85C  \uADF8  \uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(32, 248, 195, 23);
		panel.add(btnNewButton);
		
		btnJoin = new JButton("\uD68C \uC6D0 \uAC00 \uC785");
		btnJoin.setBounds(32, 369, 195, 23);
		panel.add(btnJoin);
		
		btnIdPwFind = new JButton("\uC544\uC774\uB514/\uBE44\uBC00\uBC88\uD638\uCC3E\uAE30");
		btnIdPwFind.setBounds(32, 415, 195, 23);
		panel.add(btnIdPwFind);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setIndeterminate(true);
		progressBar.setBounds(32, 303, 195, 14);
		panel.add(progressBar);
	
	

	}
}


