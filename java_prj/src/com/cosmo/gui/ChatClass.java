package com.cosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChatClass extends JFrame {
   Socket sk=null;
   private JPanel contentPane;
   CardLayout cardlayout;
   JPanel cardPanel;
   private JTextField textField;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ChatClass frame = new ChatClass();
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
   public ChatClass() {
      setTitle("채팅방");
      setBackground(new Color(245, 222, 179));

      try {
         sk=new Socket("192.168.0.107",7777);
         OutputStream os = sk.getOutputStream();
         PrintStream out = new PrintStream(os);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 450, 300);
         contentPane = new JPanel();
         contentPane.setBackground(new Color(245, 222, 179));
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(new BorderLayout(0, 0));

         cardlayout=new CardLayout();
         cardPanel = new JPanel();
         contentPane.add(cardPanel, BorderLayout.CENTER);
         cardPanel.setLayout(cardlayout);


         JPanel panelA = new NickPanel(sk,cardlayout,cardPanel);
         cardPanel.add(panelA, "1");


         JPanel panelB = new   ChatPanel(sk);
         cardPanel.add(panelB, "2");

      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

}