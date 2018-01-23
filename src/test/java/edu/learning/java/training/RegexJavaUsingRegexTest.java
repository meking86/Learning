package edu.learning.java.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.learning.java.exception.InvalidException;

public class RegexJavaUsingRegexTest {

	RegexJavaUsingRegex regexObj ;
	
	
	@Before
	public void  init() {
		regexObj = new RegexJavaUsingRegex();
	}
	
	//Covering all Positive case 
		@Test
		public void testValidatPhoneRegularFormat() {
			boolean bool = regexObj.validatPhone("0123456789");
			assertEquals(true, bool);
		}
		
		@Test
		public void testValidatPhonewithDashSpace() {
			boolean bool = regexObj.validatPhone("012-345-6789");
			assertEquals(true, bool);
			boolean bool_1 = regexObj.validatPhone("012 345 6789");
			assertEquals(true, bool_1);
		}
		
		@Test
		public void testValidatPhonewithExtension() {
			boolean bool = regexObj.validatPhone("012-345-6789 x1234");
			assertEquals(true, bool);
			boolean bool_1 = regexObj.validatPhone("012-345-6789 ext1234");
			assertEquals(true, bool_1);
		}
		
		@Test
		public void testValidatPhonewithBraces() {
			boolean bool = regexObj.validatPhone("(012)345-6789");
			assertEquals(true, bool);
		}
		
		@Test(expected=InvalidException.class)
		public void testInvalidPhoneNumber() {
			regexObj.validatPhone("(012)34");
		}

}
