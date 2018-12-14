package com.cosmo.gui;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ApplicationClass {

   private JFrame frame;
   private JTextField textField;
   private JScrollPane scrollPane;
   private JTextArea textArea;
   private JButton removeRog;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ApplicationClass window = new ApplicationClass();
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
   public ApplicationClass() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      try {
         Socket sk = new Socket("127.0.0.1", 7777);
         OutputStream os = sk.getOutputStream();
         PrintStream out = new PrintStream(os);
         
         frame = new JFrame();
         frame.setBounds(100, 100, 450, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel panel = new JPanel();
         frame.getContentPane().add(panel, BorderLayout.SOUTH);

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
               //전송버튼 구현  서버로 해당 메세지 보내는 기능
               System.out.println(textField.getText());
               out.println(textField.getText());
               textField.setText("");
            }
         });


         panel.add(btnNewButton);
         
         removeRog = new JButton("지우개");
         removeRog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               textArea.setText("=======대화내용 삭제=======\n");
            }
         });
         panel.add(removeRog);

         scrollPane = new JScrollPane();
         scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
         frame.getContentPane().add(scrollPane, BorderLayout.CENTER);


         textArea = new JTextArea();
         
         scrollPane.setViewportView(textArea);

         GuiRead gr= new GuiRead(sk,textArea, textArea);
         Thread rt=new Thread(gr);
         rt.start();
         
      } catch (UnknownHostException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
   }

}