package com.cosmo.gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NickPanel extends JPanel {
	
	
   private JTextField textField;

   /**
    * Create the panel.
    */
   public NickPanel(Socket sk,CardLayout cardlayout,JPanel cardPanel) {
      OutputStream os=null;
      try {
         os = sk.getOutputStream();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
      PrintStream out = new PrintStream(os);
      setBackground(new Color(245, 222, 179));
      setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
      
      textField = new JTextField();
      textField.setToolTipText("여기에 쓰세요");
      textField.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {
               out.println(textField.getText());
               cardlayout.show(cardPanel, "2");
            }
         }
      });
      
      JLabel label = new JLabel("닉네임:");
      add(label);
      add(textField);
      textField.setColumns(10);
      
      JButton btnNewButton = new JButton("확인");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            out.println(textField.getText());
            cardlayout.show(cardPanel, "2");
         }
      });
      add(btnNewButton);

   }

}