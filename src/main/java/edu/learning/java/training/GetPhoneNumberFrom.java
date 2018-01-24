package edu.learning.java.training;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetPhoneNumberFrom {

	static List<String> list = new LinkedList();
	public static void main(String[] args) {
		String s  = "qweqwe1234567890qweqwe1011121314ggg(408) 708-8324asdasd408-784 8869";
		GetPhoneNumberFrom getPhoneNumFrom = new GetPhoneNumberFrom();
		getPhoneNumFrom.getPhoneNumber(s);
		for(String str : list){
			System.out.println("Phone " + str);
		}
	}

	public List<String> getPhoneNumber(String s) {
		
		Pattern p = Pattern.compile("\\d{10}");
		Pattern p1 = Pattern.compile("\\(\\d{3}\\)[-\\s\\.]\\d{3}[-\\s\\.]\\d{4}");
		Matcher match  = p.matcher(s);
		Matcher match1  = p1.matcher(s);
		
		 while (match.find()) {
		        System.out.print("Start index: " + match.start());
		        System.out.print(" End index: " + match.end());
		        System.out.println(" Found: " + match.group());
		        list.add(match.group());
		    }
		 
		 while (match1.find()) {
		        System.out.print("Start index: " + match1.start());
		        System.out.print(" End index: " + match1.end());
		        System.out.println(" Found: " + match1.group());
		        list.add(match1.group());
		    }
		
		return list;
		// TODO Auto-generated method stub
		
	}
}
