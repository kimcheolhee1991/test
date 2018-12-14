package com.method.call;

import java.util.*;

public class MethodCallTest1 {

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MethodCommon1 mc1 = new MethodCommon1();
		
		
		
		int[] iar = {1,2,3,4,5,6};
		int res = mc1.getItem(iar);
		
		System.out.println(res);
		
		
		
		HashMap hm = new HashMap();
		
		hm.put("key_name", "kim");
		
		String res1 = mc1.getItemByMap(hm);
		
		System.out.println(res1);
		
		
		String[] starr = {"a","b"};
		
		ArrayList all = mc1.convertArrayToList(starr);
		
		System.out.println(all);
		
		
		int [] iarr = {1,2,3,4,5};
		
		int res2 = mc1.next(iarr, 1);
		
		System.out.println(res2);
		
		
		String log;
		log = mc1.login("mggm7800", "dkfqk6278");
		System.out.println(log);
		
		
		String para;
		MethodCommon1 mc2 = new MethodCommon1();
		MethodCommon1 mc3 = new MethodCommon1(123, "12312");
		
		System.out.println(mc2);
	}
	
	

}
