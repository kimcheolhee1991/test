package com.kosmo.chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollPane;

public class ChatLogin extends JFrame {

	private JPanel contentPane;
	private JTextField nicknameTextField;
	Socket sk;
	String nickname;
	OutputStream os;
	PrintStream out;
	JPanel chatPanel;
	JPanel loginPanel;
	JTextArea nicknameListArea;
	JTextArea chatArea;
	
	
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTextField msgTextField;
	private JButton btnNewButton;
	private JScrollPane scrollPane_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatLogin frame = new ChatLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ChatLogin() {
		ChatLogin chatLoginObject = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		loginPanel = new JPanel();
		loginPanel.setBackground(Color.WHITE);
		contentPane.add(loginPanel, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.BOLD, 12));
		textPane.setText("\uB2C9\uB124\uC784");
		
		nicknameTextField = new JTextField();
		nicknameTextField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.MAGENTA);
		textPane_1.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		textPane_1.setText("\uCC44\uD305\uC6D4\uB4DC");
		GroupLayout gl_loginPanel = new GroupLayout(loginPanel);
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_loginPanel.createSequentialGroup()
					.addContainerGap(103, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addGap(101))
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(188)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_loginPanel.createSequentialGroup()
					.addContainerGap(152, Short.MAX_VALUE)
					.addComponent(nicknameTextField, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(148))
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(160)
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(162, Short.MAX_VALUE))
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(nicknameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton button = new JButton("로그인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sk = new Socket("127.0.0.1", 7777);
					System.out.println("[client] 서버연결성공");
					os = sk.getOutputStream();
					out = new PrintStream(os);
					
					ReadThread read = new ReadThread(sk, chatLoginObject);
					Thread rt = new Thread(read);
					rt.start();
					
					//----------------GUI 추가------------------
					nickname = nicknameTextField.getText();
					out.println(nickname); //닉네임전송
					
					loginPanel.setVisible(false);
					chatPanel.setVisible(true);
					
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		button.setBackground(Color.ORANGE);
		panel_1.add(button);
		loginPanel.setLayout(gl_loginPanel);
		loginPanel.setVisible(true);
		
		//------------------------------------------------
		chatPanel = new JPanel();
		chatPanel.setPreferredSize(new Dimension(300,250));
		chatPanel.setLayout(new BorderLayout(0, 0));
		contentPane.add(chatPanel, BorderLayout.SOUTH);
		
		nicknameListArea = new JTextArea();
		scrollPane = new JScrollPane(nicknameListArea);
		scrollPane.setPreferredSize(new Dimension(100,250));
		chatPanel.add(scrollPane, BorderLayout.WEST);
		
		chatArea = new JTextArea();
		scrollPane_1 = new JScrollPane(chatArea);
		scrollPane_1.setPreferredSize(new Dimension(200,250));
		chatPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		panel = new JPanel();
		msgTextField = new JTextField();
		msgTextField.setColumns(28);
		panel.add(msgTextField);
		
		btnNewButton = new JButton("전송");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = msgTextField.getText();
				out.println(nickname + ":" + msg); //메세지 전송
				msgTextField.setText("");
			}
		});
		panel.add(btnNewButton);
		chatPanel.add(panel, BorderLayout.SOUTH);
		
		
		chatPanel.setVisible(false);
	}
}
