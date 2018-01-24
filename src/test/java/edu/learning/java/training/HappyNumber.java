package edu.learning.java.training;

import java.util.Scanner;

/***
 * 
 * @author kalai
 *Here we are defining happy number as squre and sum each decimal in a given decimal repetitive until decimal converts to single digit 
 *once its single Digit check if it equal 1 then its Happy Number all other are Not an Happy Number 
 */
public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber happyNumObj = new HappyNumber();
		System.out.println("Enter Number to check \" Happy \" ");
		Scanner sc = new Scanner(System.in);
		System.out.println(happyNumObj.validateHappy(sc.nextInt()));
	}

	public String validateHappy(int nextInt) {
		int tmp = nextInt;
		//System.out.println("Everytime i change " + nextInt);
		int add = 0;
		while(tmp!=0){
			
			//System.out.println(" (tmp%10) " + (tmp%10));
			add += (tmp%10)*(tmp%10);
			
			tmp = tmp/10;
		}
		System.out.println("add  " + add );
		if(add/10!=0){
			
			validateHappy(add);
		}
		
		if(add==1)
		return "I am a Happy Number";
		else
		return "I am NOt a Happy Number";
	}
}
