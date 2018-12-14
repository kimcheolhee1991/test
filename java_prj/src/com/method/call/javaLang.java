package com.method.call;

import java.io.IOException;

public class javaLang {

	
	static int num = 10;
	int num2 = 10;
	public static void main(String[]args) {
		
		
		String sss = "   801546  -  1234567   ";
		
		System.out.println(sss.charAt(1));
		System.out.println(sss.length());
		System.out.println(sss.substring(0,6));
		System.out.println(sss.concat("000"));
		System.out.println(sss.indexOf("-"));
		System.out.println(sss.lastIndexOf("-"));
		System.out.println(sss.replace("-", "*"));
		
		String[]aa = sss.split("-");
		System.out.println(aa[1]);
		
		System.out.println(sss.trim());
		System.out.println(sss.toLowerCase());
		System.out.println(sss.toUpperCase());
		
		javaLang lang = new javaLang();
		String str1 = "abc";
		String str2 = "abc";
		
		
		String str3 = new String( "abc");
		String str4 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(str3 == str4) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(!str3.equals(str4)) {
			
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		System.out.println(num);
		int a = 10;
		String astr = a+"";
		System.out.println(astr+3);
		
		String cname = lang.getClass().toString();
		System.out.println(cname);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("d");
		
		System.out.println(sb);
		
		System.err.println(sb);
		try {
			int aaa = System.in.read();
			System.out.println(aaa);
		}
		catch (IOException e) {
			System.out.println("에러가났어요..");
			e.printStackTrace();
			
		}
	}
}
