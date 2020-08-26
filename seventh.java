package com.techoloution;

public class seventh {

	public static int largestDiff(int A[]) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<A.length;i++) {
			if(min>A[i])
				min=A[i];
			
			if(max<A[i])
				max=A[i];
		}
		
		return max-min;
	}
	
	public static void main(String args[]) {
		int A[]= {10,11,5,6,8,9,4,3,15,6,4,5,1,4,7};
		System.out.print(largestDiff(A));
	}
	
	
}
