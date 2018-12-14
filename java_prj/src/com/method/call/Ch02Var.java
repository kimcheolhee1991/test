package com.method.call;

public class Ch02Var {
	
		
		 
		//add 
		//sub
		//mul
		//div
	
	
	 static String point = 
			 "로또";
	 

	
	public static void main(String[] allgs) {
	
		
		
		
		Ch02Var aaa = new Ch02Var();
		
		int res4 = aaa.sub(50, 10);
		System.out.println(res4);
		
		
		int res = aaa.add(50, 10);
		System.out.println(res);
		
		int res1 = aaa.mul(50, 10);
		System.out.println(res1);
		
		int res2 = aaa.div(50, 10);
		System.out.println(res2);
	}
	
public static int add(int a, int b) {
		
		return a+b;
	}
	public static int sub(int a, int b) {
		
		return a-b;
	}
	public static int mul(int a, int b) {
	
	return a*b;
}
	public static int div(int a, int b) {
	
	return a/b;
}
	

}


