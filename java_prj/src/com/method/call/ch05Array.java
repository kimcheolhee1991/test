package com.method.call;

public class ch05Array {

	
	public static void main(String[]args) {
		
		//타입[] ___ = new 타입[];
		//numArr[0] ~ numArr[크기-1]
		//Hello _h_ = new Hello();
		//x번째 : 인덱스 x
		
		
		//작은 괄호는 빼고 바로 꺽쇠를 쓴다
		int[] numArr = new int[5];
		//System.out.println(numArr[5]);
		
		int[] numArr2 = new int[3];
		int[] numArr3 = new int[] {10,30,40};
		int[] numArr4 = {10,30,40,50} ;
		
		int[] numArr5 = new int[3];
		numArr5[0] = 10;
		numArr5[1] = 30;
		numArr5[2] = 40;
		
		
		
		String[] charArr1 = new String[] {"aa","bb"};
	   System.out.println(charArr1[0]+ charArr1[1]);
		
		char[] charArr3 = new char[] {'a','b','c'};
		System.out.println(charArr3[1]);
		
		for(int i=1; i<6; i++) {
			System.out.println(i);
		}
		
		int numarr[] = new int[] {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println(numarr[i]);
		}
		
		int numarr1[] = new int[] {1,2,3,4,5};
		for(int i=0;i<numarr1.length;i=5) {
			System.out.println(numarr1);
		}
		
//		int numarr2[] = new int[] {1,2,3,4,5,6,7,8,9};
//		for(int i=2;i<=numarr2.length;i++) {
//			System.out.println(i+"단");
//		
//			int numarr3[] = new int[] {1,2,3,4,5,6,7,8,9};
//			for(int j=1;j<=numarr3.length;j++) {
//				System.out.println(i+"x"+j+"="+(i*j));
//			
//		
//		}
		int numarr2[] = new int[] {1,2,3,4,5};
		for(int i=0;i<3;i++) {
			System.out.println(i+3);
	}
		//for사용해서 총합, 평균 출력
		int stu[] = {100,80,90};
		int sum = 0;
		for(int i = 0; i<stu.length;i++) {
			sum += stu[i];
		}
		System.out.println("총합은"+ sum+"평균은"+sum/stu.length);
		
		System.out.println(); System.out.println(); System.out.println();
		
		String[] astr = {"abcde"};
		for(int i=0; i<astr.length; i++) {
			System.out.println(astr[i]);
		}
		String alpa = "abcde";
		for(int i=0; i<alpa.length(); i++) {
			char c = alpa.charAt(i);
			System.out.println(c);
		}
		
		char[] eqstrs = alpa.toCharArray();
		System.out.println(eqstrs);

		System.out.println(); System.out.println(); System.out.println();
		
		
		
		
		
		
		
//		100 90 80
//		88 87 86
//		44 47 49
// 학생별 평균점수 계산  세로
// 각 회차별 평균점수 계산 가로 
		int jtScore [][] = {
							{100, 90, 80, 12}
							,{88, 87, 86, 12}
							,{44, 47, 49, 12}
							
		};
		
		int hap = 0;
		int avg = 0;
		for (int i =0; i<jtScore.length; i++) {
			
			
			for(int j= 0; j<jtScore.length;j++) {
				
				 
				hap += jtScore[i][j];
				
			
				
				
			}
			System.out.println((i+1)+"학년 학생별 평균점수  "+(double)hap/jtScore[i].length);
			hap =  0;
		}
			
			
			
			
			
			for(int i = 0; i<jtScore[0].length;i++) {
				for(int j =0; j<jtScore.length;j++) {
					
					
					avg += jtScore[j][i];
				
			}
			 
			
			 System.out.printf("%d 회차 평균점수 %d %n",(i+1),avg/jtScore.length);
			 avg =  0;
			 
		
		}
		
		
	
		
	}
}
	
