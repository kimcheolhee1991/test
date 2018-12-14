package com.kosmo.gui.demo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kosmo.gui.sw.BFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoogleMapFrame extends JFrame {

	private JPanel contentPane;
	private JTextField searchTextField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoogleMapFrame frame = new GoogleMapFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GoogleMapFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		contentPane = new JPanel();  
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(800, 550));
		contentPane.add(centerPanel, BorderLayout.CENTER);

		
		JPanel northPanel = new JPanel();
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		searchTextField = new JTextField();
		northPanel.add(searchTextField);
		searchTextField.setColumns(10);
		
		JButton searchButton = new JButton("search");
		northPanel.add(searchButton);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoogleMapIOTest test = new GoogleMapIOTest();
				String jpgPath = test.createMapJpg();
				ImageIcon icon = new ImageIcon(jpgPath);
				ImageIcon resizeicon = new ImageIcon(icon.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH));
				JLabel mapLabel = new JLabel(resizeicon);
				centerPanel.add(mapLabel);
				centerPanel.revalidate();
			}
		});
		
		
	}

}
