package com.method.call;


import java.util.*;

public class MethodCallTest {

	//javac MethodCallTest.java
	//      MethodCallTest.class
	//java MethodCallTest 5 58 hello
	
	
	//오버로딩 : 하나의 클래스 안에서 n개의 메서드가 이름이 같고, 매개변수의 타입이 다른것.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. static static
		//2. 쟤 클래스이름.메서드명
		//3. 메서드명(내꺼)
		
		MethodCommon mc = new MethodCommon();
		
		System.out.println(mc.add(4.0, 5.0));
		
		int abc[] = {100,200,300,50};
				
	//	System.out.println(mc.getItem(abc));
		
		
//		HashMap map = new HashMap();
//		
//		map.put("key_name", "아무개");
//		map.put("key_age",25);
//		String res3 = mc.getItembyMap(map);
//			System.out.println(res3);
		
	
		
	
	
	String [] list = {"보라돌이","뚜비","나나","뽀"};
	
	ArrayList list1 = new ArrayList();
	
	list1 = mc.covertArrayToList(list);
	
	
	
	System.out.println(list1.size());
	
	System.out.print(list1+"\n");
	for(int i=0; i<list1.size();i++) {
		
		System.out.println(list1.get(i));
	}
	
//		int call;
//		int[] arr = {1,2,3,4,5};
//		call= mc.next(arr, 4);
//		System.out.println(call);
//		
//		
//		 Object num = mc.getPoint();
//		 Object st = mc.getNation();
//       
//		System.out.println(num);
//		System.out.println(st);
//		
//		System.out.println((int)num+(int)num);
//		 
//		
//		int ga;
//		int [] ase = {1,2,3,4,5,6,7};
//		ga = mc.getItem(ase);
//		System.out.println(ga);
//		
//		mc.setPoint(20);
//		mc.setNation("jp");
//		
//		int llll = mc.getPoint();
//		System.out.println(llll);
//		String lll = mc.getNation();
//		System.out.println(lll);
//		
//		
//	
//	HashMap LogIn = new HashMap();
//	
//	LogIn.put("key_id","mggm7800");
//	LogIn.put("key_password","dkfqk6278");
//	String res3 = mc.getItembyMap(LogIn);
//	System.out.println(res3);
//	System.out.println();System.out.println();
//	
//	
	
	String para;
	para = mc.login("mggm7800", "dkfqk6278!");
	System.out.println(para);
		
	
	
//	String parapara;
//	parapara = mc.getValueByMap("")
	
	String keyvalue;
	
	MethodCommon mc2 = new MethodCommon();
	MethodCommon mc3 = new MethodCommon(123,"sadfasdf");
	
	keyvalue = mc3.getValueByMap("key_id");
	
//	
//	keyvalue1=mc.getValueByMap
	System.out.println(keyvalue);
	
	}
	
}
