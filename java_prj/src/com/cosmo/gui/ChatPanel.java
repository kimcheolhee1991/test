package com.cosmo.gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ChatPanel extends JPanel {
   private JTextField textField;

   /**
    * Create the panel.
    */
   public ChatPanel(Socket sk) {
      OutputStream os = null;
      try {
         os = sk.getOutputStream();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
      PrintStream out = new PrintStream(os);
      setLayout(new BorderLayout(0, 0));
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(245, 222, 179));
      add(panel, BorderLayout.SOUTH);
      
      textField = new JTextField();
      textField.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {
               System.out.println(textField.getText());
               out.println(textField.getText());
               textField.setText("");
            }
         }
      });
      panel.add(textField);
      textField.setColumns(22);
      
      
      JButton btnNewButton = new JButton("전송");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         
               System.out.println(textField.getText());
               out.println(textField.getText());
               textField.setText("");
         }
      });
      panel.add(btnNewButton);
      
      JTextArea textArea = new JTextArea();
      JScrollPane scrollPane = new JScrollPane(textArea);
      scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      add(scrollPane, BorderLayout.CENTER);
      
      JScrollPane scrollPane_1 = new JScrollPane();
      scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scrollPane.setRowHeaderView(scrollPane_1);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setColumns(10);
      scrollPane_1.setViewportView(textArea_1);
      
      JButton button = new JButton("지우개");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textArea.setText("");
         }
      });
      
      panel.add(button);
      GuiRead gr = new GuiRead(sk, textArea, textArea_1);
      Thread rt=new Thread(gr);
      rt.start();
      
      

   }

}