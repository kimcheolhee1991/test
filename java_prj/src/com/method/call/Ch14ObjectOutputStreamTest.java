package com.method.call;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Ch14ObjectOutputStreamTest {

	public static void main(String[] args) {
		//		String source = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\aaa";
		String source = "C:\\jp\\workspace_java\\com.method.call\\src\\com\\method\\call\\object.txt";


		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(source);
			oos = new ObjectOutputStream(fos);

			ArrayList<String> list = new ArrayList<String>();

			list.add("aaa");
			list.add("bbb");
			list.add("bcc");
//
//			Ch99JDBCTest t = new Ch99JDBCTest();
//			ArrayList<EmpVO> list = t.empList();
			
			
			MemberVO vo = new MemberVO();
			vo.setMid("LEE");
			vo.setMpw("9999");

			
			oos.writeObject(list);
			oos.writeObject(vo);			
			//			fos = new FileOutputStream(source);
			//			oos = new ObjectOutputStream(fos);
			//			



		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();			
			
		}finally {
			try {
				if(oos != null)
					oos.close();
			}catch (IOException e) {
				e.printStackTrace();

			}

		}

	}





}
