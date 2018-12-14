package com.kosmo.test;

public class Ch02for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<6; i++) {
			
			for(int j =0 ; j<i;j++) {
				
				System.out.print(" ");
				
			}
			System.out.println("★");
			
		}
	
		System.out.println("");System.out.println("");System.out.println("");
		
		
	for(int i =1; i<27;i++) {
		
		System.out.print(i+" ");
	if(i%10==6) {
		
		i +=4;
		System.out.print("\n");
	}
	
	}
	

}
}