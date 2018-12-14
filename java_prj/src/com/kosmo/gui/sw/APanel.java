package com.kosmo.gui.sw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class APanel extends JPanel {

	
	 
	BPanel bpanel;
	JTextField aplTextField;
	APanel ap;
	String apTextString;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public APanel(FrameSwitchTest tt) {

		
		
		setBackground(Color.BLUE);
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("APanel");
		
		
		add(btnNewButton, BorderLayout.WEST);
		
		textField = new JTextField();
		add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		tt.btnSendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(tt.textField.getText());
				
				
			}
		});
		

		
		
		
	}

}
