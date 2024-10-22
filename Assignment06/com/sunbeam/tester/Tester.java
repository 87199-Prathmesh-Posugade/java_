package com.sunbeam.tester;

import java.util.Scanner;
import com.sunbeam.exception.ExceptionLineTooLong;

public class Tester {
	public static void main(String[] args) {
		System.out.print("Enter String: ");		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			if (s.length() > 80) {
				throw new ExceptionLineTooLong("String lenghth should be less than 80 :(");
			}			
			System.out.println("No exception occured :)");
		}
		catch (ExceptionLineTooLong o) {
			o.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("Resource closed :)");
		}
		System.out.println("Program terminated :)");
	}
}
