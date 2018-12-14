package com.kosmo.gui.sw;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;

public class BFrame extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
//               BFrame frame = new BFrame();
//               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public BFrame(AFrame afaddr) {
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(120, 120, 450, 300);
      
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      
      JMenu mnFileEdit = new JMenu("File");
      mnFileEdit.setMnemonic('f');
      menuBar.add(mnFileEdit);
      
      JMenuItem mntmOpen = new JMenuItem("Open");
      mntmOpen.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		
      		System.out.println("오픈  아이템 클릭.....");
      	}
      });
      ImageIcon icon1 = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/sw/imgfolder/open_256_icon-icons.com_76002.png"));
      ImageIcon resizeicon1 = new ImageIcon(icon1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH ));
      
      mntmOpen.setIcon(resizeicon1);
      mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
      mnFileEdit.add(mntmOpen);
      
      JMenuItem mntmSave = new JMenuItem("Save");
      mntmSave.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		System.out.println("CTRL+S");
      	}
      });
      ImageIcon icon = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/sw/imgfolder/savetheapplication_guardar_2958.png"));
      ImageIcon resizeicon = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH ));
      mntmSave.setIcon(resizeicon);
      mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
      mnFileEdit.add(mntmSave);
      
      JMenuItem mntmClose = new JMenuItem("Close");
      mntmClose.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      		BFrame.this.setVisible(false);
      	}
      });
      mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK));
      mnFileEdit.add(mntmClose);
      
      JMenu mnEdit = new JMenu("Edit");
      mnEdit.setMnemonic('e');
      menuBar.add(mnEdit);
      
      JPanel panel = new JPanel();
      ImageIcon bg = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/sw/imgfolder/savetheapplication_guardar_2958.png"));
      new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/sw/imgfolder/savetheapplication_guardar_2958.png"));
      panel.imageUpdate("/com/kosmo/gui/sw/imgfolder/savetheapplication_guardar_2958.png", 10, 20, 20, 20, 20);
      
      menuBar.add(panel);
      
      contentPane = new JPanel();
      contentPane.setBackground(Color.RED);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      
      setContentPane(contentPane);
      
      JButton btnNewButton = new JButton("New button " + afaddr.applTextString);
      
      
      
      
      
      
      contentPane.add(btnNewButton, BorderLayout.WEST);
   }

}