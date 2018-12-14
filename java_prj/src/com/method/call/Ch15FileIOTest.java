package com.method.call;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;


public class Ch15FileIOTest {

	public static void main(String[] args) {
		//InputStream is = new InputStream();
		String source = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\aaa";
		String dest = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\cp.txt";
		
		File sfile = new File(source);
		File dfile = new File(dest);
		if(sfile.isDirectory() || dfile.isDirectory()) System.exit(1);
		
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
//		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try { 
			fis = new FileInputStream(sfile);
			fos = new FileOutputStream(dfile);
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);
			
			
			int num = 0;
			while(dis.available() > 0) {
				num = dis.readInt();
				System.out.println(num);
				dos.write(num);
				
			}
//			bis = new BufferedInputStream(fis);
//			bos = new BufferedOutputStream(fos);
			
			/*
			while(true) {
				int res = fis.read();
				System.out.println((char)res);
				if(res == -1)
					break;
			}
			int res = 0;
			while((res = bis.read()) != -1 ) {
				System.out.print((char)res);
				bos.write(res);
			}
			
			
			bos.flush();
			
			
			byte[] b = {'a','p','p','l','e'};
			int num = 65;
			String dest = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\cp.txt";
			fos = new FileOutputStream(dest);
			fos.write(b);
			
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				bis.close();
//				bos.close();
				
				dis.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--done--");
	}

}