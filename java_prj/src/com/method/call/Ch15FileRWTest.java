package com.method.call;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ch15FileRWTest {

	public static void main(String[] args) {
		String source = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\aaa";
		String dest = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\cp.txt";		
		
		//Reader r = new Reader();  //abstarct class new xxx
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		//char[] carr = {'j','a','v','a'};
		//CharArrayReader car = 
		
		try {
			int res = 0;
			fr = new FileReader(source);
			fw = new FileWriter(dest);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = null;
			while((line=br.readLine()) != null) {
				System.out.print(line);
				bw.write(line);
			}
			
			
//			while((res=br.read()) != -1) {
//				System.out.print((char)res);
//				bw.write(res);
//			}
			
			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("  ===done===");
		
		

	}

}
