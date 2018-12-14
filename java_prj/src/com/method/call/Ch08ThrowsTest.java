package com.method.call;

public class Ch08ThrowsTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		System.out.println(1);
		try {
		myPrint();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(2);
		}finally {
		
		System.out.println(3);
	
		}
		System.out.println(4);
		
		}

	
	public static void myPrint() throws Exception  {
		
		System.out.println("myPrint111");
		try {
		int res = 10/0;
		}catch(ArithmeticException e) {
		System.out.println("연산에러");
		}
		System.out.println("myPrint222");
		throw new Exception();
}
}
