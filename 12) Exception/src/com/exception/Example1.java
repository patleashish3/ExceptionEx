package com.exception;

public class Example1 {
	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 0;
			num2 = 62 / num1;
			System.out.println("Try block msg");
		} catch (ArithmeticException e) {
			System.out.println("Error: Don't divide a number by zero");
		}
		System.out.println("I am out of try-catch block in java");
	}

}
