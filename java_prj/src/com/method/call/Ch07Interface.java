package com.method.call;

public interface Ch07Interface {

	//인터페이스에 변수는 상수화 시켜라 (대문자로써라)
	//모든 변수에 PUBLIC FINAL STATIC 키워드가 붙는다
	
	
	
	//모든 메서드는 추ㅡ상(바디가없는)메서드이어야 한다.
	//public abstract void myPrint(){] 에러
	//모든 메서드에 public abstract 키워드가 붙는다.
	final static  int NUM = 100;
	
		public void myPrint() ;
		
}
