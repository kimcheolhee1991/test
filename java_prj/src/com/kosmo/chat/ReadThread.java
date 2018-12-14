package com.kosmo.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class ReadThread implements Runnable {
	Socket sk;
	BufferedReader br;
	InputStreamReader isr;
	InputStream is;
	ChatLogin chatLogin;
	public ReadThread(Socket sss, ChatLogin aaa) {
		this.sk = sss;
		this.chatLogin = aaa;
		//초기화
		try {
			is = sk.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			String line = "";
			while( (line = br.readLine()) != null) {
				//System.out.println(line);
				String[] arrStr = line.split(":::");
				
				if(arrStr[0].equals("RIGHT")) {
					//메세지 RIGHT:::안녕하세요
					chatLogin.chatArea.append(arrStr[1] + "\n");
				} else if(arrStr[0].equals("LEFT")) {
					//닉네임 LEFT:::lee@kim@park@
					chatLogin.nicknameListArea.setText("");
					String[] nickArr = arrStr[1].split("@");
					for(int i=0; i<nickArr.length; i++){
					   chatLogin.nicknameListArea.append(nickArr[i] + "\n");
					}
				} else {
					//
				}
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}  finally {
			try {
				br.close();
				sk.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
