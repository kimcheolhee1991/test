package com.method.call;

public class Ch04if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empno = 7733;
		int sal = 2000;
		if(empno==7733 && sal>2000) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		int deptno = 10;
		if(deptno ==10) {
			System.out.println("10번부서");
		}
		else if(deptno==20) {
			System.out.println("20번부서");
			
		}
		else if(deptno==30) {
			System.out.println("30번부서");
		}
		else {
			System.out.println("해당없음");
		}
	
		int comm = 100;
		if(comm >=90) {
			System.out.println("90");
		}
		else if(comm >=80) {
			System.out.println("80");
		}
		else {
			System.out.println("해당없음");
		}
	
		
	
	
        
		switch(deptno) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
		break;
		
		default :
			System.out.println("해당없음");
		}
		
		System.out.println("====done====");
	
		
			
	
	}
	
	

}
