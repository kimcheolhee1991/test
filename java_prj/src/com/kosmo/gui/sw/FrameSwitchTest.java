package com.kosmo.gui.sw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FrameSwitchTest extends JFrame {

	private JPanel basicPanel;
	JTextField textField;
	JPanel bpanel ;
	JPanel apanel;
	boolean toggle = false;
	String ab;
	FrameSwitchTest tt;
	JButton btnSendbutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSwitchTest frame = new FrameSwitchTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameSwitchTest() {
		tt = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		
		basicPanel = new JPanel();
		basicPanel.setBackground(Color.YELLOW);
		basicPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		basicPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(basicPanel);
		
		
		
		
		
		
		
		btnSendbutton = new JButton("sendButton");
		btnSendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		apanel = new APanel(tt); //new JPanel();
		apanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(apanel, BorderLayout.CENTER);
		
		apanel.add(btnSendbutton, BorderLayout.NORTH);
		
		JPanel bpanel = new BPanel(null); //new JPanel();
		bpanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(bpanel, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		basicPanel.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				apanel.setVisible(!(apanel.isVisible()));
				
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnOpenbutton = new JButton("openButton");
		btnOpenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	            AFrame aFrame= new AFrame(tt);
	           	aFrame.setVisible(true);
			}
		});
		panel.add(btnOpenbutton);
	//	setContentPane(bpanel);
	}

}
