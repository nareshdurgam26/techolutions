package com.techoloution;

public class first {

	public static int absDifference(int A[]) {
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0;i<A.length;i++) {
			
			if(i%2==0)
				evenSum+=A[i];
			else
				oddSum+=A[i];
		}
		
		return Math.abs(oddSum-evenSum);
	}
	
	public static void main(String args[]) {
	
	int A[]	= {1,2,3,4,5,6};
	System.out.print(absDifference(A));
	
	}
}
