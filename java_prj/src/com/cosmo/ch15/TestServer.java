package com.cosmo.ch15;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


//서버에서 사용할 클래스 
public class TestServer {

   public static void main(String[] args) {
      Socket sk = null;
      HashMap<Socket,String> asd = new HashMap<Socket,String>();
      try {
         ServerSocket ss = new ServerSocket(7777); //연결하기위해 한번 쓰인다.
         System.out.println("서버실행...");
         while(true) {
            System.out.println("대기중 ...");
            sk = ss.accept();
            System.out.println("클라이언트 접속");

                     

            
            ServerThread st = new ServerThread(sk,asd);
            Thread str=new Thread(st);
            str.start();
//            ReadThread rt = new ReadThread(sk);
//            Thread t = new Thread(rt);
//            t.start();
//
//            WriteThread write = new WriteThread(sk,"Sercer");
//            Thread tw = new Thread(write);
//            tw.start();


         }
      } catch (IOException e) {

         e.printStackTrace();
      }
   }
}
