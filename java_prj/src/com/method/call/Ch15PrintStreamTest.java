package com.method.call;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Ch15PrintStreamTest {

	public static void main(String[] args) {
		
		//OutputStream os = new OutputStream(); XXXXX
		byte[] barr = {65,66,67,68};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(barr);
		
		String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\cp.txt";		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(dest);
			PrintStream out = new PrintStream(fos);
			
			int res = 0;
			while( (res=bais.read()) != -1) {
				System.out.println(res);
//				baos.write(res);
				out.println(res);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String name = "kim";
		int age = 10;
		
		System.out.printf("my name is %s, age is %d", name, age);
		System.out.println("my name is "+name+", age is "+ age);
		
//		try {
//			InputStreamReader isr = 
//					new InputStreamReader(System.in);
//			System.out.println("1byte:" + isr.read());
//			//6 1byte  숫자
//			//54 2byte ascii코드값
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		System.out.print("입력:");
		Scanner s = new Scanner(System.in);
		//String scStr = s.nextLine();
		int scStr = s.nextInt();
		System.out.println(scStr + 5);
		
		System.err.println("ddddddddddd");
	
		System.out.println("====done====");
		

	}

}