package edu.learning.java.learning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class FibonacciTest extends TestCase {

	Fibonacci fib ;
	

	@Before
	public void init() {
		fib = new Fibonacci();
	}
	
	@Test()
	public void testFibonacciNumber() throws InterruptedException {
		int i = fib.fibonacciNumber(5);
		assertNotNull(i);
		assertEquals(8, i);
	}

}
