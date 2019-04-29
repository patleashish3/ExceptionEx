package com.exception;

public class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}

class EmployeeTest {
	static void employeeage(int age) throws MyOwnException {
		if (age < 0)
			throw new MyOwnException("Age cant be less than zero");
		else
			System.out.println("Input is valid!!");
	}

	public static void main(String[] args) {
		try {
			employeeage(-2);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
	}
}
