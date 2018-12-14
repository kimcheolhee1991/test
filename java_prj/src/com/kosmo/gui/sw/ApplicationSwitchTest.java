package com.kosmo.gui.sw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ApplicationSwitchTest {

//   private JFrame frame;
   AFrame aframe;
   BFrame bframe;
   private JTextField applTextField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ApplicationSwitchTest window = new ApplicationSwitchTest();
//               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public ApplicationSwitchTest() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
//      frame = new JFrame();
//      frame.setBounds(100, 100, 450, 300);
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
   
      
      aframe = new AFrame();
      
//      JButton btnNewButton = new JButton("New button");
//      btnNewButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//            aframe.setVisible(false);
//            
//            bframe = new BFrame();
//            bframe.setVisible(true);
//         }
//      });
      
//      frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
      
      aframe.setVisible(true);
   }

}