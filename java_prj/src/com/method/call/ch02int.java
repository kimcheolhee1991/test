package com.method.call;

//인스턴스 함수 : 메모리에 올라가 주소를 갖는 변수, 메서드
//인스턴스화 : 주소를 만든다(new)
//클래스 안에는 변수 또는 메서드들이 올 수 있다.
public class ch02int {

	
	//전역 변수는 초기화하지 않으면 기본값으로 초기화 된다 
	static int point; // static 변수=클래스 변수 //이름이 같으면 안됨
	       int point2; //인스턴스 변수 
	       
	       
	static final int NOT_EDIT_NUM = 500;
	public static void main(String[] args) {
		
		
		
		System.out.println(point);
		System.out.println(point);
		//일반변수는 new해서 메모리에 올려놓고사용
		ch02int v = new ch02int();
		System.out.println(v.point2);
		
		
		
		
		
		//---------------------------------------------
		
				
		
		
		//지역변수는 반드시 초기화
		int a; //지역변수//변수 선언
		
		
		a = 4;//초기화
		
		int b = 10;
		
		System.out.println(a);
		
		b= 7; //값을 다시 할당했다. 
		
		
		//기본(primitive) 타입 8개 boolean, char, byte, int, float, double, short, long
		//참조(reference) 타입 4바이트
		boolean boll = false; //true
		char c = 'c';
		byte bt = 127  ; //2^7승 -1 
		short s = 32767; 
		int i = 2147483647; //정수
		long d = 555 ;
		float f = 3.0f; //리터럴 f,d
		double l = 3.0; //소수점의 기본은 더블 
		
		String aa ="hello";
		System.out.println(aa);
          Ch02Var v2 = new Ch02Var();
		
          
          //상수 : final이 붙은 변수
          final int NOT_EDIT_NUM = 500;
          System.out.println(NOT_EDIT_NUM);
          // 에러 : 상수는 값을 초기화한후 재할당못한다.
          
          
          //String 에 어떤 연산을 해도 String
          String str1 = null;
          String str2 = "";
          char ic = '\u0000';
          //char ic=''; <-- x
          String str3 = "A";
          
          
          int h = 100;
          int z = 50;
          
          System.out.println(str3+h+z);
          System.out.println(str3+(h+z));
          
          //int봏다 작은 크기의 탕비들을 더하면 결과는
          char calph = 'A';
          System.out.println(calph+1);
          
          //캐스팅  : 형변환
          
          System.out.println((char)(calph+1));
          
        //기본타입 중 boolean만 제외한 나머지는 캐스팅 가능
          boolean b1 = true;
        
          //참조타입 <--> 기본타입xxxxx 캐스팅 불가
          String numstr = "11";
          //System.out.println((int) numstr);
          
          Boolean bw;
          //Boolean.parseBoolean("true");
          Character cw;
          Byte btw;
          Short sw;
          //Short.parseShort("14");
          Integer it;
          Long lw;
          Float fw;
          Double dw;
          Double.parseDouble("3.4");
          
          
          
          //참조타입 <--> 기본타입wrapper 클래스
          int pint = Integer.parseInt(numstr);
          System.out.println(pint+5);
          
          double divres = (float)10/8;
          System.out.println(divres);
	}
}
