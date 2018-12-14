package com.method.call;


import java.util.*;

public class MethodCommon {
    
	 int point = 50000;
	 String nation = "Korea";
	 HashMap map = new HashMap();
		
	//생성자 : 클래스이름과 동일한 메서드 
	//     : 리턴이 없다  void 아님.. 그냥 2단구성
	//     : 컴파일러는 해당클래스를 컴파일 시 생성자가 단 한개도 없을 경우 기본 생성자를 만들어준다.
	//생성자 함수 = construct
	
	
	//초기화 (기본생성자)
		public MethodCommon() {
		
		map.put("key_id", "hong");
		map.put("key_pw", "1234");
		map.put("key_name", "홍씨");
	}
		
		//파라미터가 있는 생성자
		//매개변수가 있는 생성자
		public MethodCommon(int pt, String nn) {
			this.point = pt;
			this.nation = nn;
			
			map.put("key_id", "lee");
			map.put("key_pw", "1235");
			map.put("key_name", "이씨");
			
		}
		
	
	//전역변수값 리턴
	//get+변수명 메서드 생성
	
	
	public int getPoint() {
		
		return point;
		
	}
	
	public  String getNation() {
	return nation;
		
	}
	
	//입력받은 파라미터 값을 전역변수에 넣은
	//set+변수명 메서드를 만들어라.
	
	public void setPoint(int a) {
		
		this.point = a;
	
	}
	
	public void setNation(String b) {
		
		this.nation=b;
		
	}
	
	
	// double 타입 2개를 입력받아 합을 리턴하는 add 메서드를 만드시오
	
	
	public static double add(double a , double b) {
				
		return (double)a+b;
		
	}
		
	//int 형 배열을 입력 받아서 세번째 값을 리턴하는 getItem이란 메서드를 생성하세요
		
	
	
	
	public static int getItem(int[] a) {
		
		int gap=0;
		if(a.length<3) {
			
			gap = a[0];
		}
		else gap=a[3];
		return gap;
	}
		
		
//	public static int getItem(int [] a) {
//		
//		int aa =0;
//		
//		if(a.length <3) {
//			
//			aa = a[3];
//		}
//		else aa=a[1];
//			
//			return aa;
//			
//		}
		
	
	//hashmap을 파라미터로 받아서
	//키값이 name인 값을 리턴
	//getItembyMAP
//	public static String  getItembyMap(HashMap hm) {
//		
//		String name=(String) hm.get("key_name");
//		int age =(int)hm.get("key_age");
//	
//		
//		return "이름 : "+name+"  나이 :  "+age;
//		
//	}
//	
	
	//String 배열을 파라미터로 받아 어레이 리스트로 변환해서 리턴
	//메서드명 : convertArrayToList
	
	public ArrayList covertArrayToList(String[] aa) {
		
	//	String [] as = new String [] {"보라돌이","뚜비","나나","뽀"};
		
		ArrayList all = new ArrayList();
		for(int i=0; i<aa.length;i++) {
			
			all.add(aa[i]);
		
		}
		
		return all;
		
	//배열에 인덱스를 파라미터로 받아
	//그 인덱스의 다음 데이터를 리턴
	//인덱스명 : next
	// 배열 모양 1,2,3,4,5

	
//	public int next(int[] a,int b) {
//		int len=-1;
//		if(b+1<a.length) 
//			len = a[b+1];
//		
//			
//	
//			return len;
//			
//		
			
	//
	
}
	//사용자로부터 아이디,비밀번호를 입력 받아 
	//이름을 리턴하는 로그인 메서드를 만드시오
	
	
	
	
	
	public String login(String a, String b) {
		 
		String id="mggm7800";
		String password="dkfqk6278!";
		String name =null;
		
		if(a==id && b==password) {
			name = "홍길동";
		}
		return name;

		
		
		
	}	
	//맵에 키값을 파라미터로받아서 
	//해당 키에 해당하는 값을 리턴
	//getValueByMap 메서드 생성
	
	public String getValueByMap(String a) {
		
		String value = (String)map.get(a);
		
		
		return value;
		
	}
}
		
		
	

