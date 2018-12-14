package com.cosmo.gui;

import java.awt.TextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiRead implements Runnable{
   Socket sk;
   JTextArea chat= null;
   JTextArea nic= null;
   public GuiRead(Socket sk,JTextArea chat,JTextArea nic) {
      this.sk = sk;
      this.chat=chat;
      this.nic=nic;
   }
   @Override
   public void run() {
      try {
         InputStream is = sk.getInputStream();
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr);
         String line = "";
   
         
         while((line=br.readLine()) != null) {
            String[] res =line.split("#");
            if(res[0].equals("name")) {
               nic.setText("");
               for (int i = 1; i < res.length; i=i+2) {
                  nic.append(res[i]+"\n");
               }
               
            }else {
               chat.append(line+"\n");
               chat.setCaretPosition(chat.getDocument().getLength());
               
            }

         }

         
         
         sk.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}