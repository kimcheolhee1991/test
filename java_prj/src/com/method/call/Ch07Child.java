package com.method.call;

import com.kosmo.other.Ch07Other;

public class Ch07Child extends Ch07Parent {

	public void childFunc() {
		System.out.println("childFunc");
	}
	
	
	
	//상속은  부모 클래스에 있는걸 가져와서 내꺼처럼 쓴다.
	public static void main(String[] args) {
		// 오버라이딩 : 오버라이딩
		//메서드의 선언부는 같고바디를 변경
		//접근제어자는 같거나 커진다
		//예외는 부모가 가지고있는 예외보다 같거나 작다 
		
		
		//protected - 같은 패키지, 다른 패키지 자손은 허용
		//default - 같은 패키지
		//private - 해당 클래스 내에서만
		
		//다형성 : 메소드 : 오버라이딩된 자식 메서드만
		//     : 변수   : 부모꺼만 호출 가능
		//부모 타입의 변수에 자식인스턴스를 할당
		//Parent p = new Child();
		
		
		System.out.println(num);
		
		Ch07Other o = new Ch07Other();
		
		
		o.myPrint();
		System.out.println(Ch07Other.othernum);
		System.out.println(o.othernum);
		
		Ch07Child2 ch = new Ch07Child2();
		
		int res = ch.add();

		System.out.println(res);
	
		
		
	
	}

}
