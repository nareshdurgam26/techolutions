package com.techoloution;

public class fourth {
	
	
	public static int[] clockWiseShift(int A[], int x) {
		
		int n=A.length;
		
		for(int i=0;i<x;i++) {
		 int temp=A[n-1];
		 
		   for(int j=n-1;j>0;j--) {
			   A[j]=A[j-1];
		   }
		   
		   A[0]=temp;
		}
		
		return A;
	}
	
	public static void main(String args[]) {
		
		int A[]= {3,4,5,6,5};
		int x=2;
		int B[]= clockWiseShift(A, x);
		
		for(int i=0;i<B.length;i++)
			System.out.print(B[i]+ " ");
	}

}
