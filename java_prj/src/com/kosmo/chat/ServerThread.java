package com.kosmo.chat;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ServerThread implements Runnable {
	Socket sk;
	HashMap map;
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	OutputStream uos;
	PrintStream uout;
	public ServerThread(Socket ss, HashMap mm) {
		this.sk = ss;
		this.map = mm;
		//초기화
		try {
			is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		
		String nickName = "";
		try {
			
			nickName = br.readLine();
			map.put(nickName, sk);
			System.out.println("총 인원:" + map.size());
			
			
			//RIGHT:::kim입장
			sendMsgToAll("RIGHT:::"+nickName + "입장");  //오:채팅창
			
			Set set = map.keySet();
			StringBuffer buffer  = new StringBuffer();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				buffer.append(it.next()+"@");
			}
			//LEFT:::lee@kim@park@
			sendMsgToAll("LEFT:::"+buffer.toString());  //왼:닉네임목록창
			
			String nickmsg = "";		
			while( (nickmsg = br.readLine()) != null) {
				System.out.println(nickmsg);
				sendMsgToAll("RIGHT:::"+nickmsg);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("강제종료");
		} finally {
			map.remove(nickName);			
			System.out.println(nickName + "퇴장");
			
			sendMsgToAll("RIGHT:::"+nickName + "퇴장");
			
			
			StringBuffer buffer  = new StringBuffer();
			Set set = map.keySet();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				buffer.append(it.next()+"@");
			}
			//LEFT:::lee@kim@park@
			sendMsgToAll("LEFT:::"+buffer.toString());  //왼:닉네임목록창
			
			
		}
		
	}
	
	public void sendMsgToAll(String msg) {
		try {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				Socket usersk = (Socket)map.get(it.next());
				uos = usersk.getOutputStream();
				uout = new PrintStream(uos);
				uout.println(msg);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
