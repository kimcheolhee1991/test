package com.method.call;



//2018 07 26 18:19

/**
 * 이건 내가 <b>첫날 만든 자바파일이다<p>
 * 그래서 어쩌구 저쩌구..<p>
 * @author kim.c.h
 *
 */



 public class HelloTest {
 
	
	 static int allnum = 1000;

	 //메서드 이름 : main
	 //public _0_ main(_1_2_)
	 //0 : 리턴 타입 int string void(리턴이없다)
	 //1 : 파라미터 타입
	 //2 : 파라미터 명, 변수명
	 
	 /**
	  * 이건 내가 만든 첫날 메인이다<p>
	  * @param args 그냥 주는거<p>
	  */
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
					System.out.println("dddd");
					System.out.println(allnum);
					int res = add (12,4 );
					System.out.println(res);
//	메모리에 올리는 법
//	static
//	new
					HelloTest h1 = new HelloTest();
					HelloTest h2 = new HelloTest();
					HelloTest h3 = new HelloTest();
						
					
					HelloTest []h = new HelloTest[3];
					h1.allnum = 2000;		
					System.out.println(h1.allnum);
					h2.allnum = 3000;
					System.out.println(h2.allnum);	
					
					//System.out.println(h[1].allnum);
	
	HelloTest aaa = new HelloTest();
	

	System.out.println(aaa);
	
	System.out.println(aaa.allnum);//1000
	
	int res22 = aaa.add(55,10);// 65
	System.out.println(res22); // 
	
	}
	
	
	
	
	
	
	
	
	public static int add (int a, int b) {
		System.out.println("----"+allnum);
		return a+b;

}}
	

