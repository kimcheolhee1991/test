package com.method.call;

public class javapro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   int jtScore [][] = {
			{100, 90, 80, 12}
			,{88, 87, 86, 12}
			,{44, 47, 49, 14}
			
};
	   
	  
	   
	   int jtScore2 [][] = new int[jtScore.length+1][jtScore[0].length+1];
	   
	   for(int i=0; i<jtScore.length;i++) {
		   
		   for(int j=0; j<jtScore[i].length;j++) {
			  
			   
						   
			   jtScore2[i][j] = jtScore[i][j];
			   jtScore2[i][jtScore2[i].length-1] +=  jtScore2[i][j];
			   jtScore2[jtScore2.length-1][j] +=  jtScore2[i][j];
			   jtScore2[jtScore2.length-1][jtScore[i].length]+=  jtScore2[i][j];
			
		   }
	   }
	   for(int i=0; i< jtScore2.length;i++) {
		   for(int j=0; j< jtScore2[i].length;j++) {
			   System.out.printf("%4d",  jtScore2[i][j]);
			
			   
		   }
		   System.out.println();
	   }
		
	
	   
	
	}
	
	

}
