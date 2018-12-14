package com.kosmo.gui.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Label;

public class ListTest extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
    private DefaultListModel listModel;
    private DefaultListModel listModel2;
    JTextArea textArea_1;
    String name;
    int su=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListTest frame = new ListTest();
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
	public ListTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		listModel2 = new DefaultListModel();
		
		
		
		 listModel = new DefaultListModel();
	        listModel.addElement("Jane Doe");
	        listModel.addElement("John Smith");
	        listModel.addElement("Kathy Green");
		
	     //   String [] data = {"leee", "kim", "park"};
	        
	        list = new JList(listModel); // listModel
	        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        list.setSelectedIndex(0);
	        list.addListSelectionListener(this);
	        list.setVisibleRowCount(5);
	       JScrollPane listScrollPane = new JScrollPane(list);
		
	        
	        contentPane.add(listScrollPane, BorderLayout.CENTER);
	        
	        JPanel panel_1 = new JPanel();
	        listScrollPane.setRowHeaderView(panel_1);
	        
	        textArea_1 = new JTextArea();
	        textArea_1.setRows(10);
	        textArea_1.setColumns(15);
	        panel_1.add(textArea_1);
	        
	        
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		Label label = new Label("이름 :");
		panel.add(label);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("전송");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			listModel.addElement(textField.getText());
				
				}
			}
		);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = list.getSelectedIndex();
				listModel.remove(index);
				if(listModel.getSize()==0) {
					btnNewButton_1.setEnabled(false);
				}
			}
		});
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("삽입");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_1.setText(textField.getText());
				
			}
		});
		panel.add(button);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.EAST);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
