package edu.learning.java.training;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseObj = new ReverseString();
		System.out.println(reverseObj.reverStringMethod("madams"));
		
	}
	
	public StringBuffer reverStringMethod(String s){
		int i = s.length()-1;
		StringBuffer returnString = new StringBuffer() ;
		while(i>=0){
			returnString.append(s.charAt(i))   ;
			i--;
		}
		
		return returnString;
		
	}
}
