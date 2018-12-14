package com.method.call;

import java.io.File;
public class Ch14FileTest {
	public static void main(String[] args) {
		String path = "C:\\jp\\workspace_java\\com.method.call\\src";		
		Ch14FileTest t = new Ch14FileTest();
		t.showList(path);
	}
	
	public void showList(String path) {
		File f = new File(path);
		//f.lastModified();
		File[] farr = f.listFiles();
		
		for(int i=0; i<farr.length; i++) {
			File getiFile = farr[i];
			if(getiFile.isDirectory()) {
				System.out.println("<DIR>\t" + getiFile.getName());
				//*****
				//  \\java_prj\\src\\  com \\ kosmo \\aa.txt
				showList(path + "\\" + getiFile.getName());
			} else {				
				System.out.println("\t"+getiFile.length()+ "\t"  + getiFile.getName());
			}
		}
	}
}

//---------------------------------------------------------
/*
package com.kosmo.test222;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch14FileTest {

	public static void main(String[] args) {
//		String source = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test222\\aae.txt";
//		
//		File f = new File(source);
//		System.out.println(f.getPath());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getName());
//		System.out.println(f.getParent());
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
//		f.delete();
		String path = "C:\\jp\\workspace_java\\java_prj\\src";
		Ch14FileTest t = new Ch14FileTest();
		
		t.showList(path);
		
		System.out.println("====done====");
	}
	public void showList(String path) {
		File f = new File(path);
		//f.lastModified();
		File[] farr = f.listFiles();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm");
						
		for(int i=0; i<farr.length; i++) {
			File getiFile = farr[i];
		//for(File getiFile : farr) {
			String rwx = "";
			long lTime = getiFile.lastModified();
			Date date = new Date(lTime);
			String dateStr = format.format(date);
					
			if(getiFile.canRead()) {rwx += "r";}  else {rwx += "-";}
			if(getiFile.canWrite()) {rwx += "w";}  else {rwx += "-";}
			if(getiFile.canExecute()) {rwx += "x";} else {rwx += "-";}
			
			if(getiFile.isDirectory()) {
				System.out.println("<DIR>\t"+ rwx + "\t" +dateStr + "\t" + getiFile.getName());
				showList(path + "\\" + getiFile.getName());
			} else {				
				System.out.println(getiFile.length()+ "\t" + rwx  + "\t" +dateStr + "\t" + getiFile.getName());
			}
		}
	}

}
*/




