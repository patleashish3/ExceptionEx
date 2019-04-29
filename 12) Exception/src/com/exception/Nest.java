package com.exception;

public class Nest {
	public static void main(String[] args) {
		// Outer try block
		try {
			// inner try block1
			try {
				System.out.println("Inside block 1");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArithmeticException e1) {
				System.out.println("Exception: e1");
			}
			// inner try block2
			try {
				System.out.println("Inside block 1");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception:e2");
			}
			System.out.println("Just other ststement");
		}/* catch (ArithmeticException e3) {
			System.out.println("ArithmeticException");
			System.out.println("Inside parent try catch block");
		}*/ catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement..");
	}

}
