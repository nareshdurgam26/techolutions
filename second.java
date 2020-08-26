package com.techoloution;

public class second {
	
	public static double volume(double d) {
		double  r=d/2;
		return (4*Math.PI*(r*r*r))/3;
	}
	
	public static void main(String args[]) {
		double d=10.00;
		System.out.printf("%.2f",volume(d));
		
	}

}
