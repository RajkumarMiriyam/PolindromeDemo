/**
 * 
 */
package com.demo.service;

import java.util.Scanner;

/**
 * @author RXM174
 *
 */
public class PolindromeDemo {
	
	public static PolindromeDemo polindromeDemo = new PolindromeDemo();

	public static void main(String[] args) {
		
		System.out.print("Please enter some name here: ");

		try (Scanner input = new Scanner(System.in)) {

			String givenName = "";
			String reverseName = "";

			if (input.hasNext()) {

				givenName = input.next();

				System.out.println("You have entered: "+givenName);

			}

			if (null != givenName) {

				reverseName = polindromeDemo.reverseString(givenName);
				System.out.println("Given Name in reverse:" + reverseName);
			}

			boolean isPolndrm = polindromeDemo.isPolindrome(givenName);

			if (isPolndrm) {
				System.out.println("Given Name is Palindrome");
			} else {
				System.out.println("Given Name is not Palindrome");
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public String reverseString(String input) {

		StringBuffer inputString = new StringBuffer();

		inputString.append(input);

		return inputString.reverse().toString();

	}

	public boolean isPolindrome(String givenName) {

		boolean isPolndrm = false;
		String reverseName = polindromeDemo.reverseString(givenName);

		if (givenName.equalsIgnoreCase(reverseName)) {
			isPolndrm = true;
		}
		
		return isPolndrm;
	}

}
