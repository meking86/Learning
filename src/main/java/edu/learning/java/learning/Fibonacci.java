package edu.learning.java.learning;

public class Fibonacci {
	
	public Fibonacci() {
		System.out.println("Initializing ");
	}

	
	public int fibonacciNumber(int i) {
		int total = 0;
		
		if(i==1||i==0)
			return 1;
		
		return total += fibonacciNumber(i-1)+fibonacciNumber(i-2);
	}
	
	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		int val = obj.fibonacciNumber(6);
		System.out.println("Fib " + val);
	}
}
