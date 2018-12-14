package com.method.call;

import java.util.*;

public class Ch11PropertyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> arr = new ArrayList<Object>();
	    
		
		
		MemberVO mvo = new MemberVO();
	    
		mvo.setMseq(1);
		mvo.setMpw("1234");
		mvo.setMname("kim");
		mvo.setMid("mggm7800");
		mvo.setMgubun("user");
		arr.add(mvo);
	    
	    
		
		MemberVO  mvo1 = new MemberVO();
	    
		mvo1.setMseq(2);
		mvo1.setMpw("12342");
		mvo1.setMname("kim2");
		mvo1.setMid("mggm78002");
		mvo1.setMgubun("user");
		arr.add(mvo1);
	
		
		
		
		for(int i =0; i<arr.size();i++) {
			
			//MemberVO len = (MemberVO)arr.get(i);
			
//			System.out.println(len.getMseq()+"\t"+len.getMpw()+"\t"+len.getMname()
//			+"\t"+len.getMid()+"\t"+len.getMgubun());
			
			
			
		}
		
	
	
	
	}
	

}
