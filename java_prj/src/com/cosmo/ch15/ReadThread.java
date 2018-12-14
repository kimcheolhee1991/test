package com.cosmo.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread implements Runnable {
	Socket sk;
	public ReadThread(Socket sss) {
		this.sk = sss;
	}
	@Override
	public void run() {
		BufferedReader br = null;
		InputStream is;
		try {
			is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String line = "";
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}  finally {
			System.out.println("클라이언트 퇴장....");
			try {
				br.close();
				sk.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
