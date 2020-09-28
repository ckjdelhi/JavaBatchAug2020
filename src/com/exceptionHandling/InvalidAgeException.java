package com.exceptionHandling;

public class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;
	/*public InvalidAgeException(String message) {
		super(message);
	}*/
	
	@Override
	public String getMessage() {
       return "Invalid Age";
    }
}
