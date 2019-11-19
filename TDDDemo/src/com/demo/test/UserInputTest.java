/**
 * 
 */
package com.demo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demo.service.PolindromeDemo;


/**
 * @author RXM174
 *
 */
public class UserInputTest {
	
	PolindromeDemo polindromeDemo = null;
	
	public void test() {
		fail("Not started");
	}
	
	@Before
	public void setUp() throws Exception{
		 polindromeDemo = new PolindromeDemo();
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void stringDemoTest() {
		
		assertNotNull(polindromeDemo);
		
	}
	
	@Test
    public void testReverseStringTrue() {
        assertEquals("tobor", polindromeDemo.reverseString("robot"));
    }
	
	@Test
    public void testReverseStringFalse() {
        assertNotEquals("NTTDATA", polindromeDemo.reverseString("NTTDATA"));
    }
	
	@Test
    public void testPolindromeTrue() {
        assertTrue(polindromeDemo.isPolindrome("TEBET"));
    }

	@Test
    public void testPolindromeFalse() {
        assertFalse(polindromeDemo.isPolindrome("NTTDATA"));
    }
	

}
