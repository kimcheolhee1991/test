package com.method.call;

import java.util.*;

public class MethodCommon1 {

	int point = 50000;
	
	String nation = "korea" ;
	
	HashMap map = new HashMap();
	
	
	public MethodCommon1() {
		map.put("key_id", "1");
		map.put("key_pw", "1234");
		map.put("key_name", "hong");
		
	}
	
	public MethodCommon1(int pt, String nn) {
		this.point = pt;
		this.nation = nn;
		
		map.put("key_id", "2");
		map.put("key_pw", "12341");
		map.put("key_name", "le");
		
	}
	
	
	//문제 1
	//전역변수값 리턴 get+변수명 메서드 작성
	
	public int getPoint() {
		return this.point;
		
	}
	
	public String getNation() {
		
		return this.nation;
	}
	
	
	
	//문제2
	//입력받은 파라미터값을 전역변수에 넣고
	//리턴받지않는 set+변수명 메서듲 ㅏㄱ성
	
	
	public  void setPoint(int o) {
		
		this.point = o;
	}
	
	
	public void setNation(String s) {
		
		this.nation = s;
	}
	
	
	
	//문제3
	//double 타입을 입력 받아 합을 리턴하는 add메서드 작성
	
	
	public double add(double a, double b) {
		
		return (double)(a+b);
	}
	
	
	
	//문제4
	//int []배열 입력 받고
	//3번째 값을 리턴하는 getItem 메서드 작성
	
	public int getItem(int[] iar) {
		
		int res =0;
		if(iar.length>=3) {
			
			res = iar[3];
		}
		return res;
		
	}

	
	//문제5
	//HashMap을 파라미터로 받아 키값이 key_name인 값을 리턴
	// getItemByMap 메서드 작성 
	
	public String getItemByMap(HashMap hm) {
		
		String rere = (String)hm.get("key_name");
		return rere;
		
	}
	
	
	
	//문제6
	//String 문자배열을 파라미터로 받아
	//ArrayList로 변환해서 그 ArrayList로리턴하는
	// convertArrayToList 메서드 작성
	public ArrayList convertArrayToList(String[] starr) {
		
		ArrayList al = new ArrayList();
		
		for(int i = 0 ; i<starr.length;i++) {
			al.add(starr[i]);
			
		}
		return al;
	}
	
	
	//문제7
    // 숫자 배열의 인덱스(n번째) 파라미터를 받고
	// 그 인덱스의 다음 데이터를 리턴하는 next 메서드를 작성하시오 

    public int next(int[]a, int b) {
    	int res =0;
    	if(a.length>b+1) {
    		
    		res = a[b+1];
    	}
    	else {
    		res = -1;
    	}
    	return res;
    	
    }
  //사용자로부터 아이디,비밀번호를 입력 받아 
  	//이름을 리턴하는 로그인 메서드를 만드시오
    
    
    public String login(String a, String b) {
    	String id = "mggm7800";
    	String pw = "dkfqk6278";
    	String name = null;
    	
    	if(id=="mggm7800"&& pw=="dkfqk6278") {
    		
    		name = "홍길동";
    	}
    	return name;
    }

}
