package com.kosmo.gui.sw;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BPanel(APanel apaddr) {
		setBackground(Color.RED);
		setLayout(new BorderLayout(0, 0));
		
		JButton btnBpanel = new JButton("BPanel");
		add(btnBpanel, BorderLayout.WEST);

	}

}
