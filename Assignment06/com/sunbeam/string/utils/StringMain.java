package com.sunbeam.string.utils;

import java.util.Scanner;

public class StringMain {
	public static void main(String[] args) {
		StringUtils s = new StringUtils();
		System.out.print("Enter string: ");
		StringBuffer str = new StringBuffer(new Scanner(System.in).next());
		System.out.println("Original String: " + s.setGetStr(str));
		StringBuffer rev = s.reversedString(str);
		System.out.println("Reversed String: " + rev);
		System.out.println("Pallindrome: " + s.checkPallindrome(str));
		System.out.println("Equals: " + s.equals(s.reversedString(str)));
		System.out.println("toString: " + (str.toString().equals(rev.toString())));
	}
}
