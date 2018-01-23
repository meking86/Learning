package edu.learning.java.training;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseObj = new ReverseString();
		System.out.println(reverseObj.reverStringMethod("madams"));
		
	}
	
	public String reverStringMethod(String s){
		int i = s.length()-1;
		String returnString = "" ;
		while(i>=0){
			returnString = returnString + s.charAt(i);
			i--;
		}
		
		return returnString;
		
	}
}
