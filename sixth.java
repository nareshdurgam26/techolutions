package com.techoloution;

public class sixth {

	public static String reflectionValue(String input, int start, int end) {
        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba"; 	
		String answer = ""; 
	        
	        
		for(int i=start-1;i<end;i++) {
			answer=answer+reverseAlphabet.charAt(input.charAt(i)-'a');
			
		}
		
		for(int i=end;i<input.length();i++) {
			answer=answer+input.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
	  	System.out.print(reflectionValue("abcd",1,2));
	}
}
