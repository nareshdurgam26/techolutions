package com.techoloution;

public class third {
	
	public static int conseutiveDiff(int A[]) {
		int result=A[0]-A[1];
		
		for(int i=2;i<A.length;i++) {
			result=result-A[i];
		}
		return Math.abs(result);
	}
	
	public static void main(String args[]) {
		
		int A[]= {4,3,6,5};
		System.out.print(conseutiveDiff(A));
	}

}
