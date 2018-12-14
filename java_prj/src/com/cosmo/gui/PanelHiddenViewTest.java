package com.cosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHiddenViewTest extends JFrame {

	private JPanel contentPane;
	JPanel panel_a = new JPanel();
	JPanel panel_b = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelHiddenViewTest frame = new PanelHiddenViewTest();
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
	public PanelHiddenViewTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("aaa buton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_a.setVisible(true);
				panel_b.setVisible(false);
				
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("bbb buton");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_a.setVisible(false);
				panel_b.setVisible(true);
				
			}
		});
		panel.add(btnNewButton_1);
		
		
		panel_a.setBackground(Color.RED);
		panel_a.setForeground(Color.ORANGE);
		contentPane.add(panel_a, BorderLayout.WEST);
		
		
		panel_b.setBackground(Color.YELLOW);
		panel_b.setForeground(Color.RED);
		contentPane.add(panel_b, BorderLayout.EAST);
	}

}
