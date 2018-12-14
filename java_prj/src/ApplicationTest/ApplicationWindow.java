package ApplicationTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.CardLayout;

public class ApplicationWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainMonitor mm = new MainMonitor();
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnFistmonitor = new JButton("처음으로");
		btnFistmonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(btnFistmonitor);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton button = new JButton("다운로드");
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		panel_1.add(desktopPane, "name_18406198247020");
		
		desktopPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(24)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(363)
					.addComponent(lblNewLabel))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.EAST);
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(5)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
	}
}
