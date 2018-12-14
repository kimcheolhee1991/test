package com.kosmo.gui.demo;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import com.kosmo.gui.sw.BFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageUPload {

   private JFrame frame;
   JLabel imglab;
   BufferedImage buffer;
   private JButton saveButton;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ImageUPload window = new ImageUPload();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public ImageUPload() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      System.out.println(getClass().getResource("/com/kosmo/gui/demo/imgs/3-3.png").toString());

      ImageIcon icon = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/demo//imgs/3-3.png"));
      ImageIcon resizeicon = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));

      imglab = new JLabel(icon);
      frame.getContentPane().add(imglab, BorderLayout.CENTER);

      JButton uploadButton = new JButton("이미지 업로드");
      uploadButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            BufferedImage buffer;
            JFileChooser chooser = new JFileChooser();
            int res = chooser.showOpenDialog(null);
            if(res == JFileChooser.APPROVE_OPTION) {                        
               String path = chooser.getSelectedFile().getPath();
               File f = new File(path);
               try {
                  
                  buffer = ImageIO.read(f);
                  ImageIcon imageIcon = new ImageIcon(buffer);
                  imglab.setIcon(imageIcon);         

//                  File outputFile = new File("C:/jp/saved.png");
//                  ImageIO.write(buffer, "png", outputFile);
               } catch (IOException e1) {
                  JOptionPane.showMessageDialog(null, "error....");
               }
            }else {
               JOptionPane.showMessageDialog(null, "파일 선택은 필수");
               return;
            }            
         }
      });
      frame.getContentPane().add(uploadButton, BorderLayout.NORTH);
      
      saveButton = new JButton("이미지 저장");
      saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               File outputFile = new File("C:/jp/saved.png");
               ImageIO.write(buffer, "png", outputFile);
               
            } catch (IOException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
         }
      });
      frame.getContentPane().add(saveButton, BorderLayout.SOUTH);

      String filename = getClass().getResource("/com/kosmo/gui/demo/imgs/934.653..png").toString();


   }

}