package com.cosmo.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerThread implements Runnable{
   Socket sk;
   HashMap map;
   
   public ServerThread(Socket sk,HashMap map) {
      this.sk=sk;
      this.map=map;
   }

   @Override
   public void run() {
      BufferedReader br =null;
      PrintStream out= null;
      InputStream is=null;
      OutputStream os = null;
      String nic=null;
      try {
         is=sk.getInputStream();
         InputStreamReader isr = new InputStreamReader(is);
         br = new BufferedReader(isr);
         
         nic=br.readLine();
//         int count = 0;
//         Iterator it2 = map.keySet().iterator();
//         while(it2.hasNext()){
//            if(it2.next().equals(nic))
//            {
//               System.out.println("닉네임 중복입니다.");
//               sk.close();
//            }
//            
//         }
      
         map.put(nic, sk);
         String list="";
         String list2="name#";
         Iterator it = map.keySet().iterator();
         while(it.hasNext()) {
            list2=list2+"#name#"+it.next();
         }
         sendAllMsg(list2);
         sendAllMsg("   <"+nic+"님이 입장하셨습니다>");
         
         
         String msg = "";
         while((msg=br.readLine())!=null) {
            sendAllMsg(nic+" : "+msg);
         }
         
      }catch(IOException e) {
         e.printStackTrace();
      }finally {
         try {
            sendAllMsg("   <"+nic+"님이 퇴장하셨습니다>");
            map.remove(nic);
            Iterator it = map.keySet().iterator();
            String list2="name#";
            while(it.hasNext()) {
               list2=list2+"#name#"+it.next();
            }
            sendAllMsg(list2);
            br.close();
            sk.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
   
   
   
   public void sendAllMsg(String msg) {
      try{
      Iterator it = map.keySet().iterator();
      while(it.hasNext())
      {
         Socket usersk=(Socket)map.get(it.next());
         OutputStream uos = usersk.getOutputStream();
         new PrintStream(uos).println(msg);
      }
      }catch(IOException e) {
         e.printStackTrace();
      }
   }

}