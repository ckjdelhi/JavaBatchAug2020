package com.exceptionHandling;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int age=15;
		try {
			if(age>18) {
				System.out.println("valid Age");
			}else {
				throw new InvalidAgeException();
			}
		}catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
