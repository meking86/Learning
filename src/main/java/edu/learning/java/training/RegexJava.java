package edu.learning.java.training;

import java.util.Scanner;

import edu.learning.java.exception.InvalidException;


public class RegexJava {

	public static void main(String[] args) {
		
		RegexJava obj = new RegexJava();
		Scanner sn = new Scanner(System.in);
		
		boolean  bool = obj.validatPhone(sn.nextLine());
		
		System.out.println(" bool " + bool);
	}

	public boolean validatPhone(String nextLine) {
		System.out.println("nextLine.length() " + nextLine.length());
		if(nextLine.length()<10){
			throw new InvalidException("Please number of including area code : in total 10");
		}
		//validate phone numbers of format "1234567890"
		if(nextLine.matches("\\d{10}"))
			return true;
		//=validating phone number with -, . or spaces
		else if(nextLine.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
			return true;
		//validating phone number with extension length from 3 to 5
		else if(nextLine.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
			return true;
		//validating phone number where area code is in braces ()
		else if(nextLine.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")||nextLine.matches("\\(\\d{3}\\)\\d{3}\\d{4}"))
			return true;
		
		return false;	
	}
}
