package com.kosmo.gui.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kosmo.gui.sw.BFrame;
import javax.swing.JLabel;

public class iconTestDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iconTestDemo frame = new iconTestDemo();
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
	public iconTestDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
System.out.println(getClass().getResource("/com/kosmo/gui/sw/imgfolder/open_256_icon-icons.com_76002.png"));
		
		ImageIcon icon1 = 
		new ImageIcon(iconTestDemo.class.getResource("/com/kosmo/gui/sw/imgfolder/open_256_icon-icons.com_76002.png"));
		JLabel imgLabel = new JLabel(icon1);
		contentPane.add(imgLabel, BorderLayout.CENTER);
	
			BufferedImage buffer = ImageIO.read(new File(filename));
		
	  //    ImageIcon resizeicon1 = new ImageIcon(icon1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH ));
	
		
		
	}

}
