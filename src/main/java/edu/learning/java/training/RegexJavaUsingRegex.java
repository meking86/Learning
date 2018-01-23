package edu.learning.java.training;

import java.util.regex.Pattern;

import edu.learning.java.exception.InvalidException;

public class RegexJavaUsingRegex {

	
public static void main(String[] args) {
		
	RegexJavaUsingRegex obj = new RegexJavaUsingRegex();
		//Scanner sn = new Scanner(System.in);
		
		boolean  bool = obj.validatPhone("");
		
		//System.out.println(" bool " + bool);
	}

	public boolean validatPhone(String nextLine) {
		if(nextLine.length()<10)
			throw new InvalidException("Please enter number of 10 digit length send " + nextLine.length());
		//validate phone numbers of format "1234567890"
		Pattern p = Pattern.compile("\\d{10}");
		//=validating phone number with -, . or spaces
		Pattern p1 = Pattern.compile("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
		//validating phone number with extension length from 3 to 5
		Pattern p2 = Pattern.compile("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}\\s(x|(ext))\\d{3,5}");
		//validating phone number where area code is in braces ()
		Pattern p3 = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{4}");
		if(p.matcher(nextLine).matches())
			return true;
		else if(p1.matcher(nextLine).matches())
			return true;
		else if(p2.matcher(nextLine).matches())
			return true;
		else if(p3.matcher(nextLine).matches())
			return true;
		
			
		return false;
		
	}
}
