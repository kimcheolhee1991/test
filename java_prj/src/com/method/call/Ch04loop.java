package com.method.call;

import java.util.Scanner;

public class Ch04loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(_,조건,_){...}
		//while(조건){...}
		//do{...} while(조건)
	
	
	
	
	
//	for(int i=1; i<10; i++) {
		
	//	System.out.println(i);
	//}
	
//int i =1;
//	for( ;i<3; ) {
		
//		System.out.println(i);
//		i=i+1;
	//}
	

	for(int k=2; k<10; k++) {
		System.out.print(" " + k + "단\t");
	}
	System.out.println();
	
	for(int j=1; j<10; j++) {
		for(int i=2; i<10; i++) {
			System.out.print(i+"x"+j+"="+(i*j)+"\t");
		}
		System.out.println();
	}
	
	
	
	
	for(int dan=2; dan<10; dan++)
	{
		System.out.println("\n"+dan+"단");
		
		for(int gob=1; gob<10; gob++) {
			System.out.print(dan + "*" +gob +"= "+ (gob*dan+"\t"));
			
		
		}
		
	}
	System.out.println("\n\n");
	for(int i = 10; i>0; i--)
	   {
		
		   System.out.println(i);
		  
		   System.out.println("a"+i);
	   }
	
	String job = "SALES";
	int num =3;
	while (job =="SALES") {
		System.out.println("true");
		num --;
		if(num==0)break;
	}
	System.out.println();
	
	
	
	
	
	
	int i,j;
	i=1;
	System.out.println();
	while(i<10) {
		j=2;
		while(j<10) {
			if(i==1)
				System.out.print(" "+j+"단\t");
			else
			{
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
			j++;
			if(i==10)break;
		}
		i++;
		System.out.println();
	    }
	System.out.println();System.out.println();System.out.println();
	
//	int age = 0;
//	do {
//		System.out.println("나이 : ");
//		Scanner s = new Scanner(System.in);
//		age = s.nextInt();
//		//if(line.equals("q"))break;
//	} while(age<99);
//	System.out.println("군대가세요");
	
	
	
	System.out.println();System.out.println();System.out.println();
	
	
	int sic = 0;
	int hap = 0;
	for(i=0;i<11;i++) {
		
		
		sic = i + 1;
		hap = hap+i;
		
		
	}
	System.out.println("계산식 "+ sic  );
	System.out.println("1부터10까지 합 "+ hap);
	System.out.println();System.out.println();System.out.println();
	System.out.println();System.out.println();System.out.println();
	
	
//	int sum =0;
//	int scannum=0;
//	
//	System.out.print("어떤 숫자까지 합할지 입력하시오 : ");
//	Scanner c = new Scanner(System.in);
//	scannum = c.nextInt();
//	for(i=1; i<=scannum;i++) {
//		sum = sum+i;
//	}
//	
//	System.out.println("1부터 "+ scannum + "까지의 합은  " + sum +"입니다.");
	System.out.println();System.out.println();System.out.println();
	System.out.println();System.out.println();System.out.println();
	
	final int SIZE = 5;
	for(int i1=1;i1<=SIZE;i1++) {
		for(int num1=1; num1<=i1;num1++) {
			System.out.print("*");
		}
		System.out.println("");
	}



	}
}
