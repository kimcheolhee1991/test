package com.method.call;

public class Ch08ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try여러번 사용가능
		//try 안에 try 중첩 가능 
		//finally <- 예외고자시고 무조건 실행
		//finally는 catch 없더라도 ㅆ쓸수있다 
		
		//예외처리는 코드를 끝까지수행하기위해서 발생ㄷ된 예외를 처리해주는것이드아
		//트라이 단독으로는 못온다 
		//트라이 캐치 파이널리 , 트라이 캐치 , 
		
		//catch절에서 엑셉션은 작은거에서 큰거 순으로 적어라 
		int[] arr = new int[2];
		System.out.println("1");
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았따");
		
		e.printStackTrace()
		
		;
		}
		System.out.println("2");
		System.out.println("3");
	
	}

}
